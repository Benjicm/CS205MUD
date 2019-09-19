
public class ItemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item();
		Item j = new Item("item", 1, true);
		i.setContainer(false, 1);
		j.setContainer(false, 1);
		System.out.println(i.isBeingCarried());
		System.out.println(i.getContainerID());
		System.out.println(j.isBeingCarried());
		System.out.println(j.getContainerID());
		i.setContainer(true, 2);
		j.setContainer(true, 2);
		System.out.println(i.isBeingCarried());
		System.out.println(i.getContainerID());
		System.out.println(j.isBeingCarried());
		System.out.println(j.getContainerID());
		//Expected output:
		//false
		//1
		//false
		//1
		//false
		//1
		//true
		//2
	}

}
