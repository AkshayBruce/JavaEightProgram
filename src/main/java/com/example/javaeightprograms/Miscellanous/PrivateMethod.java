package com.example.javaeightprograms.Miscellanous;

 class PrivateMethod {

    private void method()
    {
        System.out.println("In Base method...");
    }


        public static void main(String[] args) {
            PrivateMethod privateMethod = new PrivateMethod();

            Child c = privateMethod.new Child();

            c.method();
        }

     class Child extends PrivateMethod{
        private void method()
        {
            System.out.println("from child class");
        }
    }
}



