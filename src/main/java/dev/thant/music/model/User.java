package dev.thant.music.model;

import dev.thant.music.model.modelUtils.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "user")
@EqualsAndHashCode(callSuper = true)
@SequenceGenerator(name = "USER_SEQ",  allocationSize = 1)
public class User extends AbstractEntity {
    @Id
    @GeneratedValue(generator = "USER_SEQ")
    private int id;
    
    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "email", nullable = false)
    private String email;


    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany
    private List<PlayList> playList;
    
}
