
/*
 * 	사칙연산 => 정수만 
 * 	=> 한가지 기능만 수행
 * 		-----------
 * 		+ , - , * , /
 * 
 * 	=> main에서는 처리하지 않는다
 * 		------------------ 시작점
 */
import java.util.Scanner;

public class 메소드_2 {
	// + : 변수 / 연산자 / 제어문 => 묶어서 한개의 기능을 만든다
	// 사용자로부터 2개의 정수를 받아서 더한 값을 보내준다
	// ------------ 리턴값 /결과값
	// 더한값을 달라 ==> 리턴형
	// 더한값을 출력 ==> 리턴형(X)
	// ===> 윈도우 / 웹 ==> 무조건 리턴형이 존재
	static int plus(int a, int b) {
		int c = a + b;
		return c;
	}

	static int minus(int a, int b) {
		int c = a - b;
		return c;
			// => return 다음 줄에는 소스 코딩이 불가능
	}

	static int gop(int a, int b) {
		int c = a * b;
		return c;
	}

	static String div(int a, int b) {
		String res = "";
		if (b == 0)
			res = "0으로 나눌 수 없습니다";
		else
			res = a + "/" + b + "=" + (a / (double) b);
		return res;
	}
	// 메소드 조립해서 => 계산기 => 다른 클래스에서 재사용이 가능
	// void => 결과값이 없는 경우 => 메소드 자체 처리
	// return 생략이 가능 => 컴파일러가 자동으로 추가
	static void process() 
	{
Scanner scan = new Scanner(System.in); 
		
		System.out.println("첫번쨰 정수 입력:");
		int a = scan.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		
		System.out.println("두번쨰 정수 입력:");
		int b = scan.nextInt();
		
		switch(op)
		{
		case '+' -> {
			int result = plus(a, b);
			System.out.printf("%d+%d=%d\n",a,b,result);}
		case '-' -> {
			int result = minus(a, b);
			System.out.printf("%d-%d=%d\n",a,b,result);
		}
		case '*' -> {
			int result = gop(a, b);
			System.out.printf("%d*%d=%d\n",a,b,result);
		}
		case '/' -> {
			String result = div(a, b);
			System.out.println(result);
		}
		default -> System.err.println("없는 연산자입니다");
		}
	}
	// => 기능 여러개를 묶어서 한개의 기능 처리 (계산기) => 부품 (컴포넌트)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("첫번쨰 정수 입력:");
		int a = scan.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		
		System.out.println("두번쨰 정수 입력:");
		int b = scan.nextInt();
		
		switch(op)
		{
		case '+' -> {
			int result = plus(a, b);
			System.out.printf("%d+%d=%d\n",a,b,result);}
		case '-' -> {
			int result = minus(a, b);
			System.out.printf("%d-%d=%d\n",a,b,result);
		}
		case '*' -> {
			int result = gop(a, b);
			System.out.printf("%d*%d=%d\n",a,b,result);
		}
		case '/' -> {
			String result = div(a, b);
			System.out.println(result);
		}
		default -> System.err.println("없는 연산자입니다");
		}

	}

}
