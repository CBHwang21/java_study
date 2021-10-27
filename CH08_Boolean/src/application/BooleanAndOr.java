package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// And Or 동시에 사용
		boolean isRaining = false;	// 비가 오는가?
		boolean mightRain = true;	// 비가 올수도 있는가?
		boolean haveUmbrella = true;	// 우산을 있는가?
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
		
		boolean rainCheck = isRaining || mightRain;	// 비가 오거나 올수도 있거나 일때 참
		
		if(rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
	}

}
