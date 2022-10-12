import Animal.Reptile.*;
import Animal.Fish.*;
import Animal.Birds.*;

public class App {
    public static void main(String[] args) throws Exception {
    
    Crocodile crocodile = new Crocodile(2, 100, "Reptile", "B");
    Eel eel = new Eel(1, 1, "Fish", "A");
    Eagle eagle = new Eagle(2, 40, "Bird", "N");
    
    System.out.println("========Crocodile");
    crocodile.showInfo();
    System.out.println("==============Eel");
    eel.showInfo();
    System.out.println("============Eagle");
    eagle.showInfo();

    }
}
