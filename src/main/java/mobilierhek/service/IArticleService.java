package mobilierhek.service;

import mobilierhek.repositories.Article;

import java.util.List;
import java.util.Optional;

public interface IArticleService {

   List<Article> findAll();
   void addArticle(String nom, String description, Long categorie_id, String couleur, double prix);
   Optional<Article> FindbyId(Long id);
   List<Article> getByPrixDesc();
   List<Article> getByPrixAsc();
   List<Article> getArticles(String prixmin, String prixmax);
   String getnombreArticle();
}
