import java.util.Iterator;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DVD itemsOrdered[] = new DVD[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDVD (DVD disc) {
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full, cannot add " + disc.getTitle());
		}
		else {
			this.itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}
	
	public void adđVD(DVD []dvdList) {
		for (int index = 0; index < dvdList.length; index++) {
			addDVD(dvdList[index]);
		}
	}
	
	public void addDVD(DVD dvd1, DVD dvd2) {
		addDVD(dvd1);
		addDVD(dvd2);
	}
	
	public void removeDVD(DVD disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
		}
		else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (this.itemsOrdered[i] == disc) {
					this.itemsOrdered[i] = this.itemsOrdered[qtyOrdered - 1];
					this.itemsOrdered[qtyOrdered - 1] = null;
					qtyOrdered--;
				}
			}
			System.out.println("The disc has been deleted");
		}
	}
	
	public void viewCart() {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
		}
		else {
			for (int i = 0; i < qtyOrdered; i++) {
				System.out.println(itemsOrdered[i].getTitle());
			}
		}
	}
	
	double totalCost() {
		double costSum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			costSum += this.itemsOrdered[i].getCost();
		}
		return costSum;	
	}
	
	
}
