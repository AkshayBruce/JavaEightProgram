package com.example.javaeightprograms.Lamda;

public class TestinMainClass {
    public static void main(String[] args) {
        TestingInterface t = new TestingInterface()
        //anonymoous class
        {


            @Override
            public String gatName() {
                return "Akshay";
            }

            @Override
            public String getSalary() {
                return "350000";
            }
        };

        System.out.println(t.getSalary());
    }


}

