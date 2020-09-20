//• Testing R3.17 Provide a unit test class for the Counter class in Section 3.1.
//Gage Hinshaw

public class CounterTest {
    private int value;

    public static void main(String[] args){
        CounterTest test = new CounterTest();
        System.out.println("Testing getValue()");
        System.out.println("Initial Value: " + test.getValue());
        System.out.println("------------------------");
        System.out.println("Testing click()");
        System.out.println("Clicking...");
        test.click();
        System.out.println("New Value: " + test.getValue());
        System.out.println("------------------------");
        System.out.println("Testing reset()");
        System.out.println("Resetting...");
        test.reset();
        System.out.println("New Value: " + test.getValue());
        System.out.println("------------------------");
        System.out.println("End Test");
    }

    public int getValue(){
        return value;
    }

    public void click(){
        value = value + 1;
    }

    public void reset(){
        value = 0;
    }
}
