package entidades;

import java.util.List;
import javax.persistence.*;
import objetoNegocio.Orden;

@Entity
@Table(name = "Platillos")
public class PlatilloEntity {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platillo")
    private Long idPlatillo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "platillo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrdenPlatilloEntity> ordenPlatillos;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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

    public List<OrdenPlatilloEntity> getOrdenPlatillos() {
        return ordenPlatillos;
    }

    public void setOrdenPlatillos(List<OrdenPlatilloEntity> ordenPlatillos) {
        this.ordenPlatillos = ordenPlatillos;
    }

   
    
}
