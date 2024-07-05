package entidades;

import entidades.OrdenEntity;
import entidades.OrdenPlatilloId;
import entidades.PlatilloEntity;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-05T10:44:22", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(OrdenPlatilloEntity.class)
public class OrdenPlatilloEntity_ { 

    public static volatile SingularAttribute<OrdenPlatilloEntity, OrdenPlatilloId> id;
    public static volatile SingularAttribute<OrdenPlatilloEntity, OrdenEntity> orden;
    public static volatile SingularAttribute<OrdenPlatilloEntity, PlatilloEntity> platillo;

}