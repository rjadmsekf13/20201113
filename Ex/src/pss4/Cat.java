package pss4;

/**
 * @PackageName		: pss4
 * @FileName		: cat.java
 * @Since			: 2020. 9. 28
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 28		KB				최초 작성
 *
 */
public class Cat extends Mammalia{
	public Cat() {
		super.head = 1;
		super.legs = 4;
	}
	public void cry() {
		System.out.println("야옹");
	}
	
}
