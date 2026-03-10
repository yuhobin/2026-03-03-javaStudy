/*
 * 	자바 반복문
 * 	
 * 
 * 
 * 
 * 
 */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력 ==> 반복 횟수 지정 ==> for
		/*
		 * 반복문
		 * 	1. 형식
		 * 	   for(초기값;조건식;증가식)
		 * 			{
		 * 				반복 실행 문장
		 * 			}
		 * 	2. 실행순서
		 * 		1) 초기값
		 * 		2) 조건식  <-----------------------------
		 *											  |
		 * 			=true ==> 3) 반복 수행문장 수행 ==> 4) 증가식
		 * 			=false ==> 종료
		 * 
		 * 3. 
		 * 	int i=1;  
		 * 	i<=10 <= true
		 * 		  <= false => 종류
		 * 	i++
		 * 
		 * 				| false => 종료
		 *//*		 1		2	  |----4
		for (int i=1; i<=10; i+=2) 	  |
		{							  |
			System.out.println(i);3----
		}
			int 
		
		*/
//		for(;;)
//				System.out.println("Hello Java!!");
		
		//알파벳 ==> char
		for(char c = 'A'; c <= 'Z'; c ++)
			System.out.print(c);
	}

}
