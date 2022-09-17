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
}, uniqueConstraints = @UniqueConstraint(columnNames = "singularName")
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
