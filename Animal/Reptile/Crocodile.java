package Animal.Reptile;

public class Crocodile extends Reptile{
  private String eggs = "hard";

  public String getEggs() {
    return this.eggs;
  }
  public void setEggs(String eggs) {
    this.eggs = eggs;
  }

  public Crocodile(int height, int weight, String animalType, String bloodType){
    super(height, weight, animalType, bloodType);
  } 

  public void showInfo(){
    System.out.println("Height is: " + this.getHeight() + "m");
    System.out.println("Weight is: " + this.getWeight() + "kg");
    System.out.println("Animal type is: " + this.getAnimalType());
    System.out.println("Blood type is: " + this.getBloodType());
    System.out.println("Skin is: " + this.getSkin());
    System.out.println("Bone is: " + this.getBone());
    System.out.println("Egg shell is: " + this.getEggs());
  }
  }

  



