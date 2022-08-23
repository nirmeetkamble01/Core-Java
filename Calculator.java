import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
 // create an object of Scanner class
        Scanner input = new Scanner(System.in);

// initialization
        double number1 , number2 , total;
        char operator;

// ask users to enter operator
        System.out.println("select operator");
        System.out.println(" + - * /");
        operator = input.next().charAt(0);

// ask users to enter numbers
        number1  = input.nextDouble();
        number2  = input.nextDouble();

        switch(operator)
        {
            case '-' :
            total = number1 - number2;
            System.out.println(number1 + " - " + number2  +  " = "  + total);
            break;

            case '+' :
            total = number1 + number2;
            System.out.println(number1 +  " + "  + number2  +  " = "  + total);
            break;

            case '*' :
            total = number1 * number2;
            System.out.println(number1 +  " * "  + number2  +  " = "  + total);
            break;

            case '/' :
            total = number1 / number2;
            System.out.println(number1 +  " / " +  number2  +  " = "   + total);
            break;












        }
        input.close();

    }
}