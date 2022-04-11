package accessingdatajpa.service;

import accessingdatajpa.repositories.Article;
import accessingdatajpa.repositories.ArticleImage;
import accessingdatajpa.repositories.Categorie;

import java.util.List;
import java.util.Optional;

public interface IArticleService {

   List<Article> findAll();
   void addArticle(String nom, String description, String categorie, String couleur, double prix);
   Optional<Article> FindbyId(Long id);
   List<Article> getByPrixDesc();
   List<Article> getByPrixAsc();
   List<Article> getArticles(String prixmin, String prixmax);
   String getnombreArticle();
}
