package MadLibs;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an adjective");
        String val1 = input.nextLine();
        System.out.println("Enter a noun");
        String val2 = input.nextLine();
        System.out.println("Enter a noun(plural)");
        String val3 = input.nextLine();
        System.out.println("Enter a noun");
        String val4 = input.nextLine();
        System.out.println("Enter a verb ending in 'ed'");
        String val5 = input.nextLine();
        System.out.println(String.format("There was an %s woman who lived in a/an %s.",val1,val2));
        System.out.println(String.format("She had so many %s she didn't know what to do.",val3));
        System.out.println(String.format("She gave them some broth without any %s.",val4));
        System.out.println(String.format("She %s them all soundly and put them to bed.",val5));
    }
}
