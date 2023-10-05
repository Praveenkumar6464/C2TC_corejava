package Daytwo;

public class OperstorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		++a; //a=a+1=10+1=11
		int c=++a+b+a--; //a=a+1 = 11+1=12 +20 + 12 =44
		System.out.println(c);
		
		// pre Increment/pre Decrement
		//1.Perform the Operation
		//2.Assign the result of 1 to the variable
		
		//post Increment /post Decrement
		//1.Assign the current value for the calculation
		//2.perform the operation
		//a=11; b=20; c=44 ;d=?
		int d=c++ +a + b--; //44 + 11 +20 =75
		//c++ =c+1 = 44+1 =45; b-- =b=b-1 =20-1=19
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		
		//Ternary Operator// alternative to if else statement
		int x=10;
		x=(10==x) ? 1 :0;
		System.out.println(x);
	}

}
