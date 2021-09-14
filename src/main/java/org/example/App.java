/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    static final String PASSWORD = "abc$123";

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the password? " );
        String guess = scan.nextLine();

        if (guess.equals(PASSWORD))
            System.out.println( "Welcome! ");
        else
            System.out.println( "I don't know you." );
    }
}
