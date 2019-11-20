package assignment;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner scanner = new Scanner(System.in);
		double assessment =0.0;
		double exams = 0.0;
		double fees = 100;
		double total;
	
		System.out.println("Please enter your Assessment score");
		assessment = scanner.nextDouble();
		
		
		System.out.println("Please enter your Exams score");
		exams = scanner.nextDouble();
		
	    System.out.println("Please enter amount paid ");
	    fees = scanner.nextDouble();
	    
	    Boolean certificate = false;  
	    Boolean req1= assessment >= 15;
	    Boolean req2= exams >= 25;
	    
	    total = assessment + exams;
	    System.out.println(total);
	    if(req1) {
	    	System.out.println("Passed assessment");
	    }
	    	else {
	    		System.out.println("Failed assessment");
	    	}
	    if(req2) {
	    	System.out.println("Passed exams");
	    }
	    else {
	    	System.out.println("Failed exams");
	    }
	    if(req1 && req2 && fees >= 100) {
	    	certificate = true;
	    System.out.println("Passed with a Certificate");
	    }
	    else if(exams == 25 && assessment == 14 ||(exams == 24 && assessment == 15)) {
	    	System.out.println("Condoned");
	    }
	    else {
	    	System.out.println("Failed, also Repeated");
	    	
	    }
	    
	  
    	}
	    
	    

	}


