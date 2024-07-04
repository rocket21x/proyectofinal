
package negocio;


public class ControladorEliminarPlatillo {
    
    FacadeEliminarPlatillo facadeEliminarPlatillo;
    
    public ControladorEliminarPlatillo(){
        this.facadeEliminarPlatillo = new FacadeEliminarPlatillo();
    }

    public void eliminarPlatillo(long id) {
        this.facadeEliminarPlatillo.eliminarPlatillo(id);
    }

}
