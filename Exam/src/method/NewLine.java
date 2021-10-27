package method;

public class NewLine {

	public static void main(String[] args) {
		System.out.println("라인 1");
		threeLines();
		System.out.println("라인 2");

	}
	
	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}
	 private static void oneLine() {
		 System.out.println(); // 한줄띄움
	 }
}
