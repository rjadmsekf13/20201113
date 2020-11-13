package pss.rnlcks.bank;

/**
 * @PackageName		: 
 * @FileName		: BankAccount00.java
 * @Since			: 2020. 8. 27
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 27		KB				최초 작성
 *
 */
public class BankAccount00 {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 27
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount yoon = new BankAccount("11111");
		BankAccount park = new BankAccount("22222");
		
		yoon.deposit(5000);
		park.deposit(3000);
		
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();

	}

}
