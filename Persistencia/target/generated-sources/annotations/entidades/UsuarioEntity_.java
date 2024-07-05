package entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-05T10:44:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(UsuarioEntity.class)
public class UsuarioEntity_ { 

    public static volatile SingularAttribute<UsuarioEntity, Long> idUsuario;
    public static volatile SingularAttribute<UsuarioEntity, String> nombre;
    public static volatile SingularAttribute<UsuarioEntity, String> rol;
    public static volatile SingularAttribute<UsuarioEntity, String> contraseña;

}