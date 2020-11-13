package pss2;

/**
 * @PackageName		: pss2
 * @FileName		: Employee.java
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
public class Employees { // 사원번호, 이름, 나이, 근무지 코드, 근속연수, 업무숙련도
	private int number;
	private String name;
	private int age;
	private String code;
	private int year;
	private String work;
	
	public Employees(int number, String name, int age, String code, int year) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.code = code;
		this.year = year;
		
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
