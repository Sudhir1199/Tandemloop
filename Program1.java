import java.util.*;
class Calculator{
	double a;
	double b;
	public double add(double a, double b) {
		return a+b;
	}
	public double substract(double a, double b) {
		return a-b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
}
public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:-");
		double a = sc.nextInt();
		double b = sc.nextInt();
		Calculator cl = new Calculator();
		System.out.println("Enter the Operator");
		int op = sc.nextInt();
		switch(op)
		{
		case 1: 
			System.out.println(cl.add(a, b));
		break;
		case 2: 
			System.out.println(cl.substract(a, b));
		break;
		case 3: 
			System.out.println(cl.multiply(a, b));
		break;
		case 4: 
			System.out.println(cl.divide(a, b));
		break;
		default: System.out.println("Invalid Input!!!");
		}

	}

}
