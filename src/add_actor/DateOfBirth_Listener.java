package add_actor;

import actors_main.GUI;
import actors_main.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DateOfBirth_Listener implements ActionListener {


    public GUI guı;
    public Window pencere;
    public NameTextBoxListener object;

    public DateOfBirth_Listener(GUI guı, Window window, NameTextBoxListener object) {

        this.guı = guı;
        this.pencere = window;
        this.object = object;
    }


    @Override
    public void actionPerformed(ActionEvent event) {

        object.actionPerformed(event);


    }
}
