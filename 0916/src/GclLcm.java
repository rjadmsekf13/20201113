
/**
 * @PackageName :
 * @FileName : GclLcm.java
 * @Since : 2020. 9. 16
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 16 KB 최초 작성
 *
 */
public class GclLcm {

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 16
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) { // 최대공약수
		// TODO Auto-generated method stub
		// 두수를 선언
		int num1 = 12;
		int num2 = 18;

		// big과 small선언
		int big;
		int small;

		// if문으로 big에 큰수를 small에 작은수를 저장
		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		// while 무한반복문으로 big과 small을 나누어서 나머지를 rest에 저장
		// 나머지가 0이면 종료
		// 나머지가 0이 아니면 big에 small을 small에 rest를 저장
		while (true) {
			int rest = big % small;
			if (rest == 0) {
				break;
			} else {
				big = small;
				small = rest;
			}
		}
		System.out.println("최대공약수 : " + small);
		System.out.println("최소공배수 : " + (num1 * num2 / small));

	}

}
