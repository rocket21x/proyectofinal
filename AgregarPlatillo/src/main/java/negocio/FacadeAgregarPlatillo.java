package negocio;

import daos.PlatilloDaoImpl;
import objetoNegocio.Platillo;
import entidades.PlatilloEntity;

public class FacadeAgregarPlatillo implements IAgregarPlatillo{

    PlatilloDaoImpl platilloDaoImpl;
    
    public FacadeAgregarPlatillo(){
        this.platilloDaoImpl = new PlatilloDaoImpl();
    }
    
    @Override
    public void agregarPlatillo(Platillo platilloBO) {
        PlatilloEntity platilloEntidad = new PlatilloEntity();
        platilloEntidad.setNombre(platilloBO.getNombre());
        platilloEntidad.setDescripcion(platilloBO.getDescripcion());
        platilloEntidad.setPrecio(platilloBO.getPrecio());
        platilloEntidad.setCantidad(platilloBO.getCantidad());
        this.platilloDaoImpl.crear(platilloEntidad);    
    }

    
    
}
