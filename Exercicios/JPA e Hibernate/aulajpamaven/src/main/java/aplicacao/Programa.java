package aplicacao;

import Dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {



    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa(null, "Carlos da silva", "carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null, "joaquin Torres", "joaquin@gmail.com");
//        Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");
//
//        // cria a conexao com o BD
//        // EntityManager -> faz a conexao e o acesso aos dados.
//        // EntityFactory -> cria o EntityManager.

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        //JPA quando ela faz qualquer coisa que nao seja apenas leitura, ela precisa de uma transaçao
//        // para fazer a transaçao
//        em.getTransaction().begin();
//
//        // .persist pega um obj e salva no BD
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//
//
//        // confirma a transaçao
//        em.getTransaction().commit();




        //COMO BUSCAR ALGUEM DO BANCO DE DADOS.

        // usamos o .find e passamos como parametro (classe, valor do ID)
        Pessoa p = em.find(Pessoa.class, 2);


        // para deletar algo do banco de dados. (precisa primeiro instanciar com o find para poder apagar e sempre usar o getTransacition
        // por nao ser apenas uma leitura de dados)
//        em.getTransaction().begin();
//        em.remove(p);
//        em.getTransaction().commit();



        System.out.println(p);
        em.close();
        emf.close();











    }




}