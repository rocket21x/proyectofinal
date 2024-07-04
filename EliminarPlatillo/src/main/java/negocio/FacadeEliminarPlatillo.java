package negocio;

import daos.PlatilloDaoImpl;

public class FacadeEliminarPlatillo implements IEliminarPlatillo{

    PlatilloDaoImpl platilloDaoImpl;
    
    public FacadeEliminarPlatillo(){
        this.platilloDaoImpl = new PlatilloDaoImpl();
    }
    
    @Override
    public void eliminarPlatillo(long id) {
        this.platilloDaoImpl.eliminar(id);
    }
    
}
