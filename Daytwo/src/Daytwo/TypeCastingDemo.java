package Daytwo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implict / Widening Casting
		byte b=10; // 1 byte =8 bits
		int i=b; //int i=10; // 4 bytes
		System.out.println("i");
		
		float f=22.14f; // 4 bytes
		double d=f; // 8 bytes
		System.out.println(d);
		
		char ch='A'; // i bytes
		int j=ch; //4 bytes
		System.out.println(j);
		
		//Explicit Type Casting//Narrowing Casting
		double dOne=10.52d;
		float tOne=(float)dOne;
		
		float fTwo=34.56f; // 4 bytes-decimal variable
		int iTwo=(int)fTwo; // 4 bytes-Non decimal variable
		
		
	}

}
