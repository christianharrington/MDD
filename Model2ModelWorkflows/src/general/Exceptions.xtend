package general

import java.lang.Exception

class InvalidIFCException extends Exception {
	new() {
		super()
	}
	
	new(String message) {
		super(message)
	}
	
	new(String message, Throwable cause) {
		super(message, cause)
	}
	
	new(Throwable cause) {
		super(cause)
	}
}

class InvalidEntityException extends Exception {
	new() {
		super()
	}
	
	new(String message) {
		super(message)
	}
	
	new(String message, Throwable cause) {
		super(message, cause)
	}
	
	new(Throwable cause) {
		super(cause)
	}
}

class MalformedIFCXMLException extends Exception {
	new() {
		super()
	}
	
	new(String message) {
		super(message)
	}
	
	new(String message, Throwable cause) {
		super(message, cause)
	}
	
	new(Throwable cause) {
		super(cause)
	}
}