import java.util.*;

public class RoomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Room r = new Room();
		r.addItem(1);
		r.addItem(2);
		r.addItem(3);
		System.out.println(r.containsItem(1));
		System.out.println(r.containsItem(2));
		System.out.println(r.containsItem(3));
		System.out.println(r.containsItem(4));*/
		RoomList rooms = new RoomList();
		int firstID = rooms.addRoom("This is the first room.");
		int secondID = rooms.addRoom("This is the second room.");
		rooms.addExitToRoom(firstID, secondID, Exit.NORTH);
		rooms.addExitToRoom(secondID, firstID, Exit.SOUTH);
		rooms.addChar(firstID, 1);
		rooms.addChar(secondID, 2);
		System.out.println("Room 1 contains char 1: ");
		System.out.println(rooms.containsChar(firstID, 1));
		System.out.println("Room 1 contains char 2: ");
		System.out.println(rooms.containsChar(firstID, 2));
		System.out.println("Room 2 contains char 1: ");
		System.out.println(rooms.containsChar(secondID, 1));
		System.out.println("Room 2 contains char 2: ");
		System.out.println(rooms.containsChar(secondID, 2));
		rooms.moveChar(firstID, 1, Exit.NORTH);
		System.out.println("Second test");
		System.out.println("Room 1 contains char 1: ");
		System.out.println(rooms.containsChar(firstID, 1));
		System.out.println("Room 1 contains char 2: ");
		System.out.println(rooms.containsChar(firstID, 2));
		System.out.println("Room 2 contains char 1: ");
		System.out.println(rooms.containsChar(secondID, 1));
		System.out.println("Room 2 contains char 2: ");
		System.out.println(rooms.containsChar(secondID, 2));
		rooms.moveChar(secondID, 2, Exit.SOUTH);
		rooms.moveChar(secondID, 1, Exit.SOUTH);
		System.out.println("Third test");
		System.out.println("Room 1 contains char 1: ");
		System.out.println(rooms.containsChar(firstID, 1));
		System.out.println("Room 1 contains char 2: ");
		System.out.println(rooms.containsChar(firstID, 2));
		System.out.println("Room 2 contains char 1: ");
		System.out.println(rooms.containsChar(secondID, 1));
		System.out.println("Room 2 contains char 2: ");
		System.out.println(rooms.containsChar(secondID, 2));
	}

}
