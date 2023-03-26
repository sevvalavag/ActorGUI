package actors_main;

import javax.swing.*;
import java.awt.*;

public class Main2 {

    public static void main(String[] args) {

        GUI guı = new GUI();

        JFrame application = GUI.createFrame(guı);
        application.add(guı.panel, BorderLayout.CENTER);

        guı.refresh();
        application.setVisible(true);

    }

}
