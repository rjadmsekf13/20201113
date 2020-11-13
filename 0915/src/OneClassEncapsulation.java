class SinusCap {
	void sniTake() {
		System.out.println("콧물이 나음");
	}

	void sneTake() {
		System.out.println("재채기가 나음");
	}

	void snuTake() {
		System.out.println("코막힘이 나음");
	}

	void take() {
		sniTake();
		sneTake();
		snuTake();
	}

}

class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

public class OneClassEncapsulation { // 캡슐화 O
	public static void main(String[] atgr) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}