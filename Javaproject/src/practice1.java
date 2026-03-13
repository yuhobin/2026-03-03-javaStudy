import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=10;
		int b=15;
		int c=20;
		int total = (a + b + c);
		double avg = (total / 3.0);
		
		System.out.println(total);
		System.out.println(avg); */
		
	/*	int no=89;
		char op = 'A';
			switch(no/10)
				{case 10 : case 9 :  op='A';
					break;
				case 8 : op = 'B';
					break;
				case 7 : op = 'C';
					break;
				case 6 : op = 'D';
					break;
				default : op = 'F';	
				}
				System.out.println(op); */
		
		/*Scanner scan=new Scanner (System.in);
		int com=(int)(Math.random()*3); //0,1,2
		System.out.println("가위(0), 바위(1), 보(2):");
		int user=scan.nextInt();
		if (user>=0 && user<=2)
		{
			
		}*/
		
		/*int num = 15;
		
		if (num % 7 == 0)
		{
			System.out.println(num+"는 7의 배수입니다");
		}
		
		else if (num % 3 == 0)
		{
			System.out.println(num+"는 3의 배수입니다");
		}
		else
		{
			System.out.println(num+"는 아무 배수도 아닙니다.");
		}*/
		
		/*char c = 'D';
				if ((c>='A') && (c<='Z'))
				{
					System.out.println(c+"는 대문자입니다");
				}
				if ((c>='a') && (c<='z'))
				{
					System.out.println(c+"는 소문자입니다");
				}
				if ((c>='0') && (c<='9'))
				{
					System.out.println(c+"는 숫자입니다");
				}*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num=scan.nextInt();
		if (num>10)
		{
		System.out.println("10보다 큼");
		}
		else if (num==10)
		{
		System.out.println("10과 같음");
		}
		else
		{
		System.out.println("10보다 작음");
		}
		

	}
}