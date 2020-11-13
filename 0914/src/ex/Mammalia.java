package ex;

/**
 * @PackageName :
 * @FileName : Mammalia.java
 * @Since : 2020. 9. 14
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 14 KB 최초 작성
 *
 */
public class Mammalia { //상속받을 클래스들이 사용하기 위해서 protected를 사용
	protected int head;
	protected int legs;

	public void cry() {
		System.out.println("포유류가 웁니다.");
	}
}
