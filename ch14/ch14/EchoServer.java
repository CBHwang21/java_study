package ch14;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		try {
			int cnt = 0;	// Client의 접속갯수
			ServerSocket server = new ServerSocket(8000);
			System.out.println("ServerSocket Start..........");
			while(true) {
				Socket sock = server.accept();	// wait
				
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 클라이언트 담당은 Thread로 만들어야 한다.(내부클래스)
	
	class EchoThread extends Thread {
		@Override
		public void run() {
			
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
