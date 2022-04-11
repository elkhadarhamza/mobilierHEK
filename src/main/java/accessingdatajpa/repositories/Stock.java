package accessingdatajpa.repositories;

import javax.persistence.*;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "article_id")
    private Article article;

    protected Stock() {
    }

    public Stock(Long id, Article article, Long count) {
        this.id = id;
        this.article = article;
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    private Long count;

    public Article getArticle() {
        return article;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
