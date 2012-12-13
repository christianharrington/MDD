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
	var String input
	var String outputPath
	
	def getSourcePath() { sourcePath }
	def setSourcePath(String path) { sourcePath = path }

	def getInput() { input }
	def setInput(String path) { input = path }
	
	def getOutputPath() { outputPath }
	def setOutputPath(String path) { outputPath = path }
	
	
	
	override invoke(IWorkflowContext ctx) {
		val BufferedReader sourceBr = new BufferedReader(new InputStreamReader(new FileInputStream(sourcePath)))
		val BufferedWriter outputWr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath)))
		
		val searchString = "</_1:uos>"
		var sourceLine = sourceBr.readLine()
		var trimLine = sourceLine.trim
		while (sourceLine != null && !trimLine.startsWith(searchString)) {
			outputWr.write(sourceLine)
			outputWr.newLine()
			sourceLine = sourceBr.readLine()
			if (sourceLine != null) trimLine = sourceLine.trim
		}
		
		// sourceLine now points to uos-line; if null, an exception is thrown
		if (sourceLine == null) throw new MalformedIFCXMLException("File " + sourcePath + " does not have a " + searchString + " tag")
		
		outputWr.write(input)
		
		while (sourceLine != null) {
			outputWr.write(sourceLine)
			outputWr.newLine()
			sourceLine = sourceBr.readLine()
		}
		
		sourceBr.close
		outputWr.close
	}
	
}