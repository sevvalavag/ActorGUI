package add_actor;

import actors_main.GUI;
import actors_main.ActorDetailPanel;
import actors_main.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddActor_ButtonListener implements ActionListener {


    public GUI guı;
    public Window window;
    public static JFrame newwindow = new JFrame();

    public AddActor_ButtonListener(GUI guı, Window window) {

        this.guı = guı;
        this.window = window;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        ActorDetailPanel panel = new ActorDetailPanel();
        newwindow.setSize(500, 500);
        newwindow.add(panel, BorderLayout.WEST);

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);


        window.nametextbox.setPreferredSize(new Dimension(50, 1));
        window.birth_datetextbox.setBounds(50, 50, 400, 30);
        window.textArea.setPreferredSize(new Dimension(100, 50));


        window.nametextbox.setFont(new Font("Arial", Font.BOLD, 16));
        window.birth_datetextbox.setFont(new Font("Arial", Font.BOLD, 16));
        window.textArea.setFont(new Font("Arial", Font.BOLD, 16));


        JLabel name = new JLabel("Name");
        JLabel birth_date = new JLabel("Birth Date");
        panel.add(name);
        panel.add(birth_date);
        panel.add(new JScrollPane(window.textArea));
        panel.add(window.copybutton);

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(name))
                        .addComponent(window.nametextbox)
                        .addComponent(birth_date)
                        .addComponent(window.birth_datetextbox)

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(window.textArea))

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(window.copybutton))
        );

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(name)
                                .addComponent(window.nametextbox))

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(birth_date)
                                .addComponent(window.birth_datetextbox))

                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(window.textArea))
                        .addComponent(window.copybutton)


        );


        newwindow.setVisible(true);


    }
}
