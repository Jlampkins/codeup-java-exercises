public class StringExercise {
    public static void main(String[] args) {



//        String cheese = "chEEse";
//        System.out.println(cheese);
//
//        char letter = cheese.charAt(1);
//        System.out.println(letter);
//
//        int index = cheese.indexOf("s");
//        System.out.println(index);
//
//        System.out.println(cheese.toUpperCase());
//        System.out.println(cheese.toLowerCase());
//
//        System.out.println(cheese.toUpperCase().charAt(1));
//
//        System.out.println(cheese.substring(2).toUpperCase());
//
//        if(cheese.equalsIgnoreCase("cheese"))
//            System.out.println("snap");
//        else
//            System.out.println("No Cheese!");
//
//
//        if (cheese.startsWith("che"))
//        System.out.println("snap");
//        else
//            System.out.println("no!");
//
//        if (cheese.endsWith("ese"))
//        System.out.println("yay!");
//        else
//        System.out.println("no!");
//
//        System.out.println(cheese.charAt(cheese.length() - 1));

//char -1 for the last one

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
