package dev.thant.music.model;

import java.time.LocalDateTime;

import dev.thant.music.model.modelUtils.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "albums")
@EqualsAndHashCode(callSuper = false)
@SequenceGenerator(name = "ALBUM_SEQ",  allocationSize = 1)
public class Album  extends AbstractEntity{
    
    @Id
    @GeneratedValue(generator = "ALBUM_SEQ")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "cover_img_url")
    private String CoverImgUrl;

    @Column(name = "release_date")
    private LocalDateTime  releaseDate;

    @ManyToOne
    private Artists artists;
}
