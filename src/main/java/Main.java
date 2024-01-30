

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
	}
	public boolean isPalindrome(String sWord){
  sWord = onlyLetters(sWord); 
  sWord = noSpaces(sWord);
  sWord = sWord.toLowerCase();
  if(sWord.equals(reVerse(sWord)))
  return true;
  else
  return false;
}

public String noSpaces(String sWord){
 String spaceLess = "";
 for(int i = 0; i < sWord.length(); i++){
  if(sWord.substring(i, i+1).equals(" ") == false)
  spaceLess = spaceLess + sWord.substring(i, i+1);
 }
  return spaceLess;
}
public String onlyLetters(String sString){
 String letter = "";
 for(int i = 0; i < sString.length(); i++){
  if(Character.isLetter(sString.charAt(i)))
   letter = letter + sString.substring(i, i+1);
 }
 return letter;
}

public String reVerse(String sWord){
 String rev = "";
 for(int i = sWord.length(); i > 0; i--){
  rev = rev + sWord.substring(i-1, i); 
 }
  return rev;
}
 

}

