/*
 * 	41page
 * 	정수타입
 * -------------------------
 * 정수 
 * 		byte => 1byte (네트워크, 파일 읽기)
 * 		int => 4byte (일반 숫자에 주로 사용) = 프로그램에서 가장 많이 사용
 * 		long => 주로 시간, 날짜
 * 
 * -------------------------
 * 문자
 * -------------------------
 * 논리
 * 
 * 
 * 
 * */
import javax.swing.*; // java (1.0) / javax (1.2)
 	// => 10 이상 jakarta / 10이하
import java.io.File;
import java.text.SimpleDateFormat; // 추가됨
import java.util.Date;
import java.util.Random;
// Ctrl+/

public class 변수_정리 {
	public static void main(String[] args) {
		
//		 File f=new
//		 File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java"); // long
//		 l=f.lastModified(); // System.out.println(l); // System.out.println(new
//		 SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date (l));
		 
		/*
		 *  변수 선언
		 * 	변수 = 초기값
		 * 			----명시적
		 * 			----입력값
		 * 			----랜덤
		 * 				Math.random()
		 * 				-------------
		 * 				(int)(0.0~0.99) => 0~99+1
		 * 			----외부에서 데이터 읽기
		 * 			----위도우
		 * 				JoptionPane.show
		 * 		String name="홍길동"
		 */
		
//	String  name=JOptionPane.showInputDialog("이름 입력:");
//	System.out.println(name);
//	int kor=(int)(Math.random()*101);
//	int eng=(int)(Math.random()*101);
//	int math=(int)(Math.random()*101);
	
	Random r=new Random();
	int kor=r.nextInt(101);
	int eng=r.nextInt(101);
	int math=r.nextInt(101);
	System.out.println("국어:"+kor);
	System.out.println("영어:"+eng);
	System.out.println("수학:"+math);
	}
}
