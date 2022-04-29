package GBatro.DnD.Player;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
        name = "player_sequence",
        sequenceName = "player_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "player_sequence"
    )
    private Long id;
    private String name;
    private String race;
    private String classType;
    private Integer maxHealth;
    private Integer health;
    private Integer level;

    public Player() {
    }

    public Player(Long id, 
                  String name, 
                  String race, 
                  String classType, 
                  Integer maxHealth, 
                  Integer health, 
                  Integer level) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.classType = classType;
        this.maxHealth = maxHealth;
        this.health = health;
        this.level = level;
    }

    public Player(String name, 
                  String race, 
                  String classType, 
                  Integer maxHealth, 
                  Integer health, 
                  Integer level) {
        this.name = name;
        this.race = race;
        this.classType = classType;
        this.maxHealth = maxHealth;
        this.health = health;
        this.level = level;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRace(){
        return race;
    }

    public void setRace(String race){
        this.race = race;
    }

    public String getClassType(){
        return classType;
    }

    public void setClassType(String classType){
        this.classType = classType;
    }

    public Integer getMaxHealth(){
        return maxHealth;
    }

    public void setMaxHealth(Integer maxHealth){
        this.maxHealth = maxHealth;
    }

    public Integer getHealth(){
        return health;
    }

    public void setHealth(Integer health){
        this.health = health;
    }

    public Integer getLevel(){
        return level;
    }

    public void setLevel(Integer level){
        this.level = level;
    }

    public String toString(){
        return "id: " + id +
             "\nname: " + name +
             "\nrace: " + race +
             "\nclass: " + classType +
             "\nmaxHealth: " + maxHealth +
             "\nhealth: " + health + 
             "\nlevel: " + level;
    }
}
