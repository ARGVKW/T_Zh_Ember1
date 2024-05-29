package controller;

import model.Ember;
import view.ConsoleView;

public class ConsoleController {

    private Ember model;
    private ConsoleView view;

    public ConsoleController(Ember model) {
        this.model = model;
        this.view = new ConsoleView();
    }
    
    public void bemutatkozik() {
        this.view.display(this.model.bemutatkozik());
    }
    
    public void holLakik() {
        this.view.display(this.model.holLakik());
    }
    
    public void mitDolgozik() {
        this.view.display(this.model.mitDolgozik());
    }
    
}
