package pss;

/**
 * @PackageName : pss
 * @FileName : Ex2Gugudan.java
 * @Since : 2020. 8. 31
 * @Author : KB
 * @Description : 구구단출력
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 31 KB 최초 작성
 *
 */
public class Ex2Gugudan {

	/**
	 * @MethodName : main
	 * @Since : 2020. 8. 31
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i = 단의 기준, z = 곱해지는 지수
		for (int i = 2; i <= 9; i++) {
			for (int z = 1; z <= 9; z++) {
				System.out.println(i + " x " + z + " = " + i * z);
			}
		}

	}

}
