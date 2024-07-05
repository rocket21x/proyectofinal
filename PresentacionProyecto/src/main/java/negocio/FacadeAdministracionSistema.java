package negocio;

import daos.OrdenDaoImpl;
import daos.OrdenPlatilloDaoImpl;
import daos.PlatilloDaoImpl;
import daos.UsuarioDaoImpl;
import dtos.OrdenDTO;
import dtos.PlatilloDTO;
import dtos.UsuarioDTO;
import entidades.OrdenEntity;
import entidades.OrdenPlatilloEntity;
import entidades.PlatilloEntity;
import entidades.UsuarioEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetoNegocio.Orden;
import objetoNegocio.Usuario;
import presentacion.AdministrarOrdenes;
import presentacion.InicioSesion;
import presentacion.Inventario;
import presentacion.Menu;
import presentacion.MenuCocinero;
import presentacion.MenuMeseros;
import presentacion.PagoInicio;
import presentacion.Registro;
import presentacion.TomaDeOrden;

public class FacadeAdministracionSistema implements IAdministracionSistema {

    private PlatilloDaoImpl platilloDaoImpl;
    private OrdenDaoImpl ordenDaoImpl;
    private UsuarioDaoImpl usuarioDaoImpl;
    private OrdenPlatilloDaoImpl ordenplatilloDAOImpl;
    private InicioSesion inicioSesion;
    private Inventario inventario;
    private Menu menu;
    private PagoInicio pagoInicio;
    private MenuCocinero menuCocinero;
    private MenuMeseros menuMeseros;
    private Registro registro;
    private TomaDeOrden tomaDeOrden;
    private AdministrarOrdenes administrarOrdenes;

    private static List<PlatilloDTO> listaPlatillosSeleccionados = new ArrayList<>();

    public static UsuarioDTO usuarioActivo = new UsuarioDTO();

    public FacadeAdministracionSistema() {
        this.platilloDaoImpl = new PlatilloDaoImpl();
        this.ordenDaoImpl = new OrdenDaoImpl();
        this.usuarioDaoImpl = new UsuarioDaoImpl();
        this.ordenplatilloDAOImpl = new OrdenPlatilloDaoImpl();

    }

    @Override
    public void actualizarTablaPlatillos(DefaultTableModel modelo) {
        List<PlatilloEntity> listaPlatillos = this.platilloDaoImpl.obtenerTodos();
        modelo.setRowCount(0);
        for (PlatilloEntity platillo : listaPlatillos) {
            Object[] fila = {platillo.getIdPlatillo(), platillo.getNombre(), platillo.getDescripcion(), platillo.getPrecio(), platillo.getCantidad()};
            modelo.addRow(fila);
        }
    }

    @Override
    public void abrirInicioSesion() {
        this.inicioSesion = new InicioSesion();
        this.inicioSesion.setVisible(true);

    }

    @Override
    public void abrirRegistro() {
        this.registro = new Registro();
        this.registro.setVisible(true);
    }

    @Override
    public void abrirMenu() {
        this.menu = new Menu();
        this.menu.setVisible(true);
    }

    @Override
    public void abrirInventario() {
        this.inventario = new Inventario();
        this.inventario.setVisible(true);
    }

    @Override
    public boolean iniciarSesion(Usuario usuarioBO) {
        List<UsuarioEntity> listaUsuarios = this.usuarioDaoImpl.obtenerTodos();
        for (UsuarioEntity usuarioEntity : listaUsuarios) {
            if (usuarioEntity.getNombre().equals(usuarioBO.getNombre())
                    && usuarioEntity.getContraseña().equals(usuarioBO.getContraseña())) {
                JOptionPane.showMessageDialog(null, "Autenticación exitosa", "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
                usuarioActivo.setNombre(usuarioBO.getNombre());
                usuarioActivo.setContraseña(usuarioBO.getContraseña());
                usuarioActivo.setRol(usuarioEntity.getRol());
                if (null != usuarioEntity.getRol()) {
                    switch (usuarioEntity.getRol()) {
                        case "Gerente" ->
                            this.abrirMenu();
                        case "Mesero" ->
                            this.abrirMenuMesero();
                        case "Cocinero" ->
                            this.abrirMenuCocinero();
                        default -> {
                        }
                    }
                }
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos", "Error de Autenticación", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    @Override
    public void abrirMenuCocinero() {
        this.menuCocinero = new MenuCocinero();
        this.menuCocinero.setVisible(true);
    }

    @Override
    public void abrirMenuMesero() {
        this.menuMeseros = new MenuMeseros();
        this.menuMeseros.setVisible(true);
    }

    @Override
    public void actualizarTablaOrdenes(DefaultTableModel modelo) {
        List<OrdenEntity> listaOrdenes = this.ordenDaoImpl.obtenerTodos();
        modelo.setRowCount(0);
        for (OrdenEntity orden : listaOrdenes) {
            Object[] fila = {orden.getId(), orden.getNumeroMesa(), orden.getNumeroOrden(), orden.getNotas(), orden.getEstado()};
            modelo.addRow(fila);
        }
    }

    @Override
    public void abrirTomaDeOrden() {
        this.tomaDeOrden = new TomaDeOrden();
        this.tomaDeOrden.setVisible(true);
    }

    @Override
    public void agregarPlatilloSeleccionado(PlatilloDTO platilloDTO) {
        listaPlatillosSeleccionados.add(platilloDTO);
    }

    @Override
    public void actualizarTablaPlatillosSeleccionados(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (PlatilloDTO platillo : listaPlatillosSeleccionados) {
            Object[] fila = {platillo.getId(), platillo.getNombre(), platillo.getDescripcion(), platillo.getPrecio(), platillo.getCantidad()};
            modelo.addRow(fila);
        }
    }

    @Override
    public void sumarPlatilloCantidad(PlatilloDTO platilloDTO) {
        for (PlatilloDTO platillo : listaPlatillosSeleccionados) {
            if (platillo.getId() == platilloDTO.getId()) {
                platillo.setCantidad(platilloDTO.getCantidad());
                break;
            }
        }
    }

    @Override
    public void restarPlatilloCantidad(PlatilloDTO platilloDTO) {
        for (PlatilloDTO platillo : listaPlatillosSeleccionados) {
            if (platillo.getId() == platilloDTO.getId()) {
                platillo.setCantidad(platilloDTO.getCantidad());
                break;
            }
        }
    }

    @Override
    public void eliminarPlatilloSeleccionado(PlatilloDTO platilloDTO) {
        Iterator<PlatilloDTO> iterator = listaPlatillosSeleccionados.iterator();
        while (iterator.hasNext()) {
            PlatilloDTO platillo = iterator.next();
            if (platillo.getId() == platilloDTO.getId()) {
                iterator.remove();
                break;
            }
        }
    }

 
     @Override
    public void terminarOrden(Orden ordenBO) {
        OrdenEntity ordenEntidad = new OrdenEntity();
        ordenEntidad.setNumeroMesa(ordenBO.getNumeroMesa());
        ordenEntidad.setNumeroOrden(ordenBO.getNumeroOrden());
        ordenEntidad.setNotas(ordenBO.getNotas());
        ordenEntidad.setEstado("Pendiente");
        ordenEntidad.setTotal(ordenBO.getTotal());

        List<OrdenPlatilloEntity> ordenPlatillos = new ArrayList<>();

        for (PlatilloDTO platilloDTO : listaPlatillosSeleccionados) {
            PlatilloEntity platilloEntity = convertirDTOaEntity(platilloDTO);

            OrdenPlatilloEntity ordenPlatillo = new OrdenPlatilloEntity();
            ordenPlatillo.setOrden(ordenEntidad);
            ordenPlatillo.setPlatillo(platilloEntity);
            ordenPlatillos.add(ordenPlatillo);
        }

        ordenEntidad.setOrdenPlatillos(ordenPlatillos);
         try {
             this.ordenDaoImpl.crear(ordenEntidad);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Comprueba que no alla platillos repetidos");
         }
        
        FacadeAdministracionSistema.listaPlatillosSeleccionados.clear();
        JOptionPane.showMessageDialog(null, "Se ha creado la orden");
    }


   
    
    private PlatilloEntity convertirDTOaEntity(PlatilloDTO platilloDTO) {
        PlatilloEntity platilloEntity = new PlatilloEntity();
        platilloEntity.setIdPlatillo(platilloDTO.getId());
        platilloEntity.setNombre(platilloDTO.getNombre());
        platilloEntity.setPrecio(platilloDTO.getPrecio());
        platilloEntity.setCantidad(platilloDTO.getCantidad());
        platilloEntity.setDescripcion(platilloDTO.getDescripcion());
        return platilloEntity;
    }

    @Override
    public void actualizarOrden(OrdenDTO orden) {
        OrdenEntity ordenEntidad = new OrdenEntity();
        ordenEntidad.setId(orden.getId());
        ordenEntidad.setNumeroMesa(orden.getNumeroMesa());
        ordenEntidad.setNumeroOrden(orden.getNumeroOrden());
        ordenEntidad.setNotas(orden.getNotas());
        ordenEntidad.setEstado(orden.getEstado());

        List<OrdenPlatilloEntity> ordenPlatillos = new ArrayList<>();

        for (PlatilloDTO platilloDTO : listaPlatillosSeleccionados) {
            PlatilloEntity platilloEntity = convertirDTOaEntity(platilloDTO);

            OrdenPlatilloEntity ordenPlatillo = new OrdenPlatilloEntity();
            ordenPlatillo.setOrden(ordenEntidad);
            ordenPlatillo.setPlatillo(platilloEntity);
            ordenPlatillos.add(ordenPlatillo);
        }
        ordenEntidad.setOrdenPlatillos(ordenPlatillos);

        this.ordenDaoImpl.actualizar(ordenEntidad);
    }

    @Override
    public void actualizarTablaOrdenPlatillo(DefaultTableModel modelo, Long id) {

        List<OrdenPlatilloEntity> listaOrdenes = this.ordenplatilloDAOImpl.obtenerTodos();
        List<PlatilloEntity> platillos = this.platilloDaoImpl.obtenerTodos();
        modelo.setRowCount(0);
        for (OrdenPlatilloEntity orden : listaOrdenes) {
            if (id.equals(orden.getOrden().getId())) {
                Object[] fila = {orden.getOrden().getId(), orden.getPlatillo().getNombre()};
                modelo.addRow(fila);

            }

        }
    }

    public void abrirAdministrarOrdenes() {
        this.administrarOrdenes = new AdministrarOrdenes();
        this.administrarOrdenes.setVisible(true);
    }

    public void abrirPagoInicio() {
        this.pagoInicio = new PagoInicio();
        this.pagoInicio.setVisible(true);       
    }

}
