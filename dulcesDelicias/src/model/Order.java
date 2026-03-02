package model;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    private Customer customer;
    private List<OrderDetail> ListDetail = new ArrayList<>(); 

    public Order(int idOrder, Customer customer) {
        this.idOrder = idOrder;
        this.customer = customer;
    }

    public void addProduct(Product p, int quantity) {
        ListDetail.add(new OrderDetail(p, quantity)); 
    }

    public double calculateTotal() {     
        double total = 0;
        for (OrderDetail d : ListDetail) { 
            total += d.calculateSubtotal();
        }
        return total;
    }

    public void printBill() {
        System.out.println("Order ID: " + idOrder);
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("FullPayment: $" + calculateTotal());
    }
}
