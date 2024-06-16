public class MobilePhone {

    String brand;
    String model;
    String displayType;
    double displaySize;
    int batteryCapacity;
    int numberOfSimCards;
    boolean jack;
    boolean fastCharge;

    void call(){
        System.out.println("cyululu");
    }

    void capture(){
        System.out.println("chxk");
    }

    void destroy(){
        brand = null;
        model = null;
        displaySize = 0;
        batteryCapacity = 0;
    }

}
