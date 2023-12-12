package igor;

import igor.dao.EventoDAO;
import igor.entities.EventType;
import igor.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEventi");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDAO sd = new EventoDAO(em);

        Evento festaInPiscina = new Evento("Festa in piscina", "2023-01-01", EventType.PRIVATO, 200);
        Evento festaPatronale = new Evento("Festa Patronale", "2024-06-06", EventType.PUBBLICO, 2000);

//        sd.save(festaInPiscina);
//        sd.save(festaPatronale);


        sd.findByIdAndDelete(4);

        
    }
}
