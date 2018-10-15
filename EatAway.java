/* EatAway.java:  Uses nested-loops, but in separate methods, to reduce
 * a given String from both ends, two total characters at a time.
 *
 * Ex:  String
 *      trin
 *      ri
 *
 * Author:  L. McCann
 */

import java.util.Scanner;

public class EatAway {

    public static void main (String [] args) 
    {
        Scanner keyboard = new Scanner (System.in);
        
        

        System.out.print("Enter your word: ");
        String word = keyboard.nextLine();
       System.out.printf("%s\n", word);

        eatItUp(word);
    } // main

            // eatItUp(word):  Creates output in which the given
            // word is displayed, then the word without its first and last
            // characters is displayed, etc.  The final string printed
            // should have 1 or 2 characters; no less, no more.

    public static void eatItUp(String word)
    {
      String newWord = word;
      int i = 0;
      
      for(i = 0; i < word.length(); i++) {
        newWord = subtask(newWord);
        System.out.println(newWord);
      }




    }
    
    public static String subtask(String word) {
    
      String newWord = "";
      int i;
      for(i = 1; i < word.length() - 1; i++) {
        newWord = newWord + word.charAt(i);
      }
      return newWord;
    }
            // sub-task method of eatItUp() goes here!

} // EatAway