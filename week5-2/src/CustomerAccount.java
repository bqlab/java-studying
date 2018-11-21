
public class CustomerAccount extends Account {
	int id;
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
	public void richMan() {
		balance = balance + 100000;
	}
}
