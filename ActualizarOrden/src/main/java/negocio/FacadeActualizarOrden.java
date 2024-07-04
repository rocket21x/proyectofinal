
package negocio;

import daos.OrdenDaoImpl;
import entidades.OrdenEntity;
import objetoNegocio.Orden;

public class FacadeActualizarOrden implements IActualizarOrden{
        
    OrdenDaoImpl ordenDaoImpl;
    
    public FacadeActualizarOrden(){
        this.ordenDaoImpl = new OrdenDaoImpl();
    }
  
    @Override
    public void actualizarOrden(Orden ordenBO) {
        OrdenEntity ordenEntidad = new OrdenEntity();
        ordenEntidad.setId(ordenBO.getId());
        ordenEntidad.setNumeroMesa(ordenBO.getNumeroMesa());
        ordenEntidad.setNumeroOrden(ordenBO.getNumeroOrden());
        ordenEntidad.setNotas(ordenBO.getNotas());
        ordenEntidad.setEstado(ordenBO.getEstado());
        this.ordenDaoImpl.actualizar(ordenEntidad);
    }

   
}
