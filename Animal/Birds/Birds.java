package Animal.Birds;

import Animal.Animal;

public class Birds extends Animal{
	private String feature1 = "animals with feathers";
	private String feature2 = "can fly";

	public String getFeature1() {
		return this.feature1;
	}
	public void setFeature1(String feature1) {
		this.feature1 = feature1;
	}

	public String getFeature2() {
		return this.feature2;
	}
	public void setFeature2(String feature2) {
		this.feature2 = feature2;
	}
  
	
public Birds() {
	super();
}

public Birds(int height, int weight, String animalType, String bloodType){
	super(height, weight, animalType, bloodType);
}
}

