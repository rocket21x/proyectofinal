package entidades;

import entidades.OrdenPlatilloEntity;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-05T10:44:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(PlatilloEntity.class)
public class PlatilloEntity_ { 

    public static volatile SingularAttribute<PlatilloEntity, String> descripcion;
    public static volatile SingularAttribute<PlatilloEntity, Double> precio;
    public static volatile SingularAttribute<PlatilloEntity, Long> idPlatillo;
    public static volatile SingularAttribute<PlatilloEntity, Integer> cantidad;
    public static volatile SingularAttribute<PlatilloEntity, String> nombre;
    public static volatile ListAttribute<PlatilloEntity, OrdenPlatilloEntity> ordenPlatillos;

}