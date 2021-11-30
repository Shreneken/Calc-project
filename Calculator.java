import java.util.*;
/*import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
import java.awt.BorderLayout;*/

public class Calculator {

    private static int Addition (int a, int b) {
        return a + b;
    }

    private static int Substraction (int a, int b) {
        return a - b;
    }

    private static int Multiplication (int a, int b) {
        return a * b;
    }

    private static int Division (int a, int b) {
        return a / b;
    } 

    public static void main ( String[] argz ) {
        Scanner userInput = new Scanner (System.in);
        boolean end = false;
        boolean gotCorrect = false;
        String whatTheUserInputs;
        int num1;
        int num2;
        int result = 0;
        boolean gotResult = false;
        
        /*JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);*/

        
        while (!gotCorrect) {
            try {
                while (end == false) {
                    System.out.println("Enter your operation (+,-,*,/)");
                    whatTheUserInputs = userInput.next();
                    System.out.println("Enter 1st number");
                    num1 = userInput.nextInt();
                    System.out.println("Enter 2nd number");
                    num2 = userInput.nextInt();
                    if (whatTheUserInputs.equals("+"))  {result = Addition(num1,num2); gotResult = true;}
                    else if (whatTheUserInputs.equals("-")) {result = Substraction(num1, num2); gotResult = true;}
                    else if (whatTheUserInputs.equals("*")) {result = Multiplication(num1, num2); gotResult = true;}
                    else if (whatTheUserInputs.equals("/")) {result = Division(num1, num2); gotResult = true;}
                    else {  throw new Exception("Invalid operator"); }
                    if (gotResult) {                               
                        System.out.println("The result of your operation is " + result);
                        result = 0;
                    }    
                    System.out.println("Enter 'X' if you want to exit, Etner anything else to continue:");
                    if (userInput.next().toUpperCase().equals("X")) end = true;  
                }
                gotCorrect = true;
            }
            catch ( Exception e ) {
                System.out.println("Please enter again:"); 
                userInput.nextLine();   
            }
        }
        userInput.close();
    }

}