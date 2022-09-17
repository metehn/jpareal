import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BigWrite {

    public static void main(String[] args) throws IOException {

        String bigText = new String(Files.readAllBytes(Paths.get("deneme.txt")), Charset.forName("utf-8"));
        byte[] bigBytes = Files.readAllBytes(Paths.get("java.png"));


        Big big = new Big();
        big.setBigText(bigText);
        big.setBigBytes(bigBytes);


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();


        entityManager.getTransaction().begin();

        entityManager.persist(big);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
