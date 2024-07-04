
package negocio;

import dtos.PlatilloDTO;
import objetoNegocio.Platillo;

public class ControladorAgregarPlatillo {
    
    FacadeAgregarPlatillo facadeAgregarPlatillo;
    
    public ControladorAgregarPlatillo(){
        this.facadeAgregarPlatillo = new FacadeAgregarPlatillo();
    }

    public void agregarPlatillo(PlatilloDTO platilloDTO) {

        Platillo platillo = new Platillo();
        platillo.setNombre(platilloDTO.getNombre());
        platillo.setDescripcion(platilloDTO.getDescripcion());
        platillo.setPrecio(platilloDTO.getPrecio());
        platillo.setCantidad(platilloDTO.getCantidad());

        this.facadeAgregarPlatillo.agregarPlatillo(platillo);
    }
    
  

}
