
package argvkw.main;

import model.Ember;

public class T_Zh_Ember1 {

    public static void main(String[] args) {
        System.out.println("T_Zh_Ember1 started...");
        
        Ember[] emberek = {
            new Ember("Ödön", 1999, "Üllő", "ács", "férfi"),
            new Ember("Klára", 1969, "Sopron"),
            new Ember("Petra", 1989, "Miskolc"),
            new Ember("Gedeon", 1947, "Budapest", "fodrász", "férfi"),
            new Ember("Anna", 2001, "Ózd"),
        };
        
        System.out.println("Emberek hozzáadva: " + emberek.length);
        
        
    }
}
