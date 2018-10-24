import java.lang.*;

import javax.swing.*;

public class Input_JOptionPane
{
    public static void main(String args[])
    {
        int num1,num2;
        String firstName,secondName;

        firstName = JOptionPane.showInputDialog("Enter first name: ");
        secondName = JOptionPane.showInputDialog("Enter second name: ");

        JOptionPane.showMessageDialog(null,"Name: "+firstName+" "+secondName);

        String input;

        input = JOptionPane.showInputDialog("Enter number 1:"); //This statement returns a string
        num1 = Integer.parseInt(input); //Converts String type input to int type num1

        input = JOptionPane.showInputDialog("Enter number 2:");
        num2 = Integer.parseInt(input);

        double average = (num1+num2)/2.0;

        JOptionPane.showMessageDialog(null,"Average: "+average);
    }
}
