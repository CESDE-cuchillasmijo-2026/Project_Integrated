package model;

public class Clientes {
    
    private int id;
    private String nombreCompleto;
    private String telefono;
  


    public Clientes(){

    }


    public Clientes(int id, String nombreCompleto, String telefono) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nombreCompleto=" + nombreCompleto + ", telefono=" + telefono;
    }

    
}
