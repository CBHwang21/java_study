package interfaces;

public class App {

	public static void main(String[] args) {
		
		Describable[] objs = { new Person(), new Computer() };
		
		for(Describable obj : objs) {
			System.out.println(obj.getDescribtion());
		}

	}

}
