package org.tech;


import java.util.Scanner;

class PangramCheck {
 public boolean isPangram(String input) {
     boolean[] alphabetPresent = new boolean[26];
     int count = 0;

     input = input.toLowerCase(); 

     for (char c : input.toCharArray()) {
         if (c >= 'a' && c <= 'z') {
             int index = c - 'a'; 
             if (!alphabetPresent[index]) { 
                 alphabetPresent[index] = true;
                 count++;
             }
         }
         if (count == 26) {
             return true; 
         }
     }
     return false;
 }
}
public class StringPanagram {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        PangramCheck checker = new PangramCheck();
        boolean result = checker.isPangram(sentence);

        if (result) {
            System.out.println("The given sentence is a pangram.");
        } else {
            System.out.println("The given sentence is NOT a pangram.");
        }
    }
}
