import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class ComplexTest {


    public static void main(String[] args) {

        Complex complex = new Complex();
        complex.setComplexId(0L);
        complex.setComplexName("Complex Name");
        complex.setComplexValue(123.45);
        complex.setComplexKind(ComplexKind.LARGE);
        complex.setComplexDate(new Date(System.currentTimeMillis()));
        complex.setTemporaryField("GEÇİCİ");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();


        entityManager.getTransaction().begin();

        entityManager.persist(complex);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
