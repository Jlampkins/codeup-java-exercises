import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
boolean bobisStillTalking = true;

        do {
            System.out.print("What do you want?");
            String response = scanner.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure, brah");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa man, chill out!");
            } else if (response.length() == 0) {
                System.out.println("All right, dude.  Be that way.");
            } else if(response.equals("bye")){
                System.out.println("Talk to you later");
                bobisStillTalking = false;
            }else{
                System.out.println("Whatever, man.");
            }

        }while (bobisStillTalking);

    }
}
