class Car{
    
    static String owner="java";
    String carname="mustange";
    void Manufactureyear(int year)
    {
        System.out.println(year);
        }
        }
        public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.carname);
        c.Manufactureyear(1986);

    }
}