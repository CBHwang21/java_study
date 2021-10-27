package constructor;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("펭수");
		p1.setHeight(120.0);
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setHeight(172.5);
		
		Person p3 = new Person();
		p3.setName("라이언");
		p3.setHeight(165.5);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		
	}

}
