/*
 * 			  활용		 활용
 * 		변수 =======연산자=======제어문
 * 		---------------------------묶어서 처리 : 메소드
 * 
 * 		형변환 연산자
 * 		---------
 * 			================> 자동 형변환
 * 			byte < char < int < long < double
 * 			<=============== 강제 형변환
 * 							---------(데이터형)데이터
 * 			==> 필요시에만 사용
 * 
 * 			=> 제외 : boolean / String 제외
 * 							  -------변환 가능
 * 
 * 
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int kor=80;
		int eng=78;
		int math=88;
		
		int count=3;
		
		int total=kor+eng+math;
		double avg=total/(double)count;	// 정수/정수=정수 */
		
		int kor =80;
		int eng = 70;
		int math =70;
		
		int count=3;
		
		int total=kor+eng+math;
		double avg=total/(double)count;
		
		System.out.println("총점은:"+total);
		System.out.println("평균은:"+avg);
				
			/*	System.out.println("총점:"+total);
				System.out.println("평균:"+avg);
				
				// 작게 , 크게도 가능
				
				char c='A';
				System.out.println((int)c);
				int i=65;
				System.out.println((char)i);
				
				int a=123456;
				float d=123456.78f;
				int r=(int)((d-a)*100);
				System.out.println(r);	*/
				
			/*int kor=80;
			int eng=75;
			int math=90;
			
			int total=kor+eng+math;
			double avg=total/3;	*/
	}

}
