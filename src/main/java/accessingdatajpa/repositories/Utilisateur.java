package accessingdatajpa.repositories;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private boolean id;
    private String nom;
    private String description;
    private String adresse;
    private String ville ;
    private String code_postal;
    private String adresse_email;
    @OneToMany( targetEntity=Commande.class )
    private List<Commande> commands = new ArrayList<>();


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Employee_Project",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    Set<Project> projects = new HashSet<>();

    public Utilisateur(boolean id) {
        this.id = id;
    }

    public Utilisateur(String nom, String description, String adresse, String ville, String code_postal, String adresse_email) {
    }
}
