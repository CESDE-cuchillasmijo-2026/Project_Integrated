import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Customer;
import model.CustomerManager;
import model.Order;
import model.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();
        
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1, "Tortas Personalizadas", 85000));
        catalog.add(new Product(2, "Cupcakes Decorados", 6000));
        catalog.add(new Product(3, "Galletas Artesanales", 3500));
        catalog.add(new Product(4, "Postres en Vaso", 12000));

        int option;

        do {
            System.out.println("\n--- REPOSTERIA DULCES DELICIAS ---");
            System.out.println("1) Registro de Clientes");
            System.out.println("2) Ver Clientes Registrados");
            System.out.println("3) Ver Catálogo de Productos (Web)");
            System.out.println("4) Realizar Pedido Nuevo");
            System.out.println("5) Salir");
            System.out.print("Seleccione una opción: ");

            option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("\n--- Sección de Registro ---");
                    System.out.print("ID de Cliente: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    
                    if (id > 0) {
                        System.out.print("Nombre Completo: ");
                        String fullName = sc.nextLine();
                        System.out.print("Correo Electrónico: ");
                        String email = sc.nextLine();
                        System.out.print("Teléfono de contacto: ");
                        String phone = sc.nextLine();

                        Customer newCustomer = new Customer(id, fullName, email, phone);
                        manager.signUpCustomer(newCustomer);
                    } else {
                        System.out.println("Error: El ID debe ser un número válido.");
                    }
                    break;

                case 2:
                    manager.showCustomer();
                    break;

                case 3:
                    System.out.println("\n--- Productos Disponibles en la Web ---");
                    for (Product p : catalog) {
                        System.out.println("- [" + p.getId() + "] " + p.getName() + " | Precio: $" + p.getPrice());
                    }
                    break;

                case 4:
                    System.out.println("\n--- Proceso de Venta ---");
                    System.out.print("Ingrese el ID del cliente registrado: ");
                    int cid = sc.nextInt();
                    
                    Customer foundCustomer = manager.findCustomerById(cid);

                    if (foundCustomer != null) {
                        Order order = new Order(1001, foundCustomer); 

                        int selection;
                        do {
                            System.out.print("Ingrese ID del producto (1-4) o 0 para finalizar: ");
                            selection = sc.nextInt();
                            if (selection >= 1 && selection <= catalog.size()) {
                                Product p = catalog.get(selection - 1);
                                System.out.print("¿Cantidad de " + p.getName() + "?: ");
                                int qty = sc.nextInt();
                                order.addProduct(p, qty);
                            }
                        } while (selection != 0);

                        System.out.println("\n--- Resumen de su Pedido ---");
                        order.printBill(); // 
                    } else {
                        System.out.println("Error: El cliente con ID " + cid + " no está registrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema... ¡Dulces momentos!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 5);

        sc.close();
    }
}
