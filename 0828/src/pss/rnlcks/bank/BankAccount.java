package pss.rnlcks.bank;

/**
 * @PackageName		: 
 * @FileName		: BankAccount.java
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
public class BankAccount {
	int balance = 0; // 예금 잔액
	String accountCode; // 계좌 번호
	
	public BankAccount(String accountCode) {
		this.accountCode = accountCode;
		System.out.println("계좌가 생성되었습니다." + this.accountCode);
	}
	
	public int deposit(int amount) { //입금 메소드
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) { //출금 메소드
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() { //예금 조회 메소드 
		System.out.println("잔액 : " + balance);
		return balance;
	}

}
