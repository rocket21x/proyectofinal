
package negocio;

import dtos.OrdenDTO;
import dtos.PlatilloDTO;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Orden;
import objetoNegocio.Usuario;

public interface IAdministracionSistema {
    
    void actualizarTablaPlatillos(DefaultTableModel modelo);
    void actualizarTablaPlatillosSeleccionados(DefaultTableModel modelo);
    void actualizarTablaOrdenes(DefaultTableModel modelo);
    void abrirInicioSesion();
    void abrirRegistro();
    void abrirMenu();
    void abrirMenuMesero();
    void abrirMenuCocinero();
    void abrirInventario();
    void abrirTomaDeOrden();
    void abrirPagoInicio();
    boolean iniciarSesion(Usuario usuarioBO);
    void agregarPlatilloSeleccionado(PlatilloDTO platilloDTO);
    void eliminarPlatilloSeleccionado(PlatilloDTO platilloDTO);
    void sumarPlatilloCantidad(PlatilloDTO platilloDTO);
    void restarPlatilloCantidad(PlatilloDTO platilloDTO);
    void terminarOrden(Orden orderBO);
    void actualizarOrden(OrdenDTO orden);
    void actualizarTablaOrdenPlatillo(DefaultTableModel modelo,Long id);
    
    
}
