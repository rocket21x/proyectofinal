package dtos;

import java.util.List;
import objetoNegocio.OrdenPlatillo;

public class PlatilloDTO {

    private Long id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private String descripcion;
    private List<OrdenPlatillo> ordenPlatillos;
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<OrdenPlatillo> getOrdenPlatillos() {
        return ordenPlatillos;
    }

    public void setOrdenPlatillos(List<OrdenPlatillo> ordenPlatillos) {
        this.ordenPlatillos = ordenPlatillos;
    }

}
