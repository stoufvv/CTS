package ro.ase.cts.g1099.lab1.main.exceptions;

public class InsufficientFundsException extends Exception{ //if we want to make it an exception it has to extend the basic Exception class
//2 types of exceptions checked(runtime) can be thrown just like that and unchecked have to be surrounded w try catch
	
	public InsufficientFundsException() {
		
	}
	
	public InsufficientFundsException(String msg) {
		//this.msg =   cannot do this cuz it s not public, we want to do with with inheritance from parent to child
		super(msg);//this is how you control which constructor you call 
	}
	
}
