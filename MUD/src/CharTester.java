import java.util.*;

public class CharTester {
	public static void main(String[] args)
	{
		Character c = new Character();
		c.addItem(1);
		c.addItem(2);
		c.addItem(3);
		c.addItem(4);
		c.addItem(5);
		printInv(c);
		System.out.println(c.holdingItem(3));
		c.addItem(4);
		c.removeItem(3);
		printInv(c);
		System.out.println(c.holdingItem(3));
	}
	public static void printInv(Character c)
	{
		ArrayList<Integer> inv = c.getInv();
		for(int i = 0; i < inv.size(); i++)
		{
			System.out.println(inv.get(i));
		}
	}
}
