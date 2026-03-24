
/*
 * 	정렬
 * 	40	20 50 10 30
 * 	-- 	--
 * 	20	40
 * 	--		--
 * 	20		50
 * 	--		  --
 * 	10		  20
 * 	--			 30
 * 	--------------- for 1 ==> 1 round
 * 	10 40 50 20	30
 * 	   -- --
 * 	   40 50
 * 	   --    --
 * 	   20    40
 * 	   --		--
 * 	   20		30
 * 	-----------------
 * 	10 20 50 40 30
 * 		  -- --
 * 		  40  50
 * 		  --     --
 * 		  30     40
 * 	---------------- for 3 ==> 3 round 
 * 
 */
import java.util.Arrays;

public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; // 1~100

		}
		System.out.println("정렬 전:");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		// 올림차순 => ASC arr[i]>arr[j]
		// 내림차순 => DESC arr[i]<arr[j]
		System.out.println("\n정렬 후:");

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i]; // 값 교환 => 임시변수 설정
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
