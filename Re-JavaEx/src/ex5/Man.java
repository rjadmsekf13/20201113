package ex5;

/**
 * @PackageName		: ex5
 * @FileName		: Man.java
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
public class Man extends Mammalia{
	private int arms;
	public Man() {
		super.head = 1;
		super.legs = 2;
		this.arms = 2;
	}
	@Override
	public void cry() {
		System.out.println("사람도 운다.");
	}
	@Override
	public String toString() {
		return "Man [arms=" + arms + ", head=" + head + ", legs=" + legs + "]";
	}
	
}
