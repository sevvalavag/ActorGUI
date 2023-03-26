import actors_main.FileHandler;
import actors_main.Actor;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {


        Actor actor = FileHandler.readActor( new File("data/actor7")) ;
        System.out.println("NAME : " + actor.name +  "\n" + "Birth Date : " + actor.birthDate +  "\n" +
                "Series : " + actor.series);

    }
}
