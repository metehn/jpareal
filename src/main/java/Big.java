import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Big {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bigId;
    @Lob
    private String bigText;
    @Lob()
    @Column(columnDefinition = "blob") /* bu etiketi yazmazsam şöyle bir hata veriyor -> Data truncation: Data too long for column 'bigBytes' at row 1.
     @Lob() etiketini yazmama rağmen veritabanı blob olarak yatarmıyor elle blob yarat demem gerekiyor. "tinyblob" olarak yatarıyor bu da hata veriyor.
     */
    private byte[] bigBytes;

}
