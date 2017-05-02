import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client  prabhat;
		prabhat = new Client("127.0.0.1");
		prabhat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prabhat.startRunning();
	}
}