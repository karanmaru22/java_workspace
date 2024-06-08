package java_workspace_task;
import java.util.Scanner;

public class VowelorConsonant 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Input an alphabet: ");
		char ch = scanner.next().toLowerCase().charAt(0);
		
		if (Character.isLetter(ch)) { 
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Input letter is Vowel"); 
				}
			else
			{ System.out.println("Input letter is Consonant");
			}
			}
		else
		{ System.out.println("Error: Input is not a letter or is a string of length > 1");
		}
		}
	
	}


