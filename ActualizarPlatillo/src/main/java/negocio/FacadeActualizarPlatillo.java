
package negocio;

import daos.PlatilloDaoImpl;
import entidades.PlatilloEntity;
import objetoNegocio.Platillo;

public class FacadeActualizarPlatillo implements IActualizarPlatillo{
    
    PlatilloDaoImpl platilloDaoImpl;
    
    public FacadeActualizarPlatillo(){
        this.platilloDaoImpl = new PlatilloDaoImpl();
    }
    
    @Override
    public void actualizarPlatillo(Platillo platilloBO) {
        PlatilloEntity platilloEntidad = new PlatilloEntity();
        platilloEntidad.setIdPlatillo(platilloBO.getIdPlatillo());
        platilloEntidad.setNombre(platilloBO.getNombre());
        platilloEntidad.setDescripcion(platilloBO.getDescripcion());
        platilloEntidad.setPrecio(platilloBO.getPrecio());
        platilloEntidad.setCantidad(platilloBO.getCantidad());
        this.platilloDaoImpl.actualizar(platilloEntidad);
    }
}
