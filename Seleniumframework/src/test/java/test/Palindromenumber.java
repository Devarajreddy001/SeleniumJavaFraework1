package test;

public class Palindromenumber {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "121";
		
		int b= a.length();
		
		String d = "";
		
		for (int c=b-1; c>=0; c--) 
		{
			d= d+a.charAt(c);
		}
		
		System.out.println(d);

	}

}
