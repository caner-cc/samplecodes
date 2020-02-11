
public class Human extends Animal {

	private String sosnumber;
	
	public void Speak() {
		System.out.println("I am speaking");		
	}
	
	public String Speak(String speak) {
		speak = "I am speaking like a human";
		return speak;
		
	}
	
	public void Eat(){
		
		System.out.println("I am eating like a human.");		
	}

	
	
	public String getSosnumber() {
		return sosnumber;
	}

	public void setSosnumber(String sosnumber) {
		if (sosnumber.matches("\\d{6}\\w\\d{4}")){
		this.sosnumber = sosnumber;
		}
	}
	
	
}
