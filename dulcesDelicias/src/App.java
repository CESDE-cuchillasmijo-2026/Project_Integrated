import java.util.Scanner;

import model.Clientes;
import model.GestorClientes;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);
       GestorClientes gestor = new GestorClientes();
       int opcion;


       do{
        System.out.println("Reposteria Dulces Delicias");
        System.out.println("Te muestro nuestras opciones que te gustaria hace?");
        System.out.println("1) Registro Clientes");
        System.out.println("2) Ver Clientes registrados");
        System.out.println("3) Ver nuestros Productos");
        System.out.println("4) Hacer un Pedido");
        System.out.println("5) Detalles de pedido");
        System.out.println("6) Salir");

        opcion= sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Bienvenido a Nuestra seccion de Registro");
                System.out.println("Gracias por elegirnos para" + " " +
                 "Dulces Delicias es muy importante tenerte aqui con nosotros");
                 
                 System.out.println("Ingresa tu ID");
                 int id = sc.nextInt();
                 sc.nextLine();
                 if(id > 0){
                 System.out.println("Ingresa tu nombre completo");
                 String nombreCompleto =sc.nextLine();

                   
                 System.out.println("Ingresa tu numero de Telefono para poder comunicarnos contigo");
                 String telefono = sc.nextLine();

                 Clientes Agregado = new Clientes(id,nombreCompleto,telefono);
                 gestor.registrarClientes(Agregado);
                 System.out.println("Registro exitoso");
                 }else{
                    System.out.println("eso no es un ID");
                    break;
                 }
              
            
                 
                   
                break;
            case 2:
                gestor.mostrarClientes();
                break; 
            case 3 :
                break; 
            case 4:
                break;
            case 5 :
                break;              
        
            default:
                break;
        }



       }while(opcion!= 6);
    }
}
