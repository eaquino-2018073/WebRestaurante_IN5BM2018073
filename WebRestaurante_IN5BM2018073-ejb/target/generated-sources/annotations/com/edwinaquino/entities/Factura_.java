package com.edwinaquino.entities;

import com.edwinaquino.entities.Cliente;
import com.edwinaquino.entities.Detallefactura;
import com.edwinaquino.entities.Mesa;
import com.edwinaquino.entities.Mesero;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T07:29:23")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Mesa> idmesa;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile ListAttribute<Factura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Factura, Mesero> idmesero;
    public static volatile SingularAttribute<Factura, Cliente> idcliente;
    public static volatile SingularAttribute<Factura, Integer> idfactura;

}