package ResearchClass;

import java.util.Random;
import java.util.Scanner;

public class ResearchClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand1 = new Random();
        Random rand2 = new Random(146);
        Random rand3 = new Random(146);
        System.out.println("Examples of the random class");
        System.out.println("new Random() creates a new random generator without seed.");
        System.out.println("Calling .nextInt() will create a random int like: "+rand1.nextInt());
        System.out.println("Calling .nextInt() will the next random int like: "+rand1.nextInt());
        System.out.println("and the next: "+rand1.nextInt());
        System.out.println("and the next: "+rand1.nextInt());
        System.out.println("new Random(146) creates a new random generator with seed(long value).");
        System.out.println("This makes the same pattern as .nextInt is called");
        System.out.println("Rand2 nextInt is: "+ rand2.nextInt());
        System.out.println("and the next: "+rand2.nextInt());
        System.out.println("and the next: "+rand2.nextInt());
        System.out.println("Now with rand3 and the same seed");
        System.out.println("Rand3 nextInt is: "+ rand3.nextInt());
        System.out.println("and the next: "+rand3.nextInt());
        System.out.println("and the next: "+rand3.nextInt());
        System.out.println("nextDouble creates a pseudorandom between 0 and 1 like: "+rand3.nextDouble());
        System.out.println("Try it your self by inputting a seed value or -1 to quit");
        long seed = input.nextLong();
        while(seed > 0){
            Random rand4 = new Random(seed);
            for(int i = 0;i<5;i++){
                System.out.println("next random is "+rand4.nextInt());
            }
            System.out.println("Try another -1 to quit");
            seed = input.nextLong();
        }
        System.out.println("We can also get streams with a size so enter a size(long) or -1 to quit");
        seed = input.nextLong();
        while(seed > 0){
            Random rand5 = new Random(125);
            long sum = rand5.longs(seed).sum();
            System.out.println("The sum of your stream of length "+seed+" is "+sum);
            System.out.println("Try another -1 to quit");
            seed = input.nextLong();
        }
    }
}
