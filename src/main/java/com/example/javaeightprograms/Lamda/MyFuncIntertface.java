package com.example.javaeightprograms.Lamda;

@FunctionalInterface  // error if more than one abstract method
public interface MyFuncIntertface extends ParentFuncInc{

    private void sayHello() {

    } // from java 9 private allowed

    //void sayHelloMethod(String name);
    //public void sayBye(String name);

    //use of functional interface
    default void sayHelloMethods(){
        System.out.println("Hello World");
    }

    //inhertiance in Functional Interface
}

class Child implements MyFuncIntertface{

    @Override
    public void sayBye() {
        System.out.println("child Bye World");
    }
}

class MyClass{
    public static void main(String[] args) {
        MyFuncIntertface c = new Child();
        c.sayBye();
    }
}