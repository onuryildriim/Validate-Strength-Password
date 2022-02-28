import java.util.Scanner;

public class SecurePassword {

	public static boolean securePassword(String pass) {
	   
		boolean isDigit = false;
		boolean isLowerCase = false;
		boolean isUpperCase = false;
		boolean isSpecialChar = false;
		char[] specialChar = {'!','@','#','$','%','^','*','(',')','_','&'};
		
		
		if(pass.length() < 6) {
			return false;
        }
	    
		char[] chars = pass.toCharArray();
		
		for(char c : chars){
			for(char cC : specialChar) {
				if(cC == c) {
					isSpecialChar = true;
				}
			}
			
	         if(Character.isDigit(c)){
	        	isDigit = true;
	           
	         }
	         if(Character.isUpperCase(c)) {
	        		isLowerCase = true;
		           
	         }
	         if(Character.isLowerCase(c)) {
	        	 isUpperCase = true;
		            
	         }
	     
	      }	

		if (isDigit && isLowerCase && isUpperCase && isSpecialChar) {
			return true;
		} else {
			return false;
		}
		
	}
	 
	public static void main(String[] args) {
		String pass;
		Scanner sc = new Scanner(System.in);
		 pass = sc.nextLine();
		 System.out.println(pass);
		 
		 System.out.println(SecurePassword.securePassword(pass));
	}

}
