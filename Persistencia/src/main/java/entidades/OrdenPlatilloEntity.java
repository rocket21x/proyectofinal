
package entidades;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "orden_platillo")
public class OrdenPlatilloEntity implements Serializable {

    @EmbeddedId
    private OrdenPlatilloId id;

    @ManyToOne
    @MapsId("ordenId")
    @JoinColumn(name = "orden_id")
    private OrdenEntity orden;

    @ManyToOne
    @MapsId("platilloId")
    @JoinColumn(name = "platillo_id")
    private PlatilloEntity platillo;

    public OrdenPlatilloId getId() {
        return id;
    }

    public void setId(OrdenPlatilloId id) {
        this.id = id;
    }

    public OrdenEntity getOrden() {
        return orden;
    }

    public void setOrden(OrdenEntity orden) {
        this.orden = orden;
    }

    public PlatilloEntity getPlatillo() {
        return platillo;
    }

    public void setPlatillo(PlatilloEntity platillo) {
        this.platillo = platillo;
    }

  
}