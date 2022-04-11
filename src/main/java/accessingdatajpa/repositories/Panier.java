package accessingdatajpa.repositories;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="panier")
public class Panier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    @OneToMany()
    private List<Article> articles;
    private ModePayement modepayment;

}
