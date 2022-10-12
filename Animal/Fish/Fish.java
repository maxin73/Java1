package Animal.Fish;

import Animal.Animal;

public class Fish extends Animal {
  private String feature1 = "Live in water";
  private String feature2 = "Has gills";

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

  public Fish(){
    super();
  }

  public Fish(int height, int weight, String animalType, String bloodType){
    super(height, weight, animalType, bloodType);
  }
}
