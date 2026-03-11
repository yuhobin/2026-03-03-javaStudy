
/*	
 * 	제어문
 * 	제어문 중 조건문 - 단일조건문 if(){syso}else{syso}
 *     	  	 	  다중 조건문 if-elseif
 *	선택문	 switch() 
 *				{case , -> (syso);}
 *	반복문	for , while , do-while	 
 * 
 * 
 * 
 */
import java.util.*;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in);
		 * 
		 * System.out.println("첫번쨰 정수 입력"); int num1=scan.nextInt();
		 * 
		 * System.out.println("연산자를 입력(+, -, *, /, %):"); String op=scan.next();
		 * 
		 * System.out.println("두번째 정수 입력"); int num2=scan.nextInt();
		 * 
		 * System.out.println("결과:"+num1+op+num2);
		 */

		// 윤년 구하기
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("년도를 입력하시오:"); int
		 * year=scan.nextInt(); if ((year % 4 == 0) && (year % 100 != 0) || (year % 400
		 * ==0)) { System.out.println(year+"는 윤년입니다"); } else {
		 * System.out.println(year+"는 윤년이아닙니다"); }
		 */

		/*
		 * int sum = 0; for (int i=1 ; i<=100 ; i++) {sum += i ;
		 * System.out.println("i="+i+"sum="+sum);}
		 * 
		 * System.out.println(); System.out.println("1과100사이의 총합은"+sum);
		 */

		/*
		 * int sum =0 ; for (int i =1 ; i<=100 ; i ++) {sum += i;
		 * System.out.println("i="+i+"sum="+sum);}
		 * 
		 * System.out.println(); System.out.println("1과 100사이의 총합:"+sum);
		 */

		// 1번 문제
//		int sum = 0;
//		for (int i = 1; i <= 100; i++ )
//			if (i % 2 ==0) {
//				sum += i;
//			}
//		System.out.println("1~100까지 짝수합:"+sum);

		// 2번 문제
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 n을 입력하시오");
//		int n = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println("1~n까지의 합:"+sum);

		// 3번문제
//		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//				System.out.println("1~50까지 3의 배수:"+i);
//			}
//			
//		}

		// 4번문제
//		int count = 0; // count는 7의 배수 개수
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				count += 1;
//			}
//
//		}
//		System.out.println("7의 배수 개수:" + count);

		// 5번문제
//		String str = "JavaProgrammig";
//		for (int i = 0; i<str.length(); i++) {
//			System.out.print(str.charAt(i)+" ");
//		}

		// while 예제 1~100까지 합, 짝수 합 , 홀수 합
//		int i = 1;
//		int sum = 0;
//		int even = 0;
//		int odd = 0;
//		while (i <= 100) {
//			sum += i;
//			if (i % 2 == 0) {
//				even += i;
//			} else if (i != 2) {
//				odd += i;
//			}
//			i++;
//		}
//		System.out.println("총합:" + sum + " " + "짝수합:" + even + " " + "홀수합:" + odd);

		// 구구단 만들기

//		Scanner scan = new Scanner(System.in);
//		System.out.println("원하는 단 입력:");
//		int dan = scan.nextInt();
//
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d*%d=%2d\n", dan, i, dan * i);
//			i++;
//		}

		Random r = new Random();
		int com = r.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100사이 정수를 입력하시오");
		do {
			int user = scan.nextInt();
			if (user < 1 || user > 100) {
				System.out.println("숫자를 다시 입력하시오");
				continue;
			}
			if (com < user) {
				System.out.println("입력값보다 작은 수를 입력하시오");
			} else if (com > user) {
				System.out.println("입력값보다 큰 수를 입력하시오");
			} else {
				System.out.println("Game Over!!");
				break;
			}

		} while (true);

	}
}
