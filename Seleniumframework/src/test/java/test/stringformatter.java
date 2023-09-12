package test;

public class stringformatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A=  "dev";
		
		String b= "";
		int e=0;
		
		for (int c= A.length()-1; c>=0; c--) 
		{
			b= b+A.charAt(c);
		}
	   
		System.out.println(b);
	}

}
