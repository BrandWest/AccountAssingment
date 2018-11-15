// Brandon West
// 991179860
// Java Programming PROG23199 Assignment 1
// ATM Program Test Account Class
package application;

import java.util.Scanner; // import for user input

public class TestAccount // class for TestAccount
{
	//main method
	public static void main ( String[] args )
	{
		// variables for TestAccount class
		char selection;	// used to store user selection
		int account = 0; // stores account number selection

		// Objects for class Account
		Account one = new Account();
		Account two = new Account();
		// Scanner object for user input
		Scanner input = new Scanner ( System.in ); // Scanner object for input from user

		mainMenu( ); // main method function for options
		selection = input.next().charAt(0); // user input for Menu

		one.setAccount ( 1 );// sets account 1 using mutator set method
		two.setAccount ( 2 );// sets account 2 using mutator set method

		while ( selection != '6' )	// while loop for choice selection
		{
			switch ( selection ) // switch statement for user
			{
				case '1': // setting balance case
					System.out.print( "Which account would you like to set the balance? " );
					account = input.nextInt( ); // user input stored in account

					if ( account == 1) // account 1 selection
					{
						System.out.print ( "Please input the account balance for Account 1: $" );
						one.setBalance ( input.nextDouble ( ) ); // set balance method call for object one
					}// end of if for account 1
					else if ( account == 2 ) // account 2 selection
					{
						System.out.print ( "Pleast input the account balance for Account 2: $" );
						two.setBalance ( input.nextDouble ( ) ); // set balance method call for object 2
					}// end of else if for account 2
					else // invalid option error
						System.out.println ( "Invalid option." );
					break; // end of case 1

				case '2': // view balance case
					System.out.print( "Which account would you like to view the balance? " );
					account = input.nextInt( ); // selection of account by user

					if ( account == 1 ) // account 1 selection
							System.out.printf ( "The Account balance for Account 1 is: $%.2f.\n", one.getBalance( ) ); // print statement for Account 1
					else if ( account == 2 ) // account 2 selection
						System.out.printf ( "The Account balance for Account 2 is: $%.2f.\n", two.getBalance( ) ); // print statement for Account 2
					else
						System.out.println ( "Invalid option." ); // error input
					break; // end of account balance case

				case '3': // account withdraw case
					System.out.print("Please select the acount you'd like to withdraw from: ");
					account = input.nextInt(); // user input stored in account

					if ( account == 1 )// account one selection
					{
						System.out.print( "How much would you like to withdraw? " );
						one.withdraw ( input.nextDouble ( ) ); // method call for withdraw, money argument
					}// end of if for account 1
					else if ( account == 2 ) // account 2 selection
					{
						System.out.print ( "How much would you like to withdraw? ");
						two.withdraw ( input.nextDouble ( ) ); // method call for withdraw, money argument
					}// end of else if account 2
					else
						System.out.println ( "Invalid option." ); //user input invalid option
					break;// end of withdraw case

				case '4': // account deposit case
					System.out.print ( "Please select the account to deposit money into: " );
					account = input.nextInt( );// user input stored in account

					if ( account == 1 ) // account 1 selection
					{
						System.out.print( "How much would you like to deposit: $" );
						one.deposit ( input.nextDouble ( ) ); // method call for deposit, money used as argument
					}// end of if for account 1
					else if ( account == 2 ) // account 2 selection
					{
						System.out.print( "How much would you like to deposit: $ " );
						two.deposit ( input.nextDouble ( ) ); // deposit method, money argument
					} // end of else if for account 2
					else
						System.out.println ( "Invalid selection." ); // error for user input
					break; // end of deposit case

				case '5': // account interest rate calculator case
					System.out.print( "Which account would you like to access for interest accumulation results? ");
					account = input.nextInt( ); // user input for account, stored in account

					if ( account == 1 ) // account 1 selection
						one.getMonthlyInterest ( );// get monthly interest call
					else if ( account == 2 ) // account 2 selection
						two.getMonthlyInterest ( );// get monthly interest call
					else
						System.out.println( "Invalid option." ); // error for invalid input from user
					break; // end of account interest rate calculator

				case '6': // exit case
					System.out.println ( "Goodbye." );
					break; // end of exit case

				default: // default case for errors
					System.out.println ( "Invalid option. Try again." );
			}// end of switch statement

			mainMenu(); // main menu method call
			selection = input.next().charAt(0); // user input stored in selection
		} // end of while loop

		input.close(); // close input from Scanner

	} // end of main

	// main menu method
	public static void mainMenu ( ) // main menu method
	{
		System.out.println( "Menu: ");
		System.out.println( "1: Set Accout Balance");
		System.out.println( "2: Account Balance");
		System.out.println( "3: Withdraw Money");
		System.out.println( "4: Deposit Money");
		System.out.println( "5: Intrest Rate Calculator");
		System.out.println( "6: Exit");
		System.out.print( "Selection: " );
	} // end of main menu method
} // end of class
