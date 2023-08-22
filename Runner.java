package org.example;

public class Runner {
    public static void main(String[] args) {
        SampleTest S = new SampleTest() {

            @Override
            public void test() {
                System.out.println("Anonymous inner class");
            }
        };
        SampleTest S1 = new SampleTest() {
            @Override
            public void test() {
                System.out.println("Second anonymous inner class");
            }
        };
S.test();
S1.test();

    }
}
