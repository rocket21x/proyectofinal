
package negocio;

import dtos.OrdenDTO;
import objetoNegocio.Orden;

public class ControladorAgregarOrden {
    
    FacadeAgregarOrden facadeAgregarOrden;
    
    public ControladorAgregarOrden(){
        this.facadeAgregarOrden = new FacadeAgregarOrden();
    }
    
    public void agregarOrden(OrdenDTO ordenDTO){
        
        Orden ordenBO = new Orden();
        ordenBO.setNumeroMesa(ordenDTO.getNumeroMesa());
        ordenBO.setNumeroOrden(ordenDTO.getNumeroOrden());
        ordenBO.setNotas(ordenDTO.getNotas());
        ordenBO.setEstado(ordenDTO.getEstado());
        ordenBO.setOrdenPlatillos(ordenDTO.getOrdenPlatillos());
        this.facadeAgregarOrden.agregarOrden(ordenBO);
    }
    
    
}
