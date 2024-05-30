
package argvkw.main;

import controller.ConsoleController;
import controller.FrameController;
import model.Ember;

public class T_Zh_Ember1 {

    public static void main(String[] args) {
        System.out.println("T_Zh_Ember1 program indul...");
        
        Ember[] emberek = {
            new Ember("Ödön", 1999, "Üllő", "ács", "férfi"),
            new Ember("Klára", 1969, "Sopron"),
            new Ember("Petra", 1989, "Miskolc"),
            new Ember("Gedeon", 1947, "Budapest", "fodrász", "férfi"),
            new Ember("Anna", 2001, "Ózd"),
        };
        
        System.out.println("Emberek hozzáadva: " + emberek.length);
        
        for (Ember ember : emberek) {
            ConsoleController consoleEmber = new ConsoleController(ember);
            consoleEmber.bemutatkozik();
        }
        
        System.out.println("Konzol nezet elindult");
               
        FrameController frameEmberek = new FrameController(emberek);
        frameEmberek.show();
        
        System.out.println("GUI elindult");
    }
}
