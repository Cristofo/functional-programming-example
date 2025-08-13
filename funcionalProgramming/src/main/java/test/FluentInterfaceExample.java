package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FluentInterfaceExample {

    public static void main(String[] args) {

        /* new Order()
                .add("Shoes")
                .add("Headphones")
                .deliverAt("Street no 45, Jodhpur")
                .place();*/
        Order.place(order -> new Order()
                .add("Shoes")
                .add("Headphones")
                .deliverAt("MyStreet"));
    }



}

class Order {
    private static List<String> cart = new ArrayList<>();
    private static String address = "";

    public Order() {}

    public Order(List<String> cart, String address) {
        this.cart =  cart;
        this.address = address;
    }


    public Order add(String item) {
        this.cart.add(item);
        System.out.println(item+ " added to the cart");
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location) {
        this.address = location;
        System.out.println("The delivery address set by you is '"+location+"'");
        return new Order(this.cart, this.address);
    }

    public static void place(Function<Order, Order> function) {
        Order order = new Order();
        order = function.apply(order);
        System.out.println("order placed");
        System.out.println(cart.size()+ " items ordered by you will be delivered at "+ address +" by tomorrow." );
    }
}