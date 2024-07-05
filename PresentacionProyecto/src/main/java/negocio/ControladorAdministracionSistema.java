
package negocio;

import dtos.OrdenDTO;
import dtos.PlatilloDTO;
import dtos.UsuarioDTO;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Orden;
import objetoNegocio.Usuario;

public class ControladorAdministracionSistema {
    
    FacadeAdministracionSistema facadeAdministracionSistema;
    
    public ControladorAdministracionSistema(){
        this.facadeAdministracionSistema = new FacadeAdministracionSistema();
    }
    
    public void actualizarTablaPlatillos(DefaultTableModel modelo){
        this.facadeAdministracionSistema.actualizarTablaPlatillos(modelo);
    }
    
    public void actualizarTablaOrdenes(DefaultTableModel modelo) {
        this.facadeAdministracionSistema.actualizarTablaOrdenes(modelo);
    }

    public void abrirInicioSesion() {
        this.facadeAdministracionSistema.abrirInicioSesion(); 
    }

    public void abrirRegistro() {
        this.facadeAdministracionSistema.abrirRegistro();
    }

    public void abrirMenu() {
        this.facadeAdministracionSistema.abrirMenu();
    }
    
    public void abrirMenuMesero() {
        this.facadeAdministracionSistema.abrirMenuMesero();
    }
    
    public void abrirMenuCocinero() {
        this.facadeAdministracionSistema.abrirMenuCocinero();
    }

    public void abrirInventario() {
        this.facadeAdministracionSistema.abrirInventario();
    }
    
    public boolean iniciarSesion(UsuarioDTO usuarioDTO){
        Usuario usuarioBO = new Usuario();
        usuarioBO.setNombre(usuarioDTO.getNombre());
        usuarioBO.setContraseña(usuarioDTO.getContraseña());
        return this.facadeAdministracionSistema.iniciarSesion(usuarioBO);
    }

    public void abrirTomaDeOrden() {
        this.facadeAdministracionSistema.abrirTomaDeOrden();
    }

    public void agregarPlatilloSeleccionado(PlatilloDTO platilloDTO) {
       this.facadeAdministracionSistema.agregarPlatilloSeleccionado(platilloDTO);
    }
    
    public void eliminarPlatilloSeleccionado(PlatilloDTO platilloDTO){
        this.facadeAdministracionSistema.eliminarPlatilloSeleccionado(platilloDTO);
    }
    
    public void sumarPlatilloCantidad(PlatilloDTO platilloDTO){
        this.facadeAdministracionSistema.sumarPlatilloCantidad(platilloDTO);
    }
    
    public void restarPlatilloCantidad(PlatilloDTO platilloDTO){
        this.facadeAdministracionSistema.restarPlatilloCantidad(platilloDTO);
    }

    public void actualizarTablaPlatillosSeleccionados(DefaultTableModel model) {
        this.facadeAdministracionSistema.actualizarTablaPlatillosSeleccionados(model);
    }

    public void terminarOrden(OrdenDTO ordenDTO) {
        Orden orderBO = new Orden();
        orderBO.setNumeroMesa(ordenDTO.getNumeroMesa());
        orderBO.setNumeroOrden(ordenDTO.getNumeroOrden());
        orderBO.setNotas(ordenDTO.getNotas());
        orderBO.setEstado(ordenDTO.getEstado());
        orderBO.setTotal(ordenDTO.getTotal());
        orderBO.setOrdenPlatillos(ordenDTO.getOrdenPlatillos());
        this.facadeAdministracionSistema.terminarOrden(orderBO);
        
    }
    public void actualizarOrden(OrdenDTO orden){
        this.facadeAdministracionSistema.actualizarOrden(orden);
    }
    public void actualizarTablaOrdenPlatillo(DefaultTableModel modelo, Long id){
        this.facadeAdministracionSistema.actualizarTablaOrdenPlatillo(modelo,id);
    }

    public void abrirAdministrarOrdenes() {
        this.facadeAdministracionSistema.abrirAdministrarOrdenes();
    }

    public void abrirPagoInicio() {
        this.facadeAdministracionSistema.abrirPagoInicio();
    }
}
