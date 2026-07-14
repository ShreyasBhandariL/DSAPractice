class Car{
    String name;
    String color;
    double price;
    
    void startCar(){
        System.out.println(color + " Starting car. Have a safe jpourney ");
    }
    
    void stopCar(){
        System.out.println(price+" Reached destination safely");
    }
}
public class classAndObject{
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.name = "Suzuki";
        myCar.price = 500000;
        myCar.startCar();
        myCar.stopCar();
    }
}
