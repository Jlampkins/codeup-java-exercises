import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
//static
        public static String[] adjectives = {"blue", "ugly", "grand", "old", "boring", "exciting", "clumsy", "smart", "dumb", "massive", "idiotic", "jagged"};
        public static String[] nouns = {"dog", "cat", "duck", "dinosaur", "toenail", "fox", "box", "fork", "spoon", "knife", "banana", "guy"};


        public static String randomWord() {
            Random random = new Random();
            int randomAdj = random.nextInt(adjectives.length - 1);
            int randomNoun = random.nextInt(nouns.length - 1);
            return adjectives[randomAdj] + " " + nouns[randomNoun];
    }



}
