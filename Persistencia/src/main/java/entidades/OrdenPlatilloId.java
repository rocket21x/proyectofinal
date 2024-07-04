
package entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrdenPlatilloId {
       
    @Column(name = "orden_id")
    private Long ordenId;

    @Column(name = "platillo_id")
    private Long platilloId;

    public Long getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(Long ordenId) {
        this.ordenId = ordenId;
    }

    public Long getPlatilloId() {
        return platilloId;
    }

    public void setPlatilloId(Long platilloId) {
        this.platilloId = platilloId;
    }
    
    
}
