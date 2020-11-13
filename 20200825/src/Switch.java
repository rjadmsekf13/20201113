
/**
 * @PackageName		: 
 * @FileName		: Switch.java
 * @Since			: 2020. 8. 25
 * @Author			: KB
 * @Description		: switch문 연습
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 8. 25		KB				최초 작성
 *
 */
public class Switch {

	/**
	 * @MethodName		: main
	 * @Since			: 2020. 8. 25
	 * @author			: KB
	 * @Description		: 
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The Best Programming Language");
			break;
		}
		
		System.out.println("Do you like Java?");

	}

}
