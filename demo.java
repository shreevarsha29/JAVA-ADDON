public class demo {
    String Sname;
    demo(String Sname) {
        this.Sname=Sname;
        System.out.println("this is constructor");
    }
    public static void main(String[] args) {
        demo d = new demo("js");
        System.out.println(d.Sname);
    }
}