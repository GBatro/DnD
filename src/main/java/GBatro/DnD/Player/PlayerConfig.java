package GBatro.DnD.Player;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository) {
        return args -> {
            Player bob = new Player(
                "Bob",
                "Rock Gnome",
                "Monk",
                35,
                30,
                3
            );

            Player turne = new Player(
                "Turne",
                "Half Elf",
                "Wizard",
                20,
                19,
                3
            );

            repository.saveAll(
                List.of(bob, turne)
            );
        };
    }
}
