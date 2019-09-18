package com.edwinaquino.entities;

import com.edwinaquino.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T07:29:23")
@StaticMetamodel(Cocinero.class)
public class Cocinero_ { 

    public static volatile ListAttribute<Cocinero, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Cocinero, String> apellido;
    public static volatile SingularAttribute<Cocinero, Integer> idcocinero;
    public static volatile SingularAttribute<Cocinero, String> nombre;
    public static volatile SingularAttribute<Cocinero, String> especialidad;

}