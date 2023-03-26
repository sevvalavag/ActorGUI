package add_actor;

import actors_main.GUI;
import actors_main.Actor;
import actors_main.Window;
import actors_main.CreateRandomString;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;

public class NameTextBoxListener implements ActionListener {


    public GUI guı;
    public Window window;
    public File file = new File("data/" + CreateRandomString.randomString(5));


    public NameTextBoxListener(GUI guı, Window pencere) {

        this.guı = guı;
        this.window = pencere;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NullPointerException {

        Actor actor8 = new Actor(window.nametextbox.getText(), CopyButton_Listener.strings, file, window.birth_datetextbox.getText());

        try {
            FileOutputStream stream = new FileOutputStream(file);

            PrintStream out = new PrintStream(stream);

            out.println(actor8.name);
            out.println(actor8.birthDate);
            out.println(actor8.series);
            guı.refresh();
            AddActor_ButtonListener.newwindow.dispatchEvent(new WindowEvent(AddActor_ButtonListener.newwindow,
                    WindowEvent.WINDOW_CLOSING));
            guı.newWindow(actor8);


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }


    }
}
