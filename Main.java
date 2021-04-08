
public class Main {

	public static void main(String[] args) {
		
		Ruler myRuler = new Ruler();
		Ruler ainRuler = new Ruler();
		
		System.out.println("My Ruler");
		System.out.println("-------------------------------");
		System.out.println();
		myRuler.printRuler();
		myRuler.totalPack();
		myRuler.printDiscountPrice();
		myRuler.maxDurability();
		
		System.out.println("Ain Ruler");
		System.out.println("-------------------------------");
		System.out.println();
		ainRuler.printRuler();
		ainRuler.totalPack();
		ainRuler.printDiscountPrice();
		myRuler.maxDurability();
		
	}
}
