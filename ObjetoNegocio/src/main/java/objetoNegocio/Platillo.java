
package objetoNegocio;

import java.util.List;

public class Platillo {
    
    private Long idPlatillo;

    private String nombre;

    private Double precio;

    private int cantidad;

    private String descripcion;

    private List<OrdenPlatillo> ordenPlatillos;

    public Long getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Long idPlatillo) {
        this.idPlatillo = idPlatillo;
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
