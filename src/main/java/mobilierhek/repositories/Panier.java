package mobilierhek.repositories;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="panier")
public class Panier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToMany()
    private List<Article> articles;
    private ModePayement modepayment;

}
