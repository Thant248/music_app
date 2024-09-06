package dev.thant.music.model;

import java.lang.annotation.Inherited;
import java.util.List;

import javax.annotation.processing.Generated;

@Data
@Entity(name = "playlist")
@EqualsAndHashCode(callSuper = false)
@SequenceGenerator(name = "PLAYLIST_SEQ",  allocationSize = 1)
public class PlayList {
    
    @Id
    @GeneratedValue(generator = "PLAYLIST_SEQ")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "playlist")
    private List<User> user;

}
