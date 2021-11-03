package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자 위치에 따라 먼저 증감하고 할당(=), 먼저 할당(=)하고 증가
		int cats = 5;
		System.out.println(cats++);
		System.out.println(cats);
		
		int dogs = 3;
		System.out.println(++dogs);
		
		int chickens = 10;
		
		int animals = cats + chickens++;
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);

	}

}
