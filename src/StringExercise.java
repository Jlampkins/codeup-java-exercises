public class StringExercise {
    public static void main(String[] args) {
        String message = "We don't need no education";
//        System.out.println(message);
        message += "\nWe don't need no thought control";
        message += "\nCheck \"this\" out!, \"s inside of \"s!\"";
        message += "\nIn windows, the main drive is usually C:\\";

//        message.replace("\\", "\\\\");
        message += "\nI can do backslashes \\, double backslashes \\\\,\n and the amazing triple backslash \\\\\\!";
        System.out.printf("%s", message);


    }
}
