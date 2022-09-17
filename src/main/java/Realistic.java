import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Realistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long realisticId;
    @Column(length = 80, nullable = false, updatable = true, unique = true)
    private String realisticName;
    @Column(columnDefinition="Decimal(10,2) default '100.00'") // 123456789111,22
    private double realisticValue;

}
