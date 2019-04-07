package oop;
class CustomerException extends Exception{}
public class ExceptionsSandbox {
    public static void dangerMethod() throws CustomerException{
        System.out.println("this bad, dawg");
        throw new CustomerException();

    }


    public static void main(String[] args) {
        String[] words = {"one", "two", "three"};
        try {
            System.out.println(words[4]);
        } catch (Exception e) {
            System.out.println("YOU DUN did it wrong, idiot");
        }
        int i = 3;
        try {
            if (i < 0 || i >= words.length)
                throw new Exception("I made this error message so I know what is going on");
            System.out.println("Here we are in the danger zone!");
            System.out.println(words[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("newly made exception");
        }catch(Exception ex){
            System.out.println("This is from java");
        }finally{
            System.out.println("We finally got here.  We always get here.");
        } System.out.println("Here we go!");




    }//end main
}//end of class
