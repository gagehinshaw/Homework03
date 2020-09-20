//Testing R3.18 Read Exercise E3.12, but do not implement the Car class yet. Write a tester class
// that tests a scenario in which gas is added to the car, the car is driven, more gas is added,
//and the car is driven again. Print the actual and expected amount of gas in the tank.

public class CarTester {
    public static void main(String[] args) {
        Car test = new Car(25);
        test.addGas(10);
        test.drive(25);
        test.addGas(2);
        test.drive(100);
        System.out.println("Expected Remaining Gas:  7 Gallons");
        System.out.println("Actual Remaining Gas: " + test.getGasInTank() + " gallons");
    }
}
