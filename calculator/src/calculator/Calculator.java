package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char operator;
	        Double number1, number2, result;
	        Scanner input = new Scanner(System.in);
	        System.out.println("Choose an operator: +, -, *, or /");
	        operator = input.next().charAt(0);
			System.out.println("Enter Number 1.....");
			double number3 = input.nextDouble();
	        System.out.println("Enter Number 2.....");
			double number4 = input.nextDouble();


	        switch (operator) {

	            //Addtion
	            case '+':
	              result = number3 + number4;
	              System.out.println(number3 + " + " + number4 + " = " + result);
	              break;
	      
	            //Substraction
	            case '-':
	              result = number3 - number4;
	              System.out.println(number3 + " - " + number4 + " = " + result);
	              break;
	      
	            //multiplication
	            case '*':
	              result = number3 * number4;
	              System.out.println(number3 + " * " + number4 + " = " + result);
	              break;
	      
	            //division 
	            case '/':
	              result = number3 / number4;
	              System.out.println(number3 + " / " + number4 + " = " + result);
	              break;

	            //Error
	      
	            default:
	              System.out.println("Invalid operator!!!!!!");
	              break;
	      

	}
}
	
}
