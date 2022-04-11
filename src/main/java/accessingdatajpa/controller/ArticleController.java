package accessingdatajpa.controller;

import accessingdatajpa.repositories.Article;
import accessingdatajpa.service.IArticleService;
import accessingdatajpa.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping(value = "/AllArticles")
    public List<Article> getAllArticle() {
        return articleService.findAll();
    }
    /*
    ajouter un article
     */

    @PostMapping(value = "/api/article/add")
    public void ajouterArticle(@RequestParam(value = "nom") String nom,
                               @RequestParam(value = "description") String description,
                               @RequestParam(value = "categorie") String categorie,
                               @RequestParam(value = "couleur") String couleur,
                               @RequestParam(value = "prix") double prix) {
        articleService.addArticle(nom, description, categorie, couleur, prix);
    }

    /*
        afficher l'article qui a id passé en parametre
     */
    @GetMapping(value = "/api/article/all")
    public Optional<Article> getById(@RequestParam(value = "id") Long id) {
        return articleService.FindbyId(id);
    }


    /*
    afficher les articles descendant selon Prix
     */


    @GetMapping(value = "/api/article/prix-desc")
    public List<Article> getByPrixDesc() {
        return articleService.getByPrixDesc();
    }


    @GetMapping(value = "/api/article/prix-asc")
    public List<Article> getByPrixAsc() {
        return articleService.getByPrixAsc();
    }


    @GetMapping(value = "/api/article/prixMinPrixMax")
    public List<Article> getArticlesAvecPrixMinMax(@RequestParam(value = "prixmin") String prixmin, @RequestParam(value = "prixmax") String prixmax) {
        return articleService.getArticles(prixmin, prixmax);
    }
    /*
     afficher le nombre des articles dans le stock
    */
    @GetMapping(value = "/api/article/stock")
    public String getnombreArticle() {
        if (articleService.getnombreArticle() == null || articleService.getnombreArticle() == "0") {
            return "L'article n'est plus disponible";
        } else {
            return articleService.getnombreArticle();
        }
    }


}



