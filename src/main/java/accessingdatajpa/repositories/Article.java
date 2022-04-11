package accessingdatajpa.repositories;

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
    @JoinColumn(name = "id")
    private String categorie;
    private String couleur;
    private double prix;
    @manytoone
    protected Article() {}

    public Article(String nom, String description, String categorie, String couleur, double prix ) {
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

    public void setCategorie(String categorie) {
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

    public String getCategorie() {
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
