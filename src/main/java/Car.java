public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model= model;
        this.year= year;
        this.price= price;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public double getPrice(){
        return this.price;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year= year;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
