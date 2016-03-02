import java.util.Scanner;

public class CountVowelsAndConsonants {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    int vowel = 0, consonant = 0;
    
    for (int i = 0; i < s.length(); i++){
      char letter = s.charAt(i);
      if ("AEIOUaeiou".indexOf(letter) >= 0)
        vowel++;
      else if (s.charAt(i) != ' ')
        consonant++;  
    } // for i
    
    System.out.println("The number of vowels is " + vowel);
    System.out.println("The number of consonants is " + consonant);
  } // main 
} // CountVowelsAndConsonants
