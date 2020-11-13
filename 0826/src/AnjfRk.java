import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : AnjfRk.java
 * @Since : 2020. 8. 26
 * @Author : KB
 * @Description : 입력받은 숫자만큼 *를 출력하기
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 26 KB 최초 작성
 *
 */
public class AnjfRk {

	/**
	 * @MethodName : main
	 * @Since : 2020. 8. 26
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너로 숫자 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		// 입력받은 숫자 만큼 반복
		for (int i = 1; i <= num; i++) {
			// k에 num-1을 저장 k가 i보다 크거나 같아질때까지 k마이너스 카운트 하며 공백 프린트
			for (int k = num - 1; k >= i; k--) {
				System.out.print(" ");
			}
			// z값을 1로 지정 i가 z보다 크거나 같아질때까지 z플러스 카운트 하며 *프린트
			for (int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

		return;
	}

}
