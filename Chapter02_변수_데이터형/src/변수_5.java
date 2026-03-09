/*
 * 	변수
 * 	1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
 * ------------------------  ----  ---  ----
 * 		   int				double        
 * 	2. 문자열 저장 : String
 * 
 * */
public class 변수_5 {
	public static void main(String[] args) {
	
	/*int 국어=50; // 점수는 임의로 지정
	int 수학=50;
	int 영어=50;
	int 총점=국어+수학+영어;
	System.out.println("총점:"+총점);
	double 평균=총점/3;
	System.out.println("평균:"+평균);
	
	
    int drink=12;
    drink=drink-5;
    drink-=5; //누적 / 차감
	System.out.println("남은 음료수:"+drink);
		// 남은 음료수: 7
	 */		
	
	/*
	 * 	샌드위치 ==> 250
	 * 	사과 ==> 100
	 * 	쥬스 ==> 150
	 * 
	 * 	샌드위치 1 사과 2 쥬스 1 
	 *  => 총 칼로리는?
	 *
	 * */
		
	int sandwich=250;
	int apple=100;
	int juice=150;
	int ksum=(sandwich+apple*2+juice);
	System.out.println(ksum);
		
	/*
	 * 	이름은 홍길동 / 성별 남자 / 나이 20 / 키 180.5 / card false
	 * 	장바구니
	 * 		우유 = 1200 =>2개
	 * 		빵 = 1500 => 3개
	 * 		달걀 = 200 => 10개
	 * 
	 * */	
		
	String name="홍길동";
	String gender="남성";
	int age=20;
	double height=180.5;
	boolean isCard=false;
	
	int milk=1200*2;
	int bread=1500*3;
	int egg=200*10;
	
	System.out.println("이름:"+name);
	System.out.println("성별:"+gender);
	System.out.println("나이:"+age);
	System.out.println("키:"+height);
	System.out.println("카드 존재여부:"+isCard);
	System.out.println("장바구니총합:"+(milk+bread+egg));
	
	String msg="""
			[속보] 코스피·코스닥 폭락에 서킷브레이커 발동…20분간 거래 중단 
			[속보] 코스피·코스닥 폭락에 서킷브레이커 발동…20분간 거래 중단
			[속보] 코스피·코스닥 폭락에 서킷브레이커 발동…20분간 거래 중단
			""";
			 
			 System.out.println(msg);	
			 	
	
	}
}
