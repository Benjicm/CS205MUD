
public class ExitTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r = new Room();
		r.addExit(1, Exit.NORTH);
		r.addExit(2, Exit.EAST);
		r.addExit(3, Exit.SOUTH);
		r.addExit(4, Exit.WEST);
		int firstExit = r.getConnectedRoomID(Exit.NORTH);
		int secondExit = r.getConnectedRoomID(Exit.EAST);
		int thirdExit = r.getConnectedRoomID(Exit.SOUTH);
		int fourthExit = r.getConnectedRoomID(Exit.WEST);
		int fifthExit = r.getConnectedRoomID(Exit.NORTHEAST);
		System.out.println(firstExit);
		System.out.println(secondExit);
		System.out.println(thirdExit);
		System.out.println(fourthExit);
		System.out.println(fifthExit);
		r.addExit(5, Exit.NORTHEAST);
		r.addExit(6, Exit.EAST);
		secondExit = r.getConnectedRoomID(Exit.EAST);
		fifthExit = r.getConnectedRoomID(Exit.NORTHEAST);
		System.out.println(firstExit);
		System.out.println(secondExit);
		System.out.println(thirdExit);
		System.out.println(fourthExit);
		System.out.println(fifthExit);
		//Expected output:
		//1
		//2
		//3
		//4
		//0
		//1
		//2
		//3
		//4
		//5
		
	}

}
