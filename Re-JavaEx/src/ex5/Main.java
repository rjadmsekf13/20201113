package ex5;

/**
 * @PackageName		: ex5
 * @FileName		: Main.java
 * @Since			: 2020. 9. 29
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 29		KB				최초 작성
 *
 */
public class Main {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 9. 29
	 * @author			: KB
	 * @Description		: 
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
