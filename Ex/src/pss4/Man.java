package pss4;

public class Man extends Mammalia{
	private int arms;
	public Man() {
		super.head = 1;
		super.legs = 2;
		this.arms = 2;
	}
	@Override
	public void cry() {
		System.out.println("운다");
	}
	@Override
	public String toString() {
		return "Man [arms=" + arms + ", head=" + head + ", legs=" + legs + "]";
	}
}
