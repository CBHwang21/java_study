package ch14;

import java.net.InetAddress;

public class InetAddressEx1 {
	public static void main(String[] args) {
		//java.net, java.io ??λΆ?λΆμ ?΄??€ λ°? λ©μ? ??Έμ²λ¦¬ 
		try {
			//?λ©μΈ?Όλ‘? ip μΆλ ₯?? ?΄??€
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("λ‘μ»¬μ»΄ν¨?°?΄λ¦? : " + add.getHostName());
			System.out.println("λ‘μ»¬μ»΄ν¨?°ip : " + add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("?₯?: " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			//λ°°μ΄ λ°μ ?­? forλ¬Έμ΄ ??€.
			System.out.println("-------------------");
			System.out.println("?€?΄λ²?");
			for (int i = 0; i < adds.length; i++) {
				System.out.println(adds[i]);
			}
		} catch (Exception e) {
			//??Έ? ??€? λ¦¬κΉμ§? μΆλ ₯?? λ©μ?
			e.printStackTrace();
		}
	}
}








