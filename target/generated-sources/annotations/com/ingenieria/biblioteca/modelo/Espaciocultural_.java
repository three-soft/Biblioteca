package com.ingenieria.biblioteca.modelo;

import com.ingenieria.biblioteca.modelo.Salacultural;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T13:05:14")
@StaticMetamodel(Espaciocultural.class)
public class Espaciocultural_ { 

    public static volatile SingularAttribute<Espaciocultural, Boolean> reservado;
    public static volatile SingularAttribute<Espaciocultural, Date> fecha;
    public static volatile SingularAttribute<Espaciocultural, Integer> idevento;
    public static volatile SingularAttribute<Espaciocultural, String> nombreevento;
    public static volatile SingularAttribute<Espaciocultural, Date> horafinal;
    public static volatile SingularAttribute<Espaciocultural, Date> horainicio;
    public static volatile SingularAttribute<Espaciocultural, Salacultural> idsala;

}