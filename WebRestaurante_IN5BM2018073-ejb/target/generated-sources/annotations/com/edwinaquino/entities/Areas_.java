package com.edwinaquino.entities;

import com.edwinaquino.entities.Mesa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-18T07:29:23")
@StaticMetamodel(Areas.class)
public class Areas_ { 

    public static volatile SingularAttribute<Areas, String> descripcion;
    public static volatile SingularAttribute<Areas, Integer> idarea;
    public static volatile ListAttribute<Areas, Mesa> mesaList;

}