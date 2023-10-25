public class Car extends Vehicle{
    String color;
    
    Car(){
        System.out.println("Car constructor");
    }

    Car(int price, String color){
        super(price);
        this.color = color;    
    }
}