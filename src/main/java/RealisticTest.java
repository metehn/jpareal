import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RealisticTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Realistic realistic = new Realistic(0,"Deneme", 170000.1234);

        entityManager.getTransaction().begin();

        entityManager.persist(realistic);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
