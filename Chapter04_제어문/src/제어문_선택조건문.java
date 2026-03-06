/*
 * 	선택조건문
 * 	=> 프로그램에서는 가장 많이 사용되는 문장
 * 
 * 	else문장은 바로 위에 있는 if문장만 제어
 * 
 * 	=> else문장은 단독으로 사용할 수 없다 => if문을 동반
 *	
 * 
 * 
 */
import java.util.Scanner;
//숫자 2개 입력 => 최대값 / 최솟값
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번쨰 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("두번쨰 정수 입력:");
		int num2=scan.nextInt();
		
		int num3=num1>num2?num1:num2;
		if(num3==num1)
			System.out.println("최대값:"+num3);
		if(num3==num2)
			System.out.println("최솟값:"+num3);
	}

}
