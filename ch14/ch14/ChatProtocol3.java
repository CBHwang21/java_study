package ch14;

public class ChatProtocol3 {

	public static final String ID = "ID";
	// (Client -> Server) ID:aaa;1234
	// (Client -> Server) CHATLIST:aaa; bbb; ccc; ddd;

	public static final String CHAT = "CHAT";
	// (Client -> Server) CHAT:받는아이디;채팅메세지 ex) CHAT: bbb;밥묵자
	// (Client -> Server) CHAT:보내는아이디;채팅메세지 ex) CHAT: aaa;밥묵자
	
	public static final String CHATALL = "CHATALL";
	// (Client -> Server) CHATALL:채팅메세지
	// (Client -> Server) CHATALL:[보내는아이디]채팅메세지
	
	public static final String MESSAGE = "MESSAGE";
	// (Client -> Server) MESSAGE:받는아이디;쪽지 ex) MESSAGE:bbb;밥묵자
	// (Client -> Server) MESSAGE:보내는아이디;쪽지 ex) MESSAGE:aaa;밥묵자
	
	public static final String CHATLIST = "CHATLIST";
	// (Client -> Server) CHATLIST:aaa;bbb;ccc;ddd;


}