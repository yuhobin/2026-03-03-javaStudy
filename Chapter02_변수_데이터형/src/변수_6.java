/*
 *  String : 문자열 여러개를 한번에 저장 할 수 있는 참조형 데이터형
 *  ------------------------------------------------
 *  형식) String 변수명=""
 *  	=> 웹에서 가장 많이 사용되는 데이터형
 *  	=> 클래스형으로 사용이 가능 => 기능 사용
 *  
 *  => 문자열 결합
 *  	+ : 산술, 문자열 결합
 *  
 *  	"Hello" + "Java" => "Hello Java"
 *  
 *  7+"7"+7 => "777"
 *  "77"+7 => "777"
 *  7+"7"+7+7+7 => "77777"
 *  
 *  7+7+"7"+7+7 => "14777
 *  
 *                                         double
 * 	영화                                      |
 * 	1. 영화명 / 주연 / 포스터 / 장르 / 등급 / 개봉일/ 평점
 * 		----------------------------------
 * 									String
 * 
 * 
 * 	boolean : 존재 여부
 * 			=> 장바구니에 값 있는지
 * 			=> true / false
 * 			=> 1byte (0,1)
 * 
 * 		-------------------------중복 여부 / 로그인 여부 / 턴
 * 		=> 관리자 / 일반 유저
 * 		boolean bCheck=true/false
 * 		=> 조건문 / 반복문에서 주로 사용
 * 		=>데이터형의 크기는 사용할 수 없다.
 * 		  -----------
 * 			|정수 / 실수
 * 
 * 		크기 
 * 		byte < short < int < long < float < double
 * 			   char
 * 		byte / int / ling / double 많이 사용하기에 공부 해놓아야
 * 		String / boolean	그 다음으로 사용하니 알고 있어야
 * 		---------------------------------
 * 	
 * 		데이터 저장
 * 		데이터형 변수명 = 초기값
 * 		-----
 
 * 
 * */
// 변수값 교환
public class 변수_6 {
	public static void main(String[] args) {
		// Call By Value
		int a=10;
		int b=20;
		
		int temp=a;// temp=10
		a=b; // a=20
		b=temp; // b=10
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
