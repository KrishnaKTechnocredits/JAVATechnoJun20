package anshuKJun20;

import java.util.Scanner;


public class CharacterFrequency {
	static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
	 
	 CharacterFrequency characterfrequency = new CharacterFrequency();
	 System.out.println("How many names do you want to pass ? ");
	 int index = scanner.nextInt();
	 scanner.nextLine();
	 String[] input = new String[index];
	 
	 characterfrequency.setClientName(input);
	 characterfrequency.countFrequencyCharacter(input);
	 
 } 
	 void setClientName(String[] input)
	 {
		 for(int index=0; index<input.length;index++) {
			 System.out.println("Enter your name "+(index+1)+":");
			 input[index] = scanner.next();
		 }
	 }
	 
	void countFrequencyCharacter(String[] input) {
		int count=0;
		 System.out.println("Which charcter  do you want to count: ");
		 char ch = scanner.next().charAt(0);
		 for(int index=0; index<input.length;index++) {
			 String strtomatch =input[index];
			
			 for(int character=0;character<strtomatch.length();character++)
			 {
				 if(ch==strtomatch.charAt(character))
				 {
					 count++;
				 }
			 }
		}
		 System.out.println("Character you entered comes "+count+" times ");
	}
	  
	
  }

