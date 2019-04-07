package AbstractPractice;

import com.sun.tools.internal.ws.processor.model.ExtendedModelVisitor;

class Manager extends Employee {

    public Manager(String name, String department){
        super(name, department);

    }

    public String work() {
        return "holding meetings";
    }

    public String motivation(){
        return "Work faster, idiot";
    }


    public static void main(String[] args) {
        Employee james = new Developer("James", "codeup");
        System.out.println(james.work());

    }
}