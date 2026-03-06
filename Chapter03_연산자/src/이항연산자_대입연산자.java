/*
 * 	대입연산자 => 우선순위 마지막
 * 	---------------------
 * 		=
 * 		int a=10; 10을 a에 대입
 *			----
 *	복합대입연산자
 *		+= , -= , *= , /= , >>= , <<= , &=
 *		|= , ^=
 *
 * 	1. 형변환 
 * 		int a='A' ==> a=65
 * 		double d=10 ==> d=10.0
 * 		------
 * 		왼쪽>=오른쪽
 * 		---------
 * 		int a=10L ==> 오류
 * 		  => long l=10L
 * 		  => int a=(int)10L
 * 		byte b=10
 * 		---------
 * 		char c='A' ==> char c=65
 * 		---------		--------- 정상 코드
 * 
 * 	2.초기값 / 계산 결과값 저장
 * 	int a=10;
 * 	int b=20;
 * 	int c=a+b;
 * 
 *	3. 기본 (초기값)
 *	-------------
 *	int a=0;
 *	double d=0.0
 *	char c=''; ''=null
 *	float f=0.0F;
 *	long l=0L;
 *	---------------------
 *	=> 계산 결과값 대입
 *	----------------------
 *	복합 대입연산자
 *	==========
 *	+=	:	++ (1증가)
 *	--- 여러개 한번에 증가
 *	int a=10;
 *	a+=10; a=a+10 => a=20
 *	=> 반복문 / 값 누적 / 문자열 누적
 *	  --------------
 * 	-=	:	--(1감소)
 * 	--- 여러개 동시에 감소
 * 	----------------------
 * 	*=
 * 	/=
 * 	%=
 * 	------------------------
 * 	+= , -= 이 두개만 거의 나옴
 * 	==> 문자열도 사용이 가능
 * 	--------------------	
 * 
 * 
 * 
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c=65;
		char d=(char)((int)(Math.random()*26)+65); */
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i; // 1~100 누적
		}
		System.out.println("sum:"+sum);
		
		String alpha="";
		for(char c='A';c<='Z';c++)
		{
			alpha+=c;
			//alpha=alpha+c;
		}
		System.out.println(alpha);
		//이동
		
	}

}
