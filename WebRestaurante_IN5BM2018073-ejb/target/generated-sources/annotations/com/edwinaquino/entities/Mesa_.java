package com.edwinaquino.entities;

import com.edwinaquino.entities.Areas;
import com.edwinaquino.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T07:29:23")
@StaticMetamodel(Mesa.class)
public class Mesa_ { 

    public static volatile SingularAttribute<Mesa, Integer> idmesa;
    public static volatile SingularAttribute<Mesa, String> descripcion;
    public static volatile SingularAttribute<Mesa, Areas> idarea;
    public static volatile SingularAttribute<Mesa, String> numcomensales;
    public static volatile ListAttribute<Mesa, Factura> facturaList;

}