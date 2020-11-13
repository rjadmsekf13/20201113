package pss2;

/**
 * @PackageName		: pss2
 * @FileName		: Kimbap.java
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
public class Kimbap { //이름, 가격, 판매개수, 매뉴개발자
	private String name;
	private int price;
	private int saleCount;
	private String developer;
	
	public Kimbap(String name, int price, String developer) {
		this.name = name;
		this.price = price;
		this.developer = developer;
	}
}
