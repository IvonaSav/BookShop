package project.bookshop.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String username;

    private String password;
}
