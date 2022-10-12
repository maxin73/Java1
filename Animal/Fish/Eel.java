package Animal.Fish;

public class Eel extends Fish{
  private String feature3 = "Release electric charge";

  public String getFeature3() {
    return this.feature3;
  }
  public void setFeature3(String feature3) {
    this.feature3 = feature3;
  }

  public Eel(int height, int weight, String animalType, String bloodType){
    super(height, weight, animalType, bloodType);
  } 

  public void showInfo(){
    System.out.println("Height is: " + this.getHeight() + "m");
    System.out.println("Weight is: " + this.getWeight() + "kg");
    System.out.println("Animal type is: " + this.getAnimalType());
    System.out.println("Blood type is: " + this.getBloodType());
    System.out.println(this.getFeature1());
    System.out.println(this.getFeature2());
    System.out.println(this.getFeature3());

  }
  }

