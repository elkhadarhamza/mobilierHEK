package accessingdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAllByOrderByPrixAsc();
    List<Article> findAllByOrderByPrixDesc();
    List<Article> findAllByOrderByNomDesc();

    @Query(nativeQuery = true, value="select * from article a where a.prix <=?2 && a.prix >=?1")
    public List<Article> getArticles(String prixmin,String prixmax);

    @Query(nativeQuery = true, value="select count(*) from article")
    public String getnombreArticle();
}