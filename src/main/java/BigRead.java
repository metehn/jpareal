import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BigRead {


    public static void main(String[] args) throws IOException {

        long bigId = 1;

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();

        Big big = entityManager.find(Big.class, bigId);

        entityManager.close();

        String bigText = big.getBigText();
        byte[] bigBytes = big.getBigBytes();

        Files.write(Paths.get("deneme2.txt"), bigText.getBytes(Charset.forName("utf-8")));
        Files.write(Paths.get("java2.jpg"), bigBytes);



    }



}
