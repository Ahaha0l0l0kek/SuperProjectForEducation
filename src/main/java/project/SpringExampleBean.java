package project;

public class SpringExampleBean {

    @RandomInteger(min = 12, max = 16)
    private int number;

    public void myMethod(){
        for(int i = 0; i < number; i++) {
            System.out.println("starting..." + i);
        }
    }
}
