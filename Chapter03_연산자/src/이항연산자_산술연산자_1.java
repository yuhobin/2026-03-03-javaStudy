/*
 * 	국어/영어/수학 점수 입력을 받아서 총점 / 평균 출력
 * 
 * 
 */
import java.util.Scanner; //키보드로 입력된 값을 가지고 온다.
//import 생략 => java.lang.* : String , Math ....
//	java.util.*
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Scanner scan=new Scanner(System.in);
		// 엔터시에 메모리에 저장
		//system.in ==> 키보드로부터 값을 받는다.
		System.out.println("국어 입력;");
		int kor=scan.nextInt();
				
		System.out.println("영어 입력;");
		int eng=scan.nextInt();
				
		System.out.println("수학 입력;");
		int math=scan.nextInt();
		
		//총점
		int total=kor+eng+math;
				
		//평균
		double avg=total/0.0; // infinity 무한대
		// 5%0 ==> NaN => 값이 없는 경우 ==> 자바스크립트
		
		//출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("========최종결과=======");
		System.out.println("총점:"+total);
		System.out.printf("평균;%.2f\n",avg);
		System.out.println(5%0.0);
	
	}

}
