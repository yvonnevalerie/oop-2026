public class Main{
    public static void main(String[] args){
        Fan obj1 = new Fan();
        obj1.powersource = "Electric";
        obj1.color = "Red";

        Fan obj2 = new Fan();
        obj2.powersource = "Rechargeable";
        obj2.color = "Gray";

        obj1.printDetails();
        obj2.printDetails(); 
    }
}