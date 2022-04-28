package GBatro.DnD.Player;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    public List<Player> getPlayers(){
        return List.of(
            new Player(
                1L,
                "Bob",
                "Rock Gnome",
                "Monk",
                35,
                30,
                3
            )
        );
    }

}
