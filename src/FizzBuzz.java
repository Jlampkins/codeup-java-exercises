public class FizzBuzz {
    public static void main(String[] args) {
        for(int v = 1; v < 101; v++){
            if(v % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(v % 3 == 0){
                System.out.println("Fizz");
            }else if(v % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(v);
            }
        }
    }
}
