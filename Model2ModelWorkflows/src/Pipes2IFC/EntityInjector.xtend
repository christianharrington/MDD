package Pipes2IFC

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import general.MalformedIFCXMLException

class EntityInjector {
	/*
	def static void main(String[] args) {
		println("Start")
		EntityInjector::inject("bin/output.ifcxml", "bin/input.ifcxml")
		println("Done")
	}*/
	
	def static inject(String mainPath, String inputPath) {
		val BufferedReader mainBr = new BufferedReader(new InputStreamReader(new FileInputStream(mainPath)))
		val BufferedReader inputBr = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)))
		val BufferedWriter mainWr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bin/output1.ifcxml")))
		
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
		if (mainLine == null) throw new MalformedIFCXMLException("File " + mainPath + " does not have a " + searchString + " tag")
		
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