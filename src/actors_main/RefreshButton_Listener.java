package actors_main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RefreshButton_Listener implements ActionListener {

    public GUI guı;

    public RefreshButton_Listener(GUI guı) {

        this.guı = guı;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        guı.refresh();

    }
}
