package com.ingenieria.biblioteca.modelo;

import com.ingenieria.biblioteca.modelo.Salacultural;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-22T02:24:10")
@StaticMetamodel(Edificio.class)
public class Edificio_ { 

    public static volatile SingularAttribute<Edificio, String> nombreedificio;
    public static volatile SingularAttribute<Edificio, Integer> idedificio;
    public static volatile CollectionAttribute<Edificio, Salacultural> salaculturalCollection;

}