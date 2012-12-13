package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.FileInputStream
import java.io.FileOutputStream
import general.MalformedIFCXMLException

class EntityInjector extends WorkflowComponentWithSlot {
	/*
	def static void main(String[] args) {
		println("Start")
		EntityInjector::inject("bin/output.ifcxml", "bin/input.ifcxml")
		println("Done")
	}*/
	
	var String sourcePath
	var String injectPath
	var String outputPath
	
	def getSourcePath() { sourcePath }
	def setSourcePath(String path) { sourcePath = path }

	def getInjectPath() { injectPath }
	def setInjectPath(String path) { injectPath = path }
	
	def getOutputPath() { outputPath }
	def setOutputPath(String path) { outputPath = path }
	
	override invoke(IWorkflowContext ctx) {
		val BufferedReader mainBr = new BufferedReader(new InputStreamReader(new FileInputStream(sourcePath)))
		val BufferedReader inputBr = new BufferedReader(new InputStreamReader(new FileInputStream(injectPath)))
		val BufferedWriter mainWr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)))
		
		val searchString = "</_1:uos>"
		var mainLine = mainBr.readLine()
		var trimLine = mainLine.trim
		while (!trimLine.startsWith(searchString)) {
			mainWr.write(mainLine)
			mainWr.newLine()
			mainLine = mainBr.readLine()
			trimLine = mainLine.trim
		}
		
		// mainLine now points to uos-line; if null, an exception is thrown
		if (mainLine == null) throw new MalformedIFCXMLException("File " + sourcePath + " does not have a " + searchString + " tag")
		
		var inputLine = inputBr.readLine
		while (inputLine != null) {
			mainWr.write(inputLine)
			mainWr.newLine()
			inputLine = inputBr.readLine
		}
		
		while (mainLine != null) {
			mainWr.write(mainLine)
			mainWr.newLine()
			mainLine = mainBr.readLine()
		}
		
		mainBr.close
		inputBr.close
		mainWr.close
	}
	
}