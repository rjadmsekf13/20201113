package ex4;

/**
 * @PackageName		: ex4
 * @FileName		: Employees.java
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
public class Employees {
	private int number;
	private int age;
	private int year;
	private String name;
	private String code;
	private String work;
	public Employees(int number, int age, int year, String name, String code) {
		this.number = number;
		this.age = age;
		this.year = year;
		this.name = name;
		this.code = code;
		
		if(year >= 0 && year <= 3) {
			this.work = "하";
		}else if(year >= 4 && year <= 10) {
			this.work = "중";
		}else {
			this.work = "상";
		}
	}
	public void makeKimbap() {
		System.out.println("깁밥을 만드는 중입니다.");
	}
	public void sayHello() {
		System.out.println("어서오세요.");
	}
	public void calculate() {
		System.out.println("계산해 드리겠습니다. 이용해 주셔서 감사합니다.");
	}
}
