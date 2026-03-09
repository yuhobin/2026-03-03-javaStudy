import java.util.Scanner;
public class pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번쨰 정수 입력");
		int num1=scan.nextInt();
		
		System.out.println("연산자를 입력(+, -, *, /, %):");
		String op=scan.next();
		
		System.out.println("두번째 정수 입력");
		int num2=scan.nextInt();
		
		System.out.println("결과:"+num1+op+num2);
		
		
		
	}

}
