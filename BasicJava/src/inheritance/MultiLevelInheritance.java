package inheritance;

class whatsup {

	void voiccall() {
		System.out.println("user can do voce call");
	}
}
class videocall extends whatsup{
	 void videocall1() {
		System.out.println("user can do video call");
	}
}
class chatting extends videocall{
	void chat() {
		System.out.println("user is chatting");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		chatting disp = new chatting();
		disp.videocall1();
		disp.voiccall();
		disp.chat();

	}

}
