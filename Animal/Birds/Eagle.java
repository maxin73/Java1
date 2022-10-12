package Animal.Birds;

public class Eagle extends Birds{
  public Eagle(int height, int weight, String animalType, String bloodType){
    super(height, weight, animalType, bloodType);
  }
  public void showInfo(){
    System.out.println("Height is: " + this.getHeight() + "m");
    System.out.println("Weight is: " + this.getWeight() + "kg");
    System.out.println("Animal type is: " + this.getAnimalType());
    System.out.println("Blood type is: " + this.getBloodType());
    System.out.println("They are " + this.getFeature1());
    System.out.println("Also they " + this.getFeature2());
  }
}
