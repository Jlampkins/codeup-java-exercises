public class MethodExercises {
    public static void main(String[] args) {


        System.out.println(add(1, 2));
        System.out.println(subtract(5, 4));
        System.out.println(multiply(5, 6));
        System.out.println(divide(4, 2));
        System.out.println(modular(12, 4));


    }



    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modular(int num1, int num2) {
        return num1 % num2;
    }

//    public static int loopmult(int num1, int num2) {
//        for (int i = 1; i < num1; i++)
//            return num1 + num2;
//    }
}


