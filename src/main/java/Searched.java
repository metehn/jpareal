import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(indexes = {
        @Index(columnList = "searchedName"),
        @Index(name = "myindex", columnList = "searchedName"),
        @Index(columnList = "searchedCount", unique = true),
        @Index(columnList = "searchedCount,searchedName")
}, uniqueConstraints = @UniqueConstraint(columnNames = "singularName") //The @UniqueConstraint annotation is for annotating multiple unique keys at the table level. https://stackoverflow.com/questions/15372654/uniqueconstraint-and-columnunique-true-in-hibernate-annotation
)

public class Searched {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long searchedId;
    private String searchedName;
    private double searchedValue;
    private int searchedCount;
    private String singularName;


}
