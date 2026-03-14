package model;

public class Admin extends Person {
    private String role;

    public Admin() {
        super();
    }

    public Admin(int id, String fullName, String email, String role) {
        super(id, fullName, email);
        this.role = role;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
