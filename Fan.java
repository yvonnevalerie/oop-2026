public class Fan{
    String powersource;
    String color;

    void printDetails(){
        System.out.printf("""
        %s %s
        """, powersource, color);
    }
}