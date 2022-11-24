
public class Aim {

	public static void main(String[] args) {
		//Create a new cart
		Cart anOrderCart = new Cart();
		
		//Create new DVD objects and add them to the cart
		DVD dvd1 = new DVD("The Lion King", "Animation", 19.95f, "Roger Allers", 87);
		anOrderCart.addDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction", 24.95f, "George Lucas", 87);
		anOrderCart.addDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
		anOrderCart.addDVD(dvd3);
		
		System.out.print("Total Cost is: ");
		System.out.println(anOrderCart.totalCost());
		System.out.println("First list:");
		anOrderCart.viewCart();
		anOrderCart.removeDVD(dvd3);
		System.out.println("After update list:");
		anOrderCart.viewCart();
	}

}
