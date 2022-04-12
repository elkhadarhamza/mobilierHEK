package mobilierhek.service;
import mobilierhek.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService implements IArticleService {

    @Autowired
   private ArticleRepository articleRepository ;

    @Autowired
    private CategorieRepository categorieRepository ;



    @Override
    public List<Article> findAll() {
        List<Article> articles= articleRepository.findAll();
        return articles;

    }

    @Override
    public void addArticle(String nom, String description , Long categorie_id, String couleur, double prix) {
        Categorie categorie = categorieRepository.getById(categorie_id);
        articleRepository.save(new Article(nom, description, categorie, couleur, prix));
    }

    @Override
    public Optional<Article> FindbyId(Long id) {
        Optional<Article> article = articleRepository.findById(id);
        return article;
    }

    @Override
    public List<Article> getByPrixDesc() {
        List<Article> articles = articleRepository.findAllByOrderByPrixDesc();
        return articles;
    }

    @Override
    public List<Article> getByPrixAsc() {
        List<Article> articles = articleRepository.findAllByOrderByPrixAsc();
        return articles;
    }

    @Override
    public List<Article> getArticles(String prixmin,String prixmax) {
        List<Article> articles = articleRepository.getArticles(prixmin,prixmax);
        return articles;
    }

    public String getnombreArticle(){
return articleRepository.getnombreArticle();
    }
}