import java.lang.*;

import javax.swing.*;

/*
This class helps you understand the different ways two strings can be compared.
*/

public class ComparingStrings
{
    public static void main(String[] args)
    {
        String name1 = JOptionPane.showInputDialog("Enter name 1:");
        String name2 = JOptionPane.showInputDialog("Enter name 2:");

        if(name1 == name2) //This method is not used because == compares the memory address of the two values which are not equal.
        {
            System.out.println("The names are not equal");
        }

        if(name1.equals(name2))
        {
            JOptionPane.showMessageDialog(null,"The names are equal using equals() ");
        }

        if(name1.compareTo(name2)==0)
        {
            JOptionPane.showMessageDialog(null,"The names are equal using compareTo()");
        }
        else if(name1.compareTo(name2)>0)
        {
            JOptionPane.showMessageDialog(null,"Name2 comes first then Name1 second");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Name1 comes first then name2 second");
        }

        System.exit(0);
    }
}
