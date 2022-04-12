package mobilierhek.repositories;

import javax.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    protected Adresse() {
    }

    public Adresse(Long id, String details) {
        this.id = id;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String details;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
