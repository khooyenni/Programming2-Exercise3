package Exercise3;

public class Main {

	public static void main(String[] args) {
		
		Multicooker tefal = new Multicooker();
		
		System.out.println("*****Tefal*****");
		System.out.println("Brand           : " + tefal.brand);
		System.out.println("Model           : " + tefal.model);
		System.out.println("Colour          : " + tefal.colour);
		System.out.println("Power           : " + tefal.power + "W");
		System.out.println("Bowl Capacity   : " + tefal.bowlCapacity + "L" );
		System.out.println("Price           : " + "RM" + tefal.price);
		System.out.println();
		
		Multicooker philips = new Multicooker("Philips", "HD2145/62", "Black", 1000, 6, 1099);
		System.out.println("*****Philips*****");
		System.out.println("Brand           : " + philips.brand);
		System.out.println("Model           : " + philips.model);
		System.out.println("Colour          : " + philips.colour);
		System.out.println("Power           : " + philips.power + "W");
		System.out.println("Bowl Capacity   : " + philips.bowlCapacity + "L" );
		System.out.println("Price           : " + "RM" + philips.price);
		System.out.println();
		
		Multicooker butterfly = new Multicooker("Butterfly", "BMC-818", "Blue", 1600, 5, 230);
		System.out.println("*****Butterfly*****");
		System.out.println("Brand           : " + butterfly.brand);
		System.out.println("Model           : " + butterfly.model);
		System.out.println("Colour          : " + butterfly.colour);
		System.out.println("Power           : " + butterfly.power + "W");
		System.out.println("Bowl Capacity   : " + butterfly.bowlCapacity + "L" );
		System.out.println("Price           : " + "RM" + butterfly.price);
		System.out.println();

	}

}
