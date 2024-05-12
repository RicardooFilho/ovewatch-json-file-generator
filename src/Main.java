import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome de um personagem do Overwatch que você deseja saber mais informações: ");
        String heroName = scan.nextLine();

        Hero hero = OverwatchAPI.getHeroInformations(heroName);

        FileGeneratorAndWriter.saveJson(hero);
    }
}