
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import model.Ember;
import view.FrameView;

public class FrameController {

    
    private Ember[] emberek;
    private FrameView frame;
    private ArrayList<JButton> buttons;

    public FrameController(Ember[] emberek) {
        this.emberek = emberek;
        this.frame = new FrameView(emberek);
        this.buttons = this.frame.getButtons();
        initButtonEvents();
        System.out.println("Buttons added: " + buttons.toArray().length);
    }
    
    public void show() {
        this.frame.setVisible(true);
    }
    
    private void initButtonEvents() {       
        int i = 0;
        for (Ember ember : emberek) {
            buttons.get(i).addActionListener((ActionEvent e) -> {
                frame.setOutput(
                    " - " + ember.bemutatkozik() + "\n" +
                    " - " + ember.holLakik() + "\n" +
                    " - " + ember.mitDolgozik() + "\n"
                );
            });
            
            i++;
        }
    }
}
