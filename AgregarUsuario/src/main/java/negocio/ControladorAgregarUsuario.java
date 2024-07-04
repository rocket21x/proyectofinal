
package negocio;

import dtos.UsuarioDTO;
import objetoNegocio.Usuario;

public class ControladorAgregarUsuario {
    
    FacadeAgregarUsuario facadeAgregarUsuario;
    
    public ControladorAgregarUsuario(){
        this.facadeAgregarUsuario = new FacadeAgregarUsuario();
    }

    public void agregarUsuario(UsuarioDTO usuarioDTO) {
  
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setContraseña(usuarioDTO.getContraseña());
        usuario.setRol(usuarioDTO.getRol());

        this.facadeAgregarUsuario.agregarUsuario(usuario);
    }
}
