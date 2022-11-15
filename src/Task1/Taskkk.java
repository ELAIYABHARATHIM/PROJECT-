package Task1;

public class Taskkk {
	
	public static void main(String[] args) {
		
		String s= "123456789Elaiyabharathi";
		
		String alph = "";
		
		String oddN ="";
		
		String EvenN ="";
		
		char[] character = s.toCharArray();
		
		for(char z: character) {
			if(Character.isAlphabetic(z)) {
				alph= alph+z;
				
			}
	
			
			
			else if(Character.isDigit(z)){
				if(z%2==0) {
					EvenN = EvenN+z;
				}
				else
				{
					oddN=oddN+z;
				}
				
			}
		}
		
		System.out.println(oddN);
		System.out.println(EvenN);
		System.out.println(alph);
	}

}
