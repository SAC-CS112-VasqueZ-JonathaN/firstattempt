import java.util.Scanner;

public class forloopexercise 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int userinput;
		int compinput;
		
		for (int round = 1; round<4; round++)
		{
			compinput = 0 + (int) ( Math.random() * 10 );
			
			System.out.println( "Please enter a number between 1 and 10: ");
			userinput = input.nextInt();
			
			System.out.printf( "Random number is %d" , compinput );
			
			if ( userinput < compinput )
			{
				System.out.printf( "%d is less than %d" , userinput, compinput, "Try again!");
			}
			else if ( userinput > compinput )
			{
				System.out.printf( "%d is greater than %d" ,userinput, compinput, "Try again!");
			}
			else 
			{
				System.out.printf( "Your number matched!");
			}
		}
		System.out.println( "Thanks for playing! Goodbye!");
	}

}
