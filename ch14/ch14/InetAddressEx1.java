package ch14;

import java.net.InetAddress;

public class InetAddressEx1 {
	public static void main(String[] args) {
		//java.net, java.io ??ë¶?ë¶„ì˜ ?´?˜?Š¤ ë°? ë©”ì†Œ?“œ ?˜ˆ?™¸ì²˜ë¦¬ 
		try {
			//?„ë©”ì¸?œ¼ë¡? ip ì¶œë ¥?•˜?Š” ?´?˜?Š¤
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("ë¡œì»¬ì»´í“¨?„°?´ë¦? : " + add.getHostName());
			System.out.println("ë¡œì»¬ì»´í“¨?„°ip : " + add.getHostAddress());
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("?˜¥?…˜: " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			//ë°°ì—´ ë°‘ì— ?•­?ƒ forë¬¸ì´ ?ˆ?‹¤.
			System.out.println("-------------------");
			System.out.println("?„¤?´ë²?");
			for (int i = 0; i < adds.length; i++) {
				System.out.println(adds[i]);
			}
		} catch (Exception e) {
			//?˜ˆ?™¸?˜ ?ˆ?Š¤?† ë¦¬ê¹Œì§? ì¶œë ¥?˜?Š” ë©”ì†Œ?“œ
			e.printStackTrace();
		}
	}
}








