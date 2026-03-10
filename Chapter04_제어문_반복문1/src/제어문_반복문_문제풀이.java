/*
 *   프로그램 
 *     => 반복문 ( 조건 , 선택문 )
 *   형식
 *     1) 제어문의 형식 
 *        1. 조건식 
 *           단일      |----- ture/false 연산만 사용 
 *                if(조건문)  ----------- 부정연산자(!) , 비교연산자 , 논리연산자
 *                {
 *                   실행문장 ==> 조건 true일때 처리 
 *                }
 *                
 *                => for안에 if 사용 => 검색 
 *           선택 
 *                if(조건문)
 *                {
 *                   조건이 true 
 *                }
 *                else
 *                {
 *                   조건이 false 
 *                }
 *                
 *            선택문 
 *               switch(문자,문자열,정수)
 *                         ------
 *               {
 *                 case 값:  => 값이 중복되면 안된다 
 *                     처리문장 
 *                     break
 *                  ..
 *                  ..
 *                 default: 처리문장 => break를 생략이 가능 
 *               }
 *               
 *               최신버전 
 *               switch(문자,문자열,정수)
 *               {
 *                 case 값-> 처리문장;  ==> -> : + break
 *                 ..
 *                 ..
 *                 default->처리문장; ===> 반드시 추가 해야한다 
 *               }
 *               ---------- break를 사용하지 않는다 
 *               
 *           반복문 
 *             for / while / do~while / break / continue 
 *             ------------             ------
 *             
 *             for : 반복 횟수가 지정된 경우
 *             ----  형식)
 *                             1 -> 2  <-4|------
 *                        for(초기값;조건문;증가식)  |
 *                        {         |           |
 *                            실행문장 3----------- 
 *                        } 
 *                        
 *                        => 정수 / 문자 
 *                        1. 초기값 int i=1
 *                        2. 조건 검사 i<=10 true => 문장 수행 
 *                                         false 종료 
 *                        3. i를 증가 => i=2 ==> i<=10
 *                        
 *                        초기값 : 시작 위치 값 
 *                        조건문 : 어디까지 
 *                        증가식 : 몇번...
 *               
 *               
 */
import java.util.Random;
import java.util.Scanner;
public class 제어문_반복문_문제풀이 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
		// for ==> if
		System.out.println("1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.");
		int even=0;
		for(int i=1;i<=100;i++) // for(int i=2;i<=100;i+=2)
		{
			if(i%2==0)
				even+=i;
		}
		System.out.println("1~100 사이의 짝수 합:"+even);
//		2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.
		System.out.println("2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.");
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int n=scan.nextInt();
		// 합 누적하는 변수
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i; // sum=sum+i
		}
		System.out.println("sum="+sum);
//		3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
		System.out.println("3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.");
		for(int i=1;i<=50;i++)
		{
			if(i%3==0)
			  System.out.print(i+" ");
		}
		System.out.println("\n4. 1~100 사이에서 7의 배수 개수를 구하시오");
//		4. 1~100 사이에서 7의 배수 개수를 구하시오
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%7==0)
				count++;
		}
		System.out.println("7의 배수 갯수:"+count);
//		5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
		String s="JavaProgramming";
		// 문자열 => 무조건 0번 시작한다 
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
//		6. 1부터 10까지 숫자를 while문으로 출력하시오.
		/*
		 *   while 
		 *     => 순차적 
		 *     초기값  === 1
		 *     while(조건문) ==2====
		 *     {                 |
		 *        반복수행문장 == 3 |
		 *        증가식 ==4 =======
		 *     }
		 *     
		 *     ==> while(true) 
		 */
		System.out.println();
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
//		7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
		System.out.println();
		Random r=new Random();
		int k=r.nextInt(10)+1;
		for(i=1;i<=k;i++)
		{
			System.out.print(i+" ");
		}
//		8. 1~100 사이 홀수만 출력하시오.
		System.out.println();
		for(i=1;i<=100;i+=2)
		{
			System.out.print(i+" ");
				
		}
		System.out.println();
//		9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
		sum=0;// 이미 메모리에 저장 
		for(i=1;i<=100;i++)
		{
			if(i%5==0)
				sum+=i;
		}
		System.out.println("sum="+sum);
//		10. 숫자 10부터 1까지 역순 출력하시오.
        for(i=10;i>=1;i--)
        {
        	System.out.print(i+" ");
        }
        
        /*
         *   지역변수 ==> 선언이 되면 다음에 사용시에 반드시 변수값만 변경해서 사용
         *              --------- 재사용이 가능 
         *              --------- 초기화 
         *              --------- 블록이 종료
         *              
         *   변수선언  ==> 재사용 ===> 활용 ===> 출력 
         *   ------                | 연산자/제어문 
         */
	}

}
