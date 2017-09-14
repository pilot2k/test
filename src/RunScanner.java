package by.bsu.console;
import java.util.Random;
import java.util.Scanner;

public class RunScanner
{
    public static void main(String[ ] args)
    {
        String PASSWORD = "password";
        String pass;
        System.out.print("Enter your name and press <Enter>: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name);

        do
        {
            System.out.print("Now provide your password and hit <Enter>: ");
            pass = scan.next();
        } while (!pass.equals(PASSWORD));


        System.out.println("Printing command-line arguments in reverse order:");

        for (int i = args.length - 1; i >= 0; i--)
        {
            System.out.println("Argument " + i + " -> " + args[i]);
        }

        System.out.print("How many random integers you want? : ");
        Integer iter = scan.nextInt();
        System.out.println("Randomization is ON");
        Random x = new Random();
        for ( int i = 1; i <= iter; i++)
        {
            System.out.print(x.nextInt() + " ");
        }
        scan.close();
        System.out.println();
        System.out.println("(c) Dmitry Antonov");
    }
}