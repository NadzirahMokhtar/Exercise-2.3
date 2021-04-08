import java.util.Scanner;

public class Ruler {
	
	Scanner sc = new Scanner(System.in);
	
	void printRuler() {
		
		System.out.print("Enter the brand of the ruler : ");
		String brand = sc.next() + sc.nextLine();
		System.out.print("Enter the colour of the ruler : ");
		String colour = sc.next();
		System.out.print("Enter the length of the ruler (cm) : ");
		double length = sc.nextDouble();
		System.out.println("Brand :\t\t"+ brand);
		System.out.println("Colour :\t"+ colour);
		System.out.printf("Length :\t\t%.1f cm%n", length);
		
	}
	void totalPack() {
    		
    		System.out.print("\nEnter total pack of the ruler (kg) : ");
    		double pack = sc.nextDouble();
    		System.out.print("Enter the quantity of the ruler : ");
    		int quantity = sc.nextInt();
    		double totalPack = pack * quantity;
    		System.out.printf("Total pack of the ruler : %.2f kg%n", totalPack);
			
	}
	void printDiscountPrice() {
		
		System.out.print("\n====== Discount Price!! Get 1 pack of rulers and you're able to get another one! ======");
		System.out.print("\nHow many ruler do you want to buy ? : ");
		int quantity = sc.nextInt();
		if (quantity  >= 50) {
			System.out.println("You get a free ruler!");
		}
		else {
			System.out.println("You should more ruler to get free ruler!");
		}
		
	}
	void maxDurability() {
		System.out.print("Durability of ruler : ");
		String durability = sc.next() + sc.nextLine();
		System.out.println("Durability : \t\t" + durability);
	}
}