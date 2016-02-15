package aSimple;

public class Animal {
	
	public static final int MaxAnimals = 5;
	
	/**
	 * Doxygen doc tag githubstatstag:{ "thisIs": "classVariable" }
	 */
	protected static int NumOfAnimals;
	
	private String name = "name";
	private String type;
	private String sound = "rooar";
	private double weight = 0;
	private String color = "gray";
	
	/**
	 * Doxygen doc tag githubstatstag:{ "thisIs": "classMethod" }
	 */
	public Animal(String name) {
		this.name = name;
		NumOfAnimals++;
	}
	
	public void getName(){
		System.out.println(this.name);
	}
	
	public void setSound(String s){
		this.sound = s;
	}
	
	public void getSound(){
		System.out.println(this.name + " says: " + this.sound); 
	}
	
	
	

}
