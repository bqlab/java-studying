import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class MyFriendsList extends JFrame {
	public MyFriendsList() {
		setSize(300, 400);
		setTitle("list");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeUI();
		setVisible(true);
	}
	private void makeUI() {
		String[] friends = {"hone", "lee", "kim" };
		JList<String> list = new JList<String>(friends);
		add(new JScrollPane(list));
	}
	public static void main(String[] args) {
		MyFriendsList list = new MyFriendsList();
	}
}
