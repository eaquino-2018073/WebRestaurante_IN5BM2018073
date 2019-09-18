package com.edwinaquino.entities;

import com.edwinaquino.entities.Cocinero;
import com.edwinaquino.entities.Factura;
import com.edwinaquino.entities.Plato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T07:29:23")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> total;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefac;
    public static volatile SingularAttribute<Detallefactura, Double> precion;
    public static volatile SingularAttribute<Detallefactura, Plato> idplato;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Cocinero> idcocinero;
    public static volatile SingularAttribute<Detallefactura, Factura> idfactura;

}