import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SupplierTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Supplier supplier = new Supplier(0,"Metehan", 110000);

        entityManager.getTransaction().begin();

        entityManager.persist(supplier);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
