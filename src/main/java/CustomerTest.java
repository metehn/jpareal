import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomerTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Customer customer = new Customer(0,"Ersoy", 130000);

        entityManager.getTransaction().begin();

        entityManager.persist(customer);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
