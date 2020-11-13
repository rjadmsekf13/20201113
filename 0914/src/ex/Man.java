package ex;

/**
 * @PackageName :
 * @FileName : Man.java
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
public class Man extends Mammalia {
	private int arms;

	public Man() { // super = Mammalia 에서 불러오기
		super.head = 1;
		super.legs = 2;
		this.arms = 2;
	}

	@Override
	public void cry() {
		System.out.println("엉엉");
	}

	@Override
	public String toString() { // alt + shift + s => toString
		return "Man [arms=" + arms + ", head=" + head + ", legs=" + legs + "]";
	} 
}