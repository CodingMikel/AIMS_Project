
public class TestPassingParameter {

	public static void main(String[] args) {
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmpObject = o1;
		o1 = o2;
		o2 = tmpObject;
	}
	
	public static void changeTitle(DVD dvd, String title) {
		String oldTitleString = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(oldTitleString);
	}
	
}
