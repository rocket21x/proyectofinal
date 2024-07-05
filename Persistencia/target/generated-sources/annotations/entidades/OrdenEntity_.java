package entidades;

import entidades.OrdenPlatilloEntity;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-05T10:44:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(OrdenEntity.class)
public class OrdenEntity_ { 

    public static volatile SingularAttribute<OrdenEntity, Integer> numeroOrden;
    public static volatile SingularAttribute<OrdenEntity, String> estado;
    public static volatile SingularAttribute<OrdenEntity, Double> total;
    public static volatile SingularAttribute<OrdenEntity, Integer> numeroMesa;
    public static volatile SingularAttribute<OrdenEntity, String> notas;
    public static volatile SingularAttribute<OrdenEntity, Long> id;
    public static volatile ListAttribute<OrdenEntity, OrdenPlatilloEntity> ordenPlatillos;

}