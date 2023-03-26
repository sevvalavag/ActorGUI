package actors_main;
public class Main3 {
    public static void main(String[] args) {

       Actor[] actors = FileHandler.readActors();

       String names = "" ;

       for( int i = 0 ; i< actors.length ; i++ ){

           names = names + actors[i].name + "\n";
       }


    }
}
