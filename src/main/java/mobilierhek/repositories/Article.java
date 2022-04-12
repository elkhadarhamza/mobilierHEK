package mobilierhek.repositories;

import javax.persistence.*;
import java.util.List;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;

    @OneToMany()
    private List<ArticleImage> images;

    @OneToOne
    private Categorie categorie;

    private String couleur;
    private double prix;

    protected Article() {}

    public Article(String nom, String description, Categorie categorie, String couleur, double prix ) {
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.couleur = couleur;
        this.prix = prix;
    }
    public List<ArticleImage> getImages() {
        return images;
    }

    public void setImages(List<ArticleImage> images) {
        this.images = images;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getCouleur() {
        return couleur;
    }

    public double getPrix() {
        return prix;
    }

    public Long getId() {
        return id;
    }

}
