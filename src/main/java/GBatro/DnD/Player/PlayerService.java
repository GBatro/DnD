package GBatro.DnD.Player;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    public void addNewPlayer(Player player) {
        Optional<Player> playerByName = playerRepository.findPlayerByName(player.getName());
        if(playerByName.isPresent()) {
            throw new IllegalStateException("name used");
        }
        else{
            playerRepository.save(player);
        }
    }

    public void deletePlayer(Long id) {
        if(playerRepository.existsById(id)) {
            playerRepository.deleteById(id);
        }
        else{
            throw new IllegalStateException("player not found");
        }
    }
    
    @Transactional
    public void updatePlayerRace(Long id, String race) {
        if(playerRepository.existsById(id)) {
            Player player = playerRepository.getById(id);
            if(race != null && !Objects.equals(race, player.getRace())) {
                player.setRace(race);
            }
        }
    }
}
