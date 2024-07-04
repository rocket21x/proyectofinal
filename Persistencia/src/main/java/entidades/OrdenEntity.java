
package entidades;

import javax.persistence.*;
import java.util.List;
import objetoNegocio.OrdenPlatillo;


@Entity
@Table(name = "Ordenes")
public class OrdenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_mesa", nullable = false)
    private int numeroMesa;

    @Column(name = "numero_orden", nullable = false)
    private int numeroOrden;

    @Column(name = "notas")
    private String notas;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrdenPlatilloEntity> ordenPlatillos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<OrdenPlatilloEntity> getOrdenPlatillos() {
        return ordenPlatillos;
    }

    public void setOrdenPlatillos(List<OrdenPlatilloEntity> ordenPlatillos) {
        this.ordenPlatillos = ordenPlatillos;
    }


 

    
    

}
