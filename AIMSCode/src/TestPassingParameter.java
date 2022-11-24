
public class TestPassingParameter {

	public static void main(String[] args) {
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		
	}
	
	public static void swap(DVD o1, DVD o2) {
		DVD tmpObject = new DVD(o1.getTitle());
		o1.setTitle(o2.getTitle());
		o2.setTitle(tmpObject.getTitle());
	}
}
