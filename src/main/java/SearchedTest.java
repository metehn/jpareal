import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SearchedTest {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager =factory.createEntityManager();



        entityManager.getTransaction().begin();

        for(int i=0; i<100; i++){

            Searched searched = new Searched();
            searched.setSearchedName("Ad " + i);
            searched.setSearchedValue(12345.0+i*100);
            searched.setSearchedCount(i);
            searched.setSingularName("Unique " +i);

            entityManager.persist(searched);
        }


        entityManager.getTransaction().commit();

        entityManager.close();
    }


}
