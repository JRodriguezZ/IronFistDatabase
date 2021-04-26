package Functions;

import Entities.Jugador;
import Entities.Organizador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Jugador jugadorLocal = new Jugador();
        jugadorLocal.setNickname("Gedance");
        Jugador jugadorVisitante = new Jugador();
        jugadorVisitante.setNickname("ATP_Choper");

        Organizador organizador = new Organizador();
        organizador.
        entityManager.persist(jugadorLocal);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();

    }
}
