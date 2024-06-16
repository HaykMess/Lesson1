public class TestClass {
    public static void main(String[] args) {
        MobilePhone haykPhone = new MobilePhone();
        MobilePhone davoPhone = new MobilePhone();

        haykPhone.brand = "Samsung";
        haykPhone.batteryCapacity = 4000;
        haykPhone.jack = false;
        haykPhone.displaySize = 5.7;

        davoPhone.displaySize = 5.2;
        davoPhone.jack = false;
        davoPhone.brand = "iPhone";
        davoPhone.batteryCapacity = 3500;

        haykPhone.call();
        System.out.println(haykPhone.displaySize);
        haykPhone.destroy();
        System.out.println(haykPhone.displaySize);

        haykPhone.model = "S20";
        System.out.println(davoPhone.batteryCapacity);
        haykPhone.model = "S21";

        System.out.println("haykPhone.model = " + haykPhone.model);

//        if (davoPhone.displaySize >= haykPhone.displaySize) {
//            System.out.print("Davo");
//        } else {
//            System.out.print("Hayk");
//        }
//        System.out.println("i display is bigger");
    }
}