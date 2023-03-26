package actors_main;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ActorDetailPanel extends JPanel {


    public void showActor(Actor actor) {

        JLabel label2 = new JLabel(actor.name);
        this.removeAll();
        this.add(label2);


        if(actor.birthDate != null){

            int dogumtarihi = Integer.parseInt(actor.birthDate);
            int yas = 2022 - dogumtarihi ;

            JLabel label4 = new JLabel(String.valueOf(yas));
            this.add(label4);
        }

        List<String> dizisimleri = actor.series;
        String atama = " , ";
        String res = String.join(atama, dizisimleri);
        JLabel label3 = new JLabel(res);
        label2.setFont(new Font("Serif", Font.PLAIN, 30));
        this.add(label3);

        this.updateUI();


    }


}
