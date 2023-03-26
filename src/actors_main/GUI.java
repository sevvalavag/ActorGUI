package actors_main;

import javax.swing.*;

public class GUI {
    public Actor[] actors;
    public JList<String> putinorder = new JList<>();
    public ActorDetailPanel panel = new ActorDetailPanel();

    public Actor[] getActors() {

        return actors;
    }

    public void refresh() {
        actors = FileHandler.readActors();
        String[] actorsnames = new String[actors.length];

        Actor[] actorsarray = actors;
        for (int i = 0, actorsLength = actorsarray.length; i < actorsLength; i++) {
            Actor actor = actorsarray[i];
            actorsnames[i] = actor.name;
        }
        putinorder.setListData(actorsnames);

    }

    public static JFrame createFrame(GUI guı) {

        return new Window(guı);
    }

    public void add(Actor actor) {

        panel.showActor(actor);
    }


    public void newWindow(Actor actor) {

            JFrame newwindow = new JFrame();
            ActorDetailPanel newpanel = new ActorDetailPanel();
            newwindow.add(newpanel);
            newpanel.showActor(actor);
            newwindow.setSize(500, 500);

            newwindow.setVisible(true);

        }
    }


