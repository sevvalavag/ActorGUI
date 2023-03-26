package add_actor;

import actors_main.GUI;
import actors_main.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class CopyButton_Listener implements ActionListener {

    public GUI guı;
    public Window window;
    public NameTextBoxListener object;
    public static List<String> strings = null;

    public CopyButton_Listener(GUI guı, Window window, NameTextBoxListener object) {

        this.guı = guı;
        this.window = window;
        this.object = object;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String serieslines = window.textArea.getText();
            String[] split = serieslines.split("\n");
            strings = Arrays.asList(split);

        } catch (NullPointerException exception) {

            exception.printStackTrace();

        }
        object.actionPerformed(e);

    }
}
