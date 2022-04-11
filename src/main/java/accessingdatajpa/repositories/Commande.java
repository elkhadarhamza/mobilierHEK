package accessingdatajpa.repositories;

import javax.persistence.*;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String idCommande;
    private String numCommande;
    private String prixTot;
    private String datecLivraisonCommande;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private Utilisateur utilisateur;
}
