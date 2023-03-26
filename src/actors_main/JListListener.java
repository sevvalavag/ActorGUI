package actors_main;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListListener implements ListSelectionListener {

    public GUI guı;
    public Window pencere ;
    public JListListener(GUI guı) {

        this.guı = guı;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int selectedIndex = guı.putinorder.getSelectedIndex();
            if (selectedIndex == -1) {
                return;
            }

            Actor actor = guı.actors[selectedIndex];
            guı.newWindow(actor);

        }

    }
}

