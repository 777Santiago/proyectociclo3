package co.usa.proyecto.proyecto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer skate;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkate() {
        return skate;
    }

    public void setSkate(Integer skate) {
        this.skate = skate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}