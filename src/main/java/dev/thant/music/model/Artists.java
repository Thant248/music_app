package dev.thant.music.model;

import java.util.List;

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
@Entity(name = "artists")
@EqualsAndHashCode(callSuper = false)
@SequenceGenerator(name = "ARTIST_SEQ",  allocationSize = 1)
public class Artists  extends AbstractEntity{
    
    @Id
    @GeneratedValue(generator = "ARTIST_SEQ")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "bio")
    private String bio;

    @Column(name = "image_url")
    private String imageUrl;

    @OneToMany(mappedBy = "artists")
    private List<Album> albums;
}
