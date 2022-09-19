import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Complex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long complexId;
    private String complexName;
    private double complexValue;
    @Enumerated(value = EnumType.STRING) //varsayılan EnumType.ORDINAL (Veriyi string olarak yazmak için. Varsayılanla deneyince farkı göreceksin)
    private ComplexKind complexKind;
    @Temporal(TemporalType.DATE)//sadete tarih tutuyor. TIME seçseydik sadece zaman tutacaktı. TIMESTAMP tarih ve günü tutuyor
    private Date complexDate;
    @Transient
    private  String temporaryField;//Bu alan veritabanında saklanmaz çünkü geçici

}
