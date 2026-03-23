// 문자열 분리
// => split
/*
 * 	원형
 * 	String[] split(String regex);
 * 
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,yellow,black,magma,pink";
		String[] colors = color.split(",");
		for (String c : colors) {
			System.out.println(c);
		}
		/*
		 * 	정규식관련 기호가 들어가면 문제가 생김 
		 * 	|
		 * 	.
		 * 	?
		 * 	*
		 * 	+
		 * 	-----------\\ 그래서 기호 앞에 역슬러시 두개를 쳐줘야함
		 * 
		 */
		color = "red|green|blue|yellow|black|magma|pink";
		String[] colors2 = color.split("\\|");
		for (String c : colors2) {
			System.out.println(c);
		}
	}

}
