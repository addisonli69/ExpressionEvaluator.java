/* Lab 6
* Description: We will prompt the user to give us one operator and two operands, then we will process the request.
* Name: Addison Li
* ID: 920672893
* Class: CSC 211-02
* Semester: Spring 2021
 */
import java.util.Scanner;
public class ExpressionEvaluator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operand");
        double x = input.nextDouble();
        System.out.println("Enter another operand");
        double y = input.nextDouble();
        System.out.println("Enter a operator");
        String operator = input.next();
        isValidOperator(operator);
        System.out.println(getResultText(x,y,operator));
        System.out.println("Ending program");

    }

    public static String getResultText(double operand, double operand2, String operator) {
        String result = "";

        if (operator.equalsIgnoreCase("+"))
            result = operand + " " + operator + " " + operand2 + " = " + add(operand, operand2);
        else if (operator.equalsIgnoreCase("-"))
            result = operand + " " + operator + " " + operand2 + " = " + subtract(operand, operand2);
        else if (operator.equalsIgnoreCase("*"))
            result = operand + " " + operator + " " + operand2 + " = " + multiply(operand, operand2);
        else if (operator.equalsIgnoreCase("/"))
            result = operand + " " + operator + " " + operand2 + " = " + divide(operand, operand2);
        else if (operator.equalsIgnoreCase("^"))
            result = operand + " " + operator + " " + operand2 + " = " + power(operand, operand2);
        return result;

    }
    public static double add(double operand, double operand2){
        return operand + operand2;
    }
    public static double subtract(double operand, double operand2){
        return operand - operand2;
    }
    public static double multiply(double operand, double operand2){
        return operand * operand2;
    }
    public static double divide(double operand, double operand2){
        return operand / operand2;
    }
    public static double power(double operand, double operand2){
        double result = operand;
        if(operand2 == 0)
            return 1;
        if(operand2 == 1)
            return operand;
        for(int i=1; i<operand2; i++)
            result = operand * result;
        return result;
    }

    public static boolean isValidOperator(String operator){
        System.out.println("Checking if " + operator + " is valid operator!");
        if (operator.equalsIgnoreCase("+")){
            System.out.println("'" + operator + "' is a valid operator");
            return true;
        }
        else if (operator.equalsIgnoreCase("-")){
            System.out.println("'" + operator + "' is a valid operator");
            return true;
        }
        else if (operator.equalsIgnoreCase("*")){
            System.out.println("'" + operator + "' is a valid operator");
            return true;
        }
        else if (operator.equalsIgnoreCase("/")){
            System.out.println("'" + operator + "' is a valid operator");
            return true;
        }
        else if (operator.equalsIgnoreCase("^")){
            System.out.println("'" + operator + "' is a valid operator");
            return true;
        }
        else{
            System.out.println("'" + operator + "' is not a valid operator");
            return false;
        }
    }


}
