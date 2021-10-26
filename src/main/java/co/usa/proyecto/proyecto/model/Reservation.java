package co.usa.proyecto.proyecto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String skate;
    private Integer client;
    private Date entry;
    private Date exit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkate() {
        return skate;
    }

    public void setSkate(String skate) {
        this.skate = skate;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Date getEntry() {
        return entry;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) {
        this.exit = exit;
    }
}