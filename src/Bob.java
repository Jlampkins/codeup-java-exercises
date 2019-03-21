import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Talk to Bob!");
        scanner.next();
        if(scanner.next().endsWith("?")){
            System.out.println("Sure, brah");
        }else if(scanner.next().endsWith("!")){
            System.out.println("Whoa man, chill out!");
        }else if(scanner.next().equalsIgnoreCase(" ")) {
            System.out.println("All right, dude.  Be that way.");
        }else {
            System.out.println("Whatever, man.");
        }






    }
}
