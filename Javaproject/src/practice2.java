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
 import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번쨰 정수 입력");
		int num1=scan.nextInt();
		
		System.out.println("연산자를 입력(+, -, *, /, %):");
		String op=scan.next();
		
		System.out.println("두번째 정수 입력");
		int num2=scan.nextInt();
		
		System.out.println("결과:"+num1+op+num2); */
		
		//윤년 구하기
		/*Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하시오:");
		int year=scan.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0))
		{
			System.out.println(year+"는 윤년입니다");
		}
		else
		{
			System.out.println(year+"는 윤년이아닙니다");
		}*/
		
		/*int sum = 0;
		for (int i=1 ; i<=100 ; i++)
			{sum += i ;
		System.out.println("i="+i+"sum="+sum);}
		
		System.out.println();
		System.out.println("1과100사이의 총합은"+sum);
		*/
		int sum =0 ;
		for (int i =1 ; i<=100 ; i ++)
			{sum += i;
		System.out.println("i="+i+"sum="+sum);}
		
		System.out.println();
		System.out.println("1과 100사이의 총합:"+sum);
		
	}

}
