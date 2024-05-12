import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGeneratorAndWriter {

    public static void saveJson(Hero hero) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter writer = new FileWriter(String.format("%s.json", hero.name().toLowerCase()));
        writer.write(gson.toJson(hero));
        writer.close();
    }
}
