package test;

public class TernaryCondition {

	public static void main(String[] args) {
		// 상황 조건 연산자 : 조건 ? A : B
		System.out.println(true? "yes" : "no");
		System.out.println(false? "yes" : "no");
		
		int value = 9;
		value = value > 100 ? 100 : value;
		System.out.println(value);

		int[] values = { 6, 7, 99, 45, 34 };
		int max = 0;
		for (int x : values) {
			max = x > max ? x : max;
		}
		System.out.println(max);
	}

}
