import java.io.*;
//import java.io.BufferedReader;
import java.io.IOException;

public class Echo {

	public static void main(String[] args) throws IOException {
		// Defines the standard input stream
		BufferedReader stdin = new BufferedReader
				(new InputStreamReader(System.in));
		String message; // Creates a variable called message for input
		System.out.print("Enter the message : ");
		System.out.flush(); //empties buffer, before you input text
		message = stdin.readLine();
		System.out.print("You ");
		System.out.println("entered : "+ message);
		
		// TODO Auto-generated method stub

	}//method main

}//end of class Echo
