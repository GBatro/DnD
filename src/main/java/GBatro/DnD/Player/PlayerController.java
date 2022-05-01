package GBatro.DnD.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping
    public void addNewPlayer(@RequestBody Player player){
        playerService.addNewPlayer(player);
    }

    @DeleteMapping(path = "{playerId}")
    public void deletePlayer(
        @PathVariable("playerId") Long id) {
        playerService.deletePlayer(id);
    }

    @PutMapping(path = "{playerId}")
    public void updatePlayerRace(
        @PathVariable("playerId") Long id,
        @RequestParam(required = true) String race) {
            playerService.updatePlayerRace(id, race);
    }
}
