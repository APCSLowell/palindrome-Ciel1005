import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String sWord)
{
  sWord = onlyLetters(sWord); 
  sWord = sWord.toLowerCase();
  if(word.equals(reVerse(sWord)))
  return true;
  else
  return false;
}
public String reVerse(String sWord)
{
    String rev = "";
 for(int i = sWord.length(); i > 0; i--){
  rev = rev + sWord.substring(i-1, i); 
 }
  return rev;
}
  
  public String onlyLetters(String sString)
  {
 String letter = "";
 for(int i = 0; i < sString.length(); i++){
  if(Character.isLetter(sString.charAt(i)))
   letter = letter + sString.substring(i, i+1);
 }
 return letter;
}
