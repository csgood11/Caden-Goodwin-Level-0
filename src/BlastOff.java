
public class BlastOff {
	public static void main(String[] args) throws InterruptedException {
		for (int ctr = 10; ctr >= 0; ctr--) {
			System.out.println(ctr);
			Thread.sleep(1000);
		}
		System.out.println("Blash Off!");
	}
}
