package javaex.games.gugudangame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @PackageName : javaex.gugudangame
 * @FileName : GugudanGame.java
 * @Since : 2020. 9. 11
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 11 KB 최초 작성
 *
 */
public class GugudanGame { // 2초 구구단 게임
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Gugudan1 = new ArrayList<String>();
		ArrayList<String> Gugudan2 = new ArrayList<String>();

		String[] Gugudan = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < Gugudan.length; i++) {

			Gugudan1.add(Gugudan[i]);
			Gugudan2.add(Gugudan[i]);
		}
		double randomValue = Math.random();

		int ran = (int) (randomValue * Gugudan1.size()) - 1;

		String get_Gugudan1 = Gugudan1.get(ran);

		Gugudan1.remove(ran);
		
		System.out.println(get_Gugudan1);
		
		Collections.shuffle(Gugudan2);
		String get_Gugudan2 = Gugudan2.get(0);
		
		Gugudan1.remove(0);
		
		System.out.println(get_Gugudan2);
	}
}
