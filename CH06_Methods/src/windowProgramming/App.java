package windowProgramming;

public class App {

	public static void main(String[] args) {
		Window win = new Window();
		win.setWidth(400);
		win.setIsVisible(true);
		
		System.out.println("창의 가로길이 : " + win.getWidth());
		System.out.println("보이는가 ? " + win.getIsVisible());

	}

}
