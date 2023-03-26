package actors_main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    public static Actor[] readActors() {
        File klasör = new File("data");

        File[] files = klasör.listFiles();

        Actor[] actors = new Actor[files.length];

        for (int i = 0; i < files.length; i++) {
            try {

                actors[i] = readActor(files[i]);
            } catch (FileNotFoundException exception) {

                exception.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return actors;
    }

    public static Actor readActor(File file) throws IOException {
        File filebeingread = file;

        FileInputStream filereader = new FileInputStream(filebeingread);
        Scanner input = new Scanner(filereader);
        String name = input.nextLine();
        String birthDate = null;
        List<String> strings = new ArrayList<>();

        if (input.hasNextLine()) {

            birthDate = input.nextLine();

            if (birthDate.equals("")) {

                birthDate = null;

            }

            if (input.hasNextLine()) {
                String seriesline = input.nextLine();
                String[] split = seriesline.split(",");
                strings = Arrays.asList(split);

            } else {

                strings = new ArrayList<>();
            }
        }

        filereader.close();

        return new Actor(name, new ArrayList<>(strings), filebeingread, birthDate);
    }
}
