package com.company;

import java.util.Scanner;

/*ElizaChats is a online chat room that supports individuals that need emotional support. Create an application that

        Starts with a greeting message
        Asks the user for their name, intakes the user name using Scanner class.
        Prompts the user to tell Eliza how their day has been
        Lastly prints all of the user's input at the end of the conversation.*/
public class Create {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        String name,day,response,end;

        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        name=input.nextLine();
        System.out.println("Nice to meet you, Hannah Snow, How has your day been?");
        day=input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that "+day);
        response=input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println("Here are your responses: "+name+", "+ day+", "+response+", ");
    }
}
