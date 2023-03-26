package actors_main;

import java.io.File;
import java.util.List;

public class Actor {

    public String name ;
    public List<String> series;
    public final File filebeingread;
    public String birthDate;


    public Actor(String name, List<String> series, File filebeingread, String birthDate){

        this.name = name ;
        this.series = series;
        this.filebeingread = filebeingread;
        this.birthDate = birthDate;
    }
}
