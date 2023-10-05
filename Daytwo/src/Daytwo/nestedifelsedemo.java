package Daytwo;

public class nestedifelsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20,c=5;
		System.out.println("the largest number");
		if(a>b) {
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
			}
		else {
			if(c>b)
					System.out.println(c);
			else
					System.out.println(b);
		}
	}
}
