package dev.thant.music.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "listen_history")
@EqualsAndHashCode(callSuper = false)
public class ListenHistory {
    
    @Column(name = "listened_at")
    private LocalDateTime ListenedAt;

    @OneToMany(mappedBy = "listenHistory")
    private List<User> users;

    @OneToMany(mappedBy = "listenHistory")
    private List<Songs> songs;
}
