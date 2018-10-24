import java.lang.*;

import java.util.Scanner;

public class Input_Scanner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String firstName;
        String secondName;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        double average = (num1+num2)/2.0;

        sc.nextLine(); // This line is given to take away the new line character created in above statements.

        System.out.println("Enter your First name:");
        firstName = sc.nextLine();
        System.out.println("Enter your Second name:");
        secondName = sc.nextLine();

        System.out.println("Name: "+firstName+" "+secondName);
        System.out.println("Average: "+average);
    }
}
