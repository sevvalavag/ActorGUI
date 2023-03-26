package actors_main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete_ButtonListener implements ActionListener {

    public GUI guı;

    public Delete_ButtonListener(GUI guı){

        this.guı = guı ;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = guı.putinorder.getSelectedIndex();
        Actor actor = guı.actors[selectedIndex];
        System.out.println("to be deleted" + selectedIndex);

       boolean deleted = actor.filebeingread.delete();

       System.out.println(deleted);
       guı.refresh();

    }
}
