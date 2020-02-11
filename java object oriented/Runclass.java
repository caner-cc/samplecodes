
public class Runclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String j = "";
		String p = "";
		String l = "";
		
		Human pepe = new Human();
		Mammal pooh = new Mammal();
		Student lisa = new Student();
		Teacher john = new Teacher();		
		Cat baron = new Cat();
				
		pepe.Speak();
		pepe.Eat();
		pepe.setSosnumber("111111A1111");
		System.out.println("pepe's sosnr. is " + pepe.getSosnumber());
		System.out.println("pepe says " +pepe.Speak(p)); 
		
		pooh.Eat();
		
		lisa.Eat();
		lisa.Speak();
		lisa.setSosnumber("787976Q9856");
		System.out.println("lisa's sosnr. is " +lisa.getSosnumber());
		System.out.println("lisa says " + lisa.Speak(l)); 
		lisa.setStudies("Literature");
		System.out.println("Lee studies "+ lisa.getStudies());
		
		baron.setTail("Black");
		System.out.println("The color of baron's tail is " + baron.getTail());
		baron.sleep();
		baron.eat();
		baron.setWeight(89);
		System.out.println("baron weighs " + baron.getWeight());
		
		john.Eat();
		john.Speak();
		john.setSosnumber("569658P1256");
		System.out.println("john's sosnr. is " +john.getSosnumber());
		System.out.println("john says " + john.Speak(j)); 
		
		
	}

}
