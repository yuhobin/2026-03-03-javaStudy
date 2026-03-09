import java.util.Scanner;//입력
public class 변수_2 {
	public static void main(String[] args) {
		/*
		 * 	사과 5개
		 * 	=> 사과를 2개를 먹었다.
		 * 	=> 현재 남아있는 사과의 개수
		 * 
		 * */
		int 사과=5;
		System.out.println(사과-2);
		
		int bApple=5;
		int eApple=2;
		System.out.println(bApple-eApple);
		/*
		 * 	국어80
		 * 	영어90
		 * 	수학 70
		 * 	----------------평균 구하기
		 * 
		 * 
		int 국어=80;	
		int 영어=90;
		int 수학=70;
		
		System.out.println((국어+영어+수학)/3); */
		
		Scanner scan=new Scanner(System.in);
		//System.in => 키보드에서 입력된 값을 읽어오는 역할
		//=> 공백 / 엔터 90 80 70
	
	System.out.println("국어 점수 입력:");
	System.out.println("");
	int 국어=scan.nextInt();
	int 영어=scan.nextInt();
	int 수학=scan.nextInt();
	//System.out.println("국어:"+국어);
	System.out.println("총점:"+(국어+영어+수학));
	
		
		
	}
}
