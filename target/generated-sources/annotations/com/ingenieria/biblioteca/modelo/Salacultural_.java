package com.ingenieria.biblioteca.modelo;

import com.ingenieria.biblioteca.modelo.Edificio;
import com.ingenieria.biblioteca.modelo.Espaciocultural;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T13:05:14")
@StaticMetamodel(Salacultural.class)
public class Salacultural_ { 

    public static volatile SingularAttribute<Salacultural, String> nombresala;
    public static volatile CollectionAttribute<Salacultural, Espaciocultural> espacioculturalCollection;
    public static volatile SingularAttribute<Salacultural, Edificio> idedificio;
    public static volatile SingularAttribute<Salacultural, Integer> idsala;

}