package sample02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("수정확인용!!");

		/*
		   숫자(상수):
		       2진수 : 0,1
		       8진수 : 0~7  8->10  10 -> 12 -> 012
		       10진수: 0~9
		       16진수: 0~9 A B C D E F(15)    0x000000 -> black, 0xFFFFFF -> white
		       
		       1010 1100 -> 2진수
		       8421 8421
		       A    C -> 16진수 -> 0xAC
		       
		       0xE5 -> 16진수
		       8421 8421
		       1110 0101
		       
		   변수(variable): 빈통(공간)에 데이터를 저장할 수 있는 수
		        데이터의 종류도 다양하다 
		 */
		
		// 숫자
		// 	정수(byte, short, int, long)
		// 자료형(byte) 변수(by) -> 1byte -> 256개의 숫자를 표현 0~255
		byte by;
		
		// 대입
		// <- 값
		by = 12;
		by = 25;
		by = 127; // -128~127
		
		short sh; // -> 2byte
		sh=123;
		
		int i;  // -> 4byte
		i = 12345;
		
		long l;  // -> 8byte
		l = 1234567890123L;
		
		//  실수(소수)(float, double)
		float f; // -> 4byte
		f = 123.456f;  // 라디안 *3.141592 / 180
		
		double d;  // -> 8byte
		d = 234.5678901234;
		
		// 문자열
		//  문자(char)
		char c;  // 2byte
		c = 'A';
		c = '한';
		
		//  문자열(String) -> (wrapper)class
		String str;
		str = "Hello";
		str = "World";
		
		// 논리 true/false(boolean)
		boolean b;
		b = false; // = 0
		b = true; // = 1
		
		// 변수명 규칙
		int hh;
		int humanHeight;
		
		// int 1abc;
		int da;
		// int char;
		// int ch sfge;
		// int ABC;  // final
		
		int charPositionXdot;
		int char_position_xdot;
		int charPosXdot;
		
		System.out.println(by);
		System.out.println(sh);
		System.out.println("i="+i);
		System.out.println("l = "+l);
		
		System.out.println("f = "+f);
		System.out.println("d = "+d);
		
		System.out.println(b);
		
		// String str1 = 234;
	//	int n = "abc";
	}

}
