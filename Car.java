//E3.12 Implement Car Class

public class Car {
    private int fuel = 0;
    private int mpg;

    public Car(int milesPerGallon){
        this.mpg = milesPerGallon;
    }

    public void addGas(int newGas){
        this.fuel += newGas;
    }

    public int getGasInTank(){
        return this.fuel;
    }

    public void drive(int miles){
        int gasUsed = miles/mpg;
        this.fuel -= gasUsed;
    }

}
