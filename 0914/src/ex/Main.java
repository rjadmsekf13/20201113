package ex;

/**
 * @PackageName :
 * @FileName : Main.java
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
public class Main {

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 14
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(); // Cat 객체 생성
		Man man = new Man(); // Man 객체 생성

		cat.cry();
		System.out.println(man.toString());
		man.cry();
	}

}
