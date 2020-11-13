
/**
 * @PackageName		: 
 * @FileName		: BankAccountPO.java
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
public class BankAccountPO {
	static int balance = 0; // 예금 잔액

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
		
		deposit(10000); // 입금
		checkMyBalance(); // 잔액 확인
		withdraw(3000); // 출금
		checkMyBalance(); // 잔액 확인

	}
	
	public static int deposit(int amount) { //입금 메소드
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount) { //출금 메소드
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance() { //예금 조회 메소드 
		System.out.println("잔액 : " + balance);
		return balance;
	}
}