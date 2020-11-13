
/* 2020.09.03 시간 클래스와 합침
 */
import java.util.Scanner;

public class Character {
	private int money; // 100만원까지
	private int stress; // 100까지
	private int countHospital; // 2회까지
	// 시간
	private int nowTime;
	private int nowDay;
	Scanner sc = new Scanner(System.in);

	public final static int ENDING_SUCCESS = 1;
	public final static int ENDING_PASAN = 2;
	public final static int ENDING_DEAD = 3;
	public final static int ENDING_NORMAL = 4;

	// 생성자(시간 초기회)
	public Character() {
		this.money = 50000;
		this.stress = 0;
		this.countHospital = 0;
		this.nowTime = 16; // 첫시작 아침 8시
		this.nowDay = 1; // 1일차
	}

	// 게터
	public int getMoney() {
		return money;
	}

	public int getStress() {
		return stress;
	}

	public int getCountHospital() {
		return countHospital;
	}

	public int getNowTime() {
		return this.nowTime;
	}

	public int getNowDay() {
		return this.nowDay;
	}

	// 잠자기 행동시 시간 오전 8시 날짜 +1
	public void setMorning(boolean sleep) {
		if (sleep == true) {
			this.nowTime = 16;
			this.nowDay++;
		}
	}

	// 시간 값을 받아 시간변수를 증가시키는 매서드
	public void increaseTime(int amount) {
		this.nowTime += amount;
	}

	// 돈 증가//
	public void increaseMoney(int amount) {
		this.money += amount;
	}

	// 돈 감소//
	public void decreaseMoney(int amount) {
		this.money -= amount;
	}

	// 스트레스 증가//
	public void increaseStress(int amount) {
		this.stress += amount;
	}

	// 스트레스 감소//
	public void decreaseStress(int amount) {
		if (this.stress - amount >= 0) {
			this.stress -= amount;
		} else {
			this.stress = 0;
		}
	}

	// 일하기 (손님 정보 받음, 디스플레이에서 출력할때 사용/시간+, 돈+, 스트레스+/손님별로 수치 다름/ 시간,돈 비례)
	public void work(int time, int stress) {
		this.stress += stress;
		this.money += time * 10000;
		this.nowTime += time; // 1당 30분 증가
	}

	// 싸우기
	public void fight() {
		int myhp = 100;
		int jinsanghp = 100;
		System.out.println("야생의 진상 손님이 나타났다!!");

		while (true) {
			
			// 공격
			System.out.println("1)왼쪽 공격 2)가운데 공격 3)오른쪽 공격");
			int myAttack = sc.nextInt();
			int jinsangDepence = (int) ((Math.random() * 3) + 1);
			if (myAttack != jinsangDepence) {
				System.out.println("공격이 성공했다.");
				int demage = (int) ((Math.random() * 70) + 1);
				jinsanghp -= demage;
				if (demage > 40) {
					System.out.println("효과는 굉장했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}else if (demage > 20) {
					System.out.println("효과는 적절했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}else  {
					System.out.println("효과는 미미했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}
			}else {
				System.out.println("공격이 실패했다.");
			}
			
			if(myhp<=0) {
				System.out.println("패배 하여 병원에 실려갑니다.");
				this.money -= 50000;
				this.stress = 0;
				this.nowTime += 6; // + 3시간
				this.countHospital++;
				break;
			}
			if(jinsanghp <=0) {
				System.out.println("승리!  깽값을 물어줍니다.");
				this.money -= 50000;
				this.stress = 0;
				this.nowTime += 6; // + 3시간
				break;
			}
			
			//방어
			System.out.println("1)왼쪽 방어 2)가운데 방어 3)오른쪽 방어");
			int myDepence = sc.nextInt();
			int jinsangAttack = (int) ((Math.random() * 3) + 1);
			if (myDepence != jinsangAttack) {
				System.out.println("방어에 실패했다.");
				int demage = (int) ((Math.random() * 70) + 1);
				myhp -= demage;
				if (demage > 40) {
					System.out.println("효과는 굉장했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}else if (demage > 20) {
					System.out.println("효과는 적절했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}else  {
					System.out.println("효과는 미미했다.");
					System.out.println("진상hp : " + jinsanghp + "내 hp : "+ myhp);
				}
			}else {
				System.out.println("방어에 성공했다.");
			}
			
			if(myhp<=0) {
				System.out.println("패배!  병원에 실려갑니다.");
				this.money -= 30000;
				this.stress = 0;
				this.nowTime += 6; // + 3시간
				this.countHospital++;
				break;
			}
			if(jinsanghp <=0) {
				System.out.println("승리!  깽값을 물어줍니다.");
				this.money -= 50000;
				this.stress = 0;
				this.nowTime += 6; // + 3시간
				break;
			}
		}

	}

	// 밥먹기(시간+, 돈-, 스트레스-/식사 종류별로 수치 다름)
	public void eat(int stress, int money) {
		this.nowTime += 2;
		this.money -= money;
		decreaseStress(stress);
	}

	// 휴식(시간+,스트레스-)
	public void rest() {
		this.nowTime += 4;
		decreaseStress(10);
	}

	// 병원 보내기(스트레스 100일때)//병원가면 돈-, 스트레스 0로 초기화, 시간+
	public void goHospital() {
		if (this.stress > 100) {
			this.money -= 50000;
			this.stress = 0;
			this.nowTime += 6; // + 3시간
			this.countHospital++;
			System.out.print("과한 스트레스로 쓰러져 병원으로 옮겨졌습니다. \n소지금액 - 50000 = " + this.money + "\n" + "병원간 횟수 :"
					+ this.countHospital + "\n");
		}
	}

	// 엔딩
	public int checkEnding() {
		int ending = 0;
		if (this.money > 1000000) {
			ending = ENDING_SUCCESS; // 성공엔딩break;
		} else if (this.money < 0) {
			ending = ENDING_PASAN; // 파산엔딩
		} else if (this.countHospital > 2) {
			this.countHospital++;
			ending = ENDING_DEAD; // 사망엔딩
		}
		return ending;
	}
}
