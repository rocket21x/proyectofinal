
package negocio;

import daos.OrdenDaoImpl;
import entidades.OrdenEntity;
import java.util.ArrayList;
import objetoNegocio.Orden;

public class FacadeAgregarOrden implements IAgregarOrden{

    OrdenDaoImpl ordenDaoImpl;
    
    public FacadeAgregarOrden(){
        this.ordenDaoImpl = new OrdenDaoImpl();         
    }
    
    @Override
    public void agregarOrden(Orden ordenBO) {
 
        OrdenEntity ordenEntidad = new OrdenEntity();
        ordenEntidad.setNumeroMesa(ordenBO.getNumeroMesa());
        ordenEntidad.setNumeroOrden(ordenBO.getNumeroOrden());
        ordenEntidad.setNotas(ordenBO.getNotas());
        ordenEntidad.setEstado(ordenBO.getEstado());
        ordenEntidad.setOrdenPlatillos(new ArrayList<>());
        this.ordenDaoImpl.crear(ordenEntidad);
     
    }
    
}
