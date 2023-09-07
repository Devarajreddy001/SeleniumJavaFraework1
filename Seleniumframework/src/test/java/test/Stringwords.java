package test;

public class Stringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d= "greeks for greeks";
	
		String[]  str = d.split(" ");
		
		String noSpaceStr = d.replaceAll("\\s","");
		
	String D ="";

		for ( String k:str) 
		{
			D= D+k;
		  
			
		}
		
		if(D.equals(noSpaceStr)) {
			
			System.out.println("This is palindrome");
		}
		
		else {
			System.out.println("This is not palindrome");
		}
		
		
		System.out.println(D);
		
	}
	
	
		
	

	

}
