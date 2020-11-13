
/**
 * @PackageName :
 * @FileName : BadEncapsulation.java
 * @Since : 2020. 9. 15
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 15 KB 최초 작성
 *
 */
class SinivelCap {
	void take() { // 콧물용
		System.out.println("콧물이 나음");
	}
}

class SneezeCap { // 재채기용
	void take() {
		System.out.println("재채기가 나음");
	}
}

class SmuffleCap { // 코막힘용
	void take() {
		System.out.println("코막힘이 나음");
	}
}

class ColdPatient {
	void takeSinivelCap(SinivelCap Cap) {
		cap.take();
	}

	void takeSneezeCap(SneezeCap Cap) {
		cap.take();
	}

	void takeSmuffleCap(SmuffleCap Cap) {
		cap.take();
	}
}

class BadEncapsulation { // 캡슐화 x
	public static void main(String[] atgs) {
		ColdPatient suf = new ColdPatient();

		suf.takeSinivelCap(new SinivelCap());

		suf.takeSneezeCap(new SneezeCap());

		suf.takeSmuffleCap(new SmuffleCap());
	}

}
