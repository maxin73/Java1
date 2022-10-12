package Animal.Reptile;

import Animal.Animal;

public class Reptile extends Animal{

	private String skin = "dry";
	private String bone = "backbone";
	private String eggs = "soft";

	public String getSkin() {
		return this.skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getBone() {
		return this.bone;
	}
	public void setBone(String bone) {
		this.bone = bone;
	}

	public String getEggs() {
		return this.eggs;
	}
	public void setEggs(String eggs) {
		this.eggs = eggs;
	}

	public Reptile(){
		super();
	}

	public Reptile(int height, int weight, String animalType, String bloodType){
		super(height, weight, animalType, bloodType);
	}
	}


