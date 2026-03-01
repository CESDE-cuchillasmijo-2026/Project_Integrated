package model;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    private List<Clientes> listaClientes = new ArrayList<>();

    public GestorClientes(){

    }
    public void registrarClientes(Clientes c){
        listaClientes.add(c);
        System.out.println("El ID del Cliente es : " + c.getId());
        System.out.println("El nombre del cliente es : " + c.getNombreCompleto());
        System.out.println("El telefono del Cliente es : " + c.getTelefono());
        System.out.println("Registro exitoso");
    }
    public void mostrarClientes(){
        if(listaClientes.isEmpty()){
            System.out.println("No hay Clientes registrados por ahora");
        }else{
            System.out.println("lista de Clientes Registrados");
            for(Clientes c : listaClientes){
                System.out.println(c.toString());
            }
        }
    }
    
}
