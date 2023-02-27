package Grading;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade by percent or -1 to quit");
        int grade = input.nextInt();
        while(grade > 0){
            System.out.println(getGrade(grade));
            grade = input.nextInt();
        }
    }

    private static String getGrade(int grade){
        if(grade > 92){
            return "Letter grade is: A";
        } else if (grade <= 92 && grade > 90) {
            return "Letter grade is: A-";
        }else if (grade <= 94 && grade >= 91) {
            return "Letter grade is: B+";
        }else if (grade <= 90 && grade >= 87) {
            return "Letter grade is: B";
        }else if (grade <= 86 && grade >= 81) {
            return "Letter grade is: B-";
        }else if (grade <= 80 && grade >= 77) {
            return "Letter grade is: C+";
        }else if (grade <= 76 && grade >= 73) {
            return "Letter grade is: C";
        }else if (grade <= 72 && grade >= 70) {
            return "Letter grade is: C-";
        }else if (grade <= 69 && grade >= 65) {
            return "Letter grade is: D";
        }else{
            return "Letter grade is: F";
        }
    }
}
