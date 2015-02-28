package exceptionHandler;
import java.io.*;

public class ProblemGenerator {
	private String fileName;
	
	ProblemGenerator() { }
	
	public ProblemGenerator(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean openFile() throws Repair
	{
		FileInputStream a1 = null;
		boolean flag = false;
		try {
			a1 = new FileInputStream(fileName);
			System.out.println("Now it is done!");
			flag = true;
			
		}
		catch(FileNotFoundException f)
		{
			throw new Repair();
		}
		finally 
		{			
			
		}	
		
		return flag;	
	}	
}
