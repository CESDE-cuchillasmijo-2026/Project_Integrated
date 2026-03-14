package model;

public class Customer extends Person {
    private String phone;

    public Customer() {
        super();
    }

    public Customer(int id, String fullName, String email, String phone) {
        super(id, fullName, email);
        this.phone = phone;
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

   @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + fullName + ", Email=" + email + ", Phone=" + phone + "]";
    }

}
