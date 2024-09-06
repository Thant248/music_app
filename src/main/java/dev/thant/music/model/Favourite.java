package dev.thant.music.model;

import java.time.LocalDateTime;
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
@Entity(name = "favourite")
@EqualsAndHashCode(callSuper = false)
@SequenceGenerator(name = "FAVOURITE_SEQ",  allocationSize = 1)
public class Favourite extends AbstractEntity {

    @Id
    @GeneratedValue(generator = "FAVOURITE_SEQ")
    private int id;
    
    @Column(name = "favouriteable_id")
    private int favouriteableId;

    @Column(name = "favouriteable_time")
    private  LocalDateTime favouriteTime;

    @OneToMany(mappedBy = "favourite")
    private List<Songs> songs;

    @OneToMany(mappedBy = "favourite")
    private List<Album> albums;    
}
