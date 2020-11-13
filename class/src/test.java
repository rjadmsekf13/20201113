import java.util.Scanner;
/**
 * @PackageName		: 
 * @FileName		: test.java
 * @Since			: 2020. 9. 2
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 2		KB				최초 작성
 *
 */
public class test {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 9. 2
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		//사용 클래스 객체화
		Character character = new Character();
		Display display = new Display();
		Scanner sc= new Scanner(System.in);
		
		
		//시작
		display.opening();
		
		// 7일간 시행
		while(character.getNowDay()<8) {
			
			//일어나고 처음에는 겟업 표시
			display.getup();
			
			//행동 분기 하기 위해 엔터 
			while(true) {
				display.enter();
				if (sc.nextLine().equals("")){
					break;
				}
			}
			
			
			//매일 첫 일과는 토토
			Toto toto = new Toto();
			display.beforeBuyToto();
			
			switch (sc.next()) {
			case "y":
				display.afterBuyToto();
				toto.setgame(sc.nextInt());
				display.bet(character.getMoney());
				int bet= sc.nextInt();
				if (bet < character.getMoney()) {
					toto.betmoney(bet);
					character.decreaseMoney(bet);
				}else {
					display.allIn();
					toto.betmoney(character.getMoney());
					character.decreaseMoney(character.getMoney());
				}
				break;
			case "n":
				toto.betmoney(0);
				break;
			default :
				toto.betmoney(0);
				break;
			}
			
			//토토 후 오후 9시 전까지 메인 선택지 반복시행
			while(character.getNowTime()<41) {
				
				display.mainMenu();
				switch (sc.nextInt()) {
					case 1:
						display.startWork();
						Customer customer = new Customer((int)(Math.random()*50),(int)(Math.random()*4)+1);
						if(customer.getType()==1) {
							System.out.println("진상손님이 싸움을 걸어옵니다.");
							character.fight();
						}else {
							character.work(customer.getTime(),customer.getStress());
							character.goHospital();
						}
						
					break;
					case 2:
						display.chooseMeal();
						switch (sc.nextInt()) {
							case 1:
								Meal lunchbox = new Meal(2500,10);
								character.eat(lunchbox.getStress(),lunchbox.getMoney());
								display.lunchbox(lunchbox.getStress());
								break;
							case 2:
								Meal gisa = new Meal(5000,20);
								character.eat(gisa.getStress(),gisa.getMoney());
								display.gisa(gisa.getStress(),gisa.getMoney());
								break;
							case 3:
								Meal ashley = new Meal(10000,50);	
								character.eat(ashley.getStress(),ashley.getMoney());
								display.ashley(ashley.getStress(),ashley.getMoney());
								break;
							case 4:
								Meal hotelBuffet = new Meal(20000,100);
								character.eat(hotelBuffet.getStress(),hotelBuffet.getMoney());
								display.hotelBuffet(hotelBuffet.getStress(),hotelBuffet.getMoney());
								break;
						}
						break;
					
					case 3:
						display.rest();
						character.rest();
						break;
				}display.stat(character.getMoney(),character.getStress(),character.getNowDay(),character.getNowTime());
				// 엔딩 체크
				if (character.checkEnding()==character.ENDING_DEAD
						|| character.checkEnding()==character.ENDING_PASAN
						|| character.checkEnding()==character.ENDING_SUCCESS
						) {
					break;
				}	
			
			}
			// 엔딩 체크
			if (character.checkEnding()==character.ENDING_DEAD
					|| character.checkEnding()==character.ENDING_PASAN
					|| character.checkEnding()==character.ENDING_SUCCESS
					) {
				break;
			} //일과 끝
			
			//돈걸었을때 토토 결과 표시 및 돈 따기
			if (toto.getBet()>0) {
				display.resultToto(toto.getResult());
				if (toto.getPrediction() == toto.getResult()) {
					display.winToto(toto.getPrice());
				}else {
					display.loseToto(toto.getBet());
				}
			character.increaseMoney(toto.getPrice());
			if (character.checkEnding()==character.ENDING_SUCCESS) {
				break;
			}
			}
			
			//시행 후 잠자기
			display.sleep();
			character.setMorning(true);
		}
		display.ending(character.checkEnding());
		}
	}


