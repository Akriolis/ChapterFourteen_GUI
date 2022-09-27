/**
 * Inner class
 *
 * An inner class can use all the methods and variables of the outer class
 * EVEN the private ones.
 * The inner class gets to use those variables and methods
 * just as if the methods and variables were declared within the inner class
 */

public class MyOuterClass {

    public static void main(String[] args) {
        MyOuterClass outerObj = new MyOuterClass();
        MyOuterClass.MyInnerClass innerObj = outerObj.new MyInnerClass();
        innerObj.go();
    }

    private int x;

    MyInnerClass inner = new MyInnerClass();

    public void doStuff(){
        inner.go();
    }

    class MyInnerClass{
        void go(){
            x = 42;
        }
    }
}

// an inner class instance must be tied to an outer class instance
