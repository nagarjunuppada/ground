package lcode_medium;


/*given a sentence with string and \
print words vertically*/


public class PrintWordsVertically {

	String input="how are you man youngster like us";
	  String[] words=input.split(" ");
	  int maxlength=maxLengthOfString();
	  int temp;
	  int sizeOfArray=words.length;
	  
	  public int maxLengthOfString() {
		  System.out.println();
		  for (int i = 0; i < words.length; i++) {
			  if (words[i].length()>maxlength) {
				maxlength=words[i].length();
			}
			
		}
		return maxlength;
		
	}
	  public void vertPrinter() {
	
		  
			for (int q = 0; q <maxlength ; q++) {
				
				for (int j = 0; j < sizeOfArray; j++) {
			try {
				System.out.print(words[j].charAt(q));
			} catch (Exception e) {
				System.out.print(" ");
			}
			  
			  //temp++;
			 
		}
				System.out.println(" ");}
		  
	}
	
	  
	public static void main(String[] args) {
		PrintWordsVertically pvp = new PrintWordsVertically();
		pvp.vertPrinter();
	}
  
}
