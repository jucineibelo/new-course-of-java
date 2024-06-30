package com.educandoweb.application;

import com.educandoweb.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Jucinei Luiz Belo", "jucineibelo@gmail.com");
        Pessoa p2 = new Pessoa(null, "Camila Paula Pierog", "camilappierog@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        System.out.println("Pronto!");

        //procurar uma pessoa pelo ID
        System.out.println(em.find(Pessoa.class, 2));

        //deletar uma pessoa pelo ID
        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        emf.close();
        em.close();






    }
}
