package ex4;

/**
 * @PackageName		: ex4
 * @FileName		: Kimbap.java
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
public class Kimbap {
	private String name;
	private String developer;
	private int price;
	private int saleCount;
	public Kimbap(String name, String developer, int price) {
		this.name = name;
		this.price = price;
		this.developer = developer;
	}
}
