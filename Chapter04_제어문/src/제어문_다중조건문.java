/*
 * 1. 단일 조건문
 * 		if(조건문)
 * 		{
 *			조건이 true => 실행문장 
 * 		}
 * 		false => 건너뛴다
 * 
 * 	2. 선택조건문
 * 		
 * 	3. 다중조건문
 */
// 사칙연산 => 계산기
/*
 * 	if(+)
 * 	else if(-)
 * 	else if(*)	
 *	else if(/) 
 *	else 없는연산
 * 
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번쨰 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		char c=op.charAt(0); // 첫번쨰 입력된 문자 읽기
		// 문자열은 인덱스번호 => 0번부터 시작한다
		// ==정수 /실수 / 논리 / 문자
		if(c=='+')
		{
			
		}
		else if(c=='-')
		{
			
		}
		else if(c=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(c=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
			{
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
		}
		else
		{
			System.out.println("잘못된 연산자입니다");
		}
	}

}
