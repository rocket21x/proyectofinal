
package objetoNegocio;

public class OrdenPlatillo {
    
    private OrdenPlatilloId id;

    private Orden orden;

    private Platillo platillo;

    public OrdenPlatillo(OrdenPlatilloId id, Orden orden, Platillo platillo) {
        this.id = id;
        this.orden = orden;
        this.platillo = platillo;
    }

    public OrdenPlatillo(Orden orden, Platillo platillo) {
        this.orden = orden;
        this.platillo = platillo;
    }
    

    public OrdenPlatilloId getId() {
        return id;
    }

    public void setId(OrdenPlatilloId id) {
        this.id = id;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }
    
    
}
