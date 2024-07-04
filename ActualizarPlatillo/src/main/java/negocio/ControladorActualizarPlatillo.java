
package negocio;

import dtos.PlatilloDTO;
import objetoNegocio.Platillo;

public class ControladorActualizarPlatillo {
    
     FacadeActualizarPlatillo facadeActualizarPlatillo;

    public ControladorActualizarPlatillo() {
        this.facadeActualizarPlatillo = new FacadeActualizarPlatillo();
    }

    public void actualizarPlatillo(PlatilloDTO platilloDTO) {

        Platillo platillo = new Platillo();
        platillo.setIdPlatillo(platilloDTO.getId());
        platillo.setNombre(platilloDTO.getNombre());
        platillo.setDescripcion(platilloDTO.getDescripcion());
        Double precio = platilloDTO.getPrecio();
        platillo.setPrecio(precio);
        platillo.setCantidad(platilloDTO.getCantidad());

        this.facadeActualizarPlatillo.actualizarPlatillo(platillo);
    }
}
