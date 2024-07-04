
package negocio;

import dtos.OrdenDTO;
import objetoNegocio.Orden;

public class ControladorActualizarOrden {
    
    FacadeActualizarOrden facadeActualizarOrden;

    public ControladorActualizarOrden() {
        this.facadeActualizarOrden = new FacadeActualizarOrden();
    }

    public void actualizarPlatillo(OrdenDTO ordenDTO) {

        Orden orden = new Orden();
        orden.setId(ordenDTO.getId());
        orden.setNumeroMesa(ordenDTO.getNumeroMesa());
        orden.setNumeroOrden(ordenDTO.getNumeroOrden());
        orden.setEstado(ordenDTO.getEstado());
        orden.setOrdenPlatillos(ordenDTO.getOrdenPlatillos());
       
        this.facadeActualizarOrden.actualizarOrden(orden);
    }
}
