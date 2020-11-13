
/**
 * @PackageName :
 * @FileName : IfGugudan.java
 * @Since : 2020. 8. 26
 * @Author : KB
 * @Description : for문과 if문을이용한 짝수 구구단출력
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 8. 26 KB 최초 작성
 *
 */
public class IfGugudan {

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

		// i에 2를 저장하고 9와 같아질때까지 플러스 카운트 하며
		for (int i = 2; i <= 9; i++) {
			for (int z = 1; z <= 9; z++) {
				if ((i % 2) == 0)
					System.out.println(i + " * " + z + " = " + (i * z));
			}
		}

	}

}
