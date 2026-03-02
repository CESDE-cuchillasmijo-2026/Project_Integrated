package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList = new ArrayList<>();

    public CustomerManager(){
    }

    public void signUpCustomer(Customer c){
        customerList.add(c); 
        System.out.println("Customer ID: " + c.getId());
        System.out.println("Name: " + c.getFullName()); 
        System.out.println("Phone: " + c.getPhone());    
        System.out.println("Registration successful");
    }

    public void showCustomer(){
        if(customerList.isEmpty()){
            System.out.println("There are no registered customers at this time.");
        }else{
            System.out.println("List of Registered Customers");
            for(Customer c : customerList){
                System.out.println(c.toString());
            }
        }
    }

    public Customer findCustomerById(int id) {
        for (Customer c : customerList) {
            if (c.getId() == id) {
                return c; 
            }
        }
        return null; 
    }
}
