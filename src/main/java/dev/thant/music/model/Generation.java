package dev.thant.music.model;
import dev.thant.music.model.modelUtils.AbstractEntity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "generation")
@EqualsAndHashCode(callSuper = false)
@SequenceGenerator(name = "GENERATION_SEQ",  allocationSize = 1)
public class Generation extends AbstractEntity {
    
    @Id
    @GeneratedValue(generator = "GENERATION_SEQ")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "generation")
    private List<Songs> songs;
}

