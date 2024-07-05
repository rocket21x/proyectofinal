package entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-05T10:44:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PagoEntity.class)
public class PagoEntity_ { 

    public static volatile SingularAttribute<PagoEntity, String> descripcion;
    public static volatile SingularAttribute<PagoEntity, String> metodoPago;
    public static volatile SingularAttribute<PagoEntity, String> fecha;
    public static volatile SingularAttribute<PagoEntity, Float> monto;
    public static volatile SingularAttribute<PagoEntity, Integer> id;

}