public class ShoppingCart{
    void phone(String name,int Price){
        System.out.println("name" +name+" " + "Price:"+ Price);
    }
    void phone(String name,int Price,int quantity){
        System.out.println("name" +name+" " + "Price:"+ Price);
        System.out.println("quantity:" + quantity);
    }
    public static void main(String[] args){
        ShoppingCart obj = new ShoppingCart();
        obj.phone("poco x6",12000);
        obj.phone("samsung",3500,2);
    }
}