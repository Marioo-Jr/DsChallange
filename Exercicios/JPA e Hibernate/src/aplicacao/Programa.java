package aplicacao;

import Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {



    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");



        // -> Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

        //->  EntityManager serve para fazer conexao com o BD efetua operaçoes  como : ISERCAO/REMOCAO/DELEÇÃO/ATT
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin(); // usamos esse codigo quando fazemos mais do apenas uma leitura

//        em.persist(p1); // .persist pega o objeto e salva no BD
//        em.persist(p2);
//        em.persist(p3);
        em.getTransaction().commit(); // terminar a transaçao
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }

}