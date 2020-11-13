package ex5;

/**
 * @PackageName		: ex5
 * @FileName		: Cat.java
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
public class Cat extends Mammalia{
	public Cat() {
		super.head = 1;
		super.legs = 4;
	}
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}
