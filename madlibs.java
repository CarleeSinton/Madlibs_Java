import java.util.*;
import java.util.Scanner;
public class madlibs
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the madlib program! Please enter information below.");

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Noun: ");
        String Noun1 = scanObject.next();
        System.out.println("Adjective: ");
        String Adjective1 = scanObject.next();
        System.out.println("Another Adjective: ");
        String Adjective2 = scanObject.next();
        System.out.println("Number: ");
        String Number1 = scanObject.next();
        System.out.println("Verb ending in -ed: ");
        String Verb1 = scanObject.next();
        System.out.println("Job: ");
        String Job1 = scanObject.next();

        System.out.println("Here is your madlib: ");


        System.out.println(Noun1+" for sale! "+Noun1+" for sale! Come get some "+Adjective1+" and "+Adjective2+" "+Noun1+" here for only "+Number1+" dollar(s). It was fresh "+Verb1+" this morning. Proceeds will go towards my school savings. I want to be a "+Job1+" when I grow up!");
    }
}
