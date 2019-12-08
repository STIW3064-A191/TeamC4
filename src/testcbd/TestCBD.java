package testcbd;

/* Java program to remove all characters in a string except alphabets */
import java.util.*;
import java.util.Scanner;
public class TestCBD
{
public static void main(String args[])
{
    Scanner x = new Scanner(System.in);
        // TODO code application logic here
        String FinalResult="";
        System.out.println("Enter the character");
        String input = x. nextLine();
        //String Input = "12345yuj!@#$%FGJ[poiu";
        for(int i=0; i<input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                FinalResult=FinalResult+input.charAt(i);
            }
    }
        System.out.println(FinalResult);
    
}
}