import java.util.Scanner;

/**
 * @PackageName		: 
 * @FileName		: Gcdl.java
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
public class Gcdl {

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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int big, small;
		if (num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		// 최대 공약수
		int gcd = getGcd(big , small);
		
		// 최소 공배수
		int lcm = getLcm(num1, num2, gcd);
		
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + lcm);
		sc.close();
		return;
	}
	public static int getGcd(int z, int x) {
		int gcd;
		while(true) {
			int rest = z % x;
			if (rest == 0) {
				gcd = x;
				break;
			} else {
				z = x;
				x = rest;		
			}
		
		}
		return gcd;
	}
	public static int getLcm(int z, int x, int c) {
		return z * x / c;
	}

}


