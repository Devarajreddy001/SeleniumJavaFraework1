package test;

public class Exceptionhandling {

	public static void demo() throws Exception {
		
	
	System.out.println("Inside catch block");
	int i=1/0;
	System.out.println("Mesage is");
	System.out.println("cause");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				demo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	

}
