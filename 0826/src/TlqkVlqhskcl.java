import java.util.Scanner;

/**
 * @PackageName :
 * @FileName : TlqkVlqhskcl.java
 * @Since : 2020. 8. 26
 * @Author : KB
 * @Description : 피보나치 수열에서 항을 입력 받아 입력받은 항까지의 합을 출력하는 프로그램
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 26 KB 최초 작성
 *
 */
public class TlqkVlqhskcl {

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

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();

		int z, x, c, total;
		z = 0;
		x = 1;
		c = z + x;
		total = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(c + " ");
				c = z + x;
				z = x;
				x = c;
				total = total + z;
			}
		}
		System.out.print("\n항의 값 : " + z + " 합계 : " + total);

	}

}
