/*
 * 	byte / long => 정수
 * 			|큰데이터값이 있는 경우 => 금융권 / AI(빅데이터)/ 학교
 * 	  | -128~127
 * 
 * 		=> int / long
 * 			|		|
 * 			--------
 * 
 *  	100L / 100l
 * 
 * 		데이터형
 * 			= 기본형 : 자바에서 제공되는 데이터형
 * 			= 참조형 : 사용자 정의
 * 				---------------class
 * 
 * 		급여 / 점수 ==> int
 * 		평균 / 총점 ==> double
 * 
 * 		큰 데이터형에 작은 데이터형 대입 (O)
 * 		작은 데이터형에 큰 데이터형 대입 (X)
 * 			=======>
 * 					  4byte	 8byte	 4byte	8byte		
 * 		byte < short < int < long < float < double
 * 			<======이 방향은 오류
 * 
 * 		실수 =>
 * 		float (4byte)
 * 		double (8byte)
 * */

import java.util.Scanner;

public class 변수_3 {
	
	public static void main(String[] args) {
	byte b1=Byte.MIN_VALUE;
	byte b2=Byte.MAX_VALUE;
	
	System.out.println("byte는 범위"+b1+"~"+b2);
	
	long l1=Long.MIN_VALUE;
	long l2=Long.MAX_VALUE;
	
	System.out.println("long는 범위:"+l1+"~"+l2);
	
	short s1=Short.MIN_VALUE;
	short s2=Short.MAX_VALUE;
	
	System.out.println("shorts는 범위:"+s1+"~"+s2);
	
	int i1=Integer.MIN_VALUE;
	int i2=Integer.MAX_VALUE;
	
	System.out.println("Integer은 범위:"+i1+"~"+i2);
	
	// 데이터형 변수형 = 값
	
	double d=10.5f;
	float f=(float)10.5;
	/*
	 * 10.5 + 10 => 20.5
	 * 		  --
	 * 		  10.0
	 * */
	

}
}
