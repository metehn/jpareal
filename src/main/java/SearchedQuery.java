import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SearchedQuery {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OurPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        String jpql = "select searched from Searched as searched "
                + " order by searchedName desc";
        TypedQuery<Searched> query = entityManager.createQuery(jpql, Searched.class);
        List<Searched> searchedList = query.getResultList();

        entityManager.close();

        for (Searched searched : searchedList) {

            System.out.println(searched.getSearchedId()
                    + " " + searched.getSearchedName()
                    + " " +  searched.getSearchedValue()
                    + " " + searched.getSearchedCount()
                    + " " + searched.getSingularName());
        }

    }

}
