package actors_main;

import add_actor.DateOfBirth_Listener;
import add_actor.NameTextBoxListener;
import add_actor.AddActor_ButtonListener;
import add_actor.CopyButton_Listener;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private final JPanel leftpanel = new JPanel();

    private final JButton add_actorbutton = new JButton("add actor");
    private final JButton refreshbutton = new JButton("refresh");
    private final JButton deletebutton = new JButton("delete");
    public final JTextField textbox = new JTextField();
    public final JTextField nametextbox = new JTextField();
    public final JTextField birth_datetextbox = new JTextField();
    public final JTextArea textArea = new JTextArea(0, 15);
    public final JButton copybutton = new JButton("Copy >>>");

    public Window(GUI guı) {

        Window window = this;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        GroupLayout layout = new GroupLayout(leftpanel);

        leftpanel.setLayout(layout);

        refreshbutton.setPreferredSize(new Dimension(40, 40));
        add_actorbutton.setPreferredSize(new Dimension(50, 50));
        deletebutton.setPreferredSize(new Dimension(100, 100));
        textbox.setPreferredSize(new Dimension(100, 50));
        setSize(500, 500); // set the size of the frame
        add(leftpanel, BorderLayout.WEST);


        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(guı.putinorder)
                                .addComponent(textbox)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(deletebutton)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(add_actorbutton)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(refreshbutton)
                        )

        );

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(add_actorbutton)
                                .addComponent(refreshbutton)
                                .addComponent(deletebutton)
                                .addComponent(guı.putinorder)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(textbox))
        );


        ActionListener buttonlistener = new RefreshButton_Listener(guı);
        ListSelectionListener listener = new JListListener(guı);
        ActionListener actorbutton = new AddActor_ButtonListener(guı, window);
        ActionListener sil = new Delete_ButtonListener(guı);
        ActionListener ara = new TextBox_Listener(guı, window);
        ActionListener isim = new NameTextBoxListener(guı, window);
        ActionListener yas = new DateOfBirth_Listener(guı, window, (NameTextBoxListener) isim);
        ActionListener copy = new CopyButton_Listener(guı, window, (NameTextBoxListener) isim);


        refreshbutton.addActionListener(buttonlistener);
        guı.putinorder.addListSelectionListener(listener);
        add_actorbutton.addActionListener(actorbutton);
        deletebutton.addActionListener(sil);
        textbox.addActionListener(ara);
        nametextbox.addActionListener(isim);
        birth_datetextbox.addActionListener(yas);
        copybutton.addActionListener(copy);


    }
}
