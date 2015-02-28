package exceptionHandler;
//import java.util.Arrays;

public class Repair extends Exception {
	private int errorno;
	private String errormsg;
	
	public Repair() {
		super();
		printmyproblem();
	}
	
	public Repair(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public Repair(int errorno) {
		super();
		this.errorno = errorno;
		printmyproblem();
	}
	
	public Repair(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}
	
	public int getErrorno() {
		return errorno;
	}
	
	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}
	
	public String getErrormsg() {
		return errormsg;
	}
	
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	
	public void printmyproblem() {
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg); 
	}

	public String fixProblemReadFromConsole()
	{
		String a = "/Users/mynguyen5194/Desktop/abc.txt";
		System.out.println("got here --> fixProblemReadFromConsole");
		return a;
	}
}
