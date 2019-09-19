
public class RoomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r = new Room();
		r.addItem(1);
		r.addItem(2);
		r.addItem(3);
		System.out.println(r.containsItem(1));
		System.out.println(r.containsItem(2));
		System.out.println(r.containsItem(3));
		System.out.println(r.containsItem(4));
	}

}
