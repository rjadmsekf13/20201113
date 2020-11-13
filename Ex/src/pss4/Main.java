package pss4;

/**
 * @PackageName : pss4
 * @FileName : main.java
 * @Since : 2020. 9. 28
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 28 KB 최초 작성
 *
 */
public class Main { // 포유류 - 고양이,사람 상속

	/**
	 * @MethodName : main
	 * @Since : 2020. 9. 28
	 * @author : KB
	 * @Description :
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Man man = new Man();

		cat.cry();
		System.out.println(man.toString());
		man.cry();
	}

}
