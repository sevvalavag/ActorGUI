package actors_main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextBox_Listener implements ActionListener {

    public GUI guı;
    public Window window;

    public TextBox_Listener(GUI guı, Window window) {

        this.guı = guı;
        this.window = window ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i < guı.actors.length ; i++){

           String object = guı.actors[i].name;
            if(window.textbox.getText().equals(object)){

                System.out.println(object);

                guı.newWindow(guı.actors[i]);

            }
        }
    }
}
