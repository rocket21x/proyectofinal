
package negocio;

import daos.UsuarioDaoImpl;

import entidades.UsuarioEntity;
import objetoNegocio.Usuario;

public class FacadeAgregarUsuario implements IAgregarUsuario{
    
    UsuarioDaoImpl usuarioDaoImpl;
    
    public FacadeAgregarUsuario(){
        this.usuarioDaoImpl = new UsuarioDaoImpl();
    }
    
    @Override
    public void agregarUsuario(Usuario usuarioBO) {
        UsuarioEntity usuarioEntidad = new UsuarioEntity();
        usuarioEntidad.setNombre(usuarioBO.getNombre());
        usuarioEntidad.setContraseña(usuarioBO.getContraseña());
        usuarioEntidad.setRol(usuarioBO.getRol());
        this.usuarioDaoImpl.crear(usuarioEntidad);    
    }
}
