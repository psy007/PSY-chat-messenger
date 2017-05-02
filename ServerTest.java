import javax.swing.JFrame;

public class ServerTest {
	public static void main(String[] args) {
		Server sammie = new Server();
		sammie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sammie.startRunning();
	}
}