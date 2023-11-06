package mmo;

public class Player implements Comparable {
    private String name;
    private int health;
    private int level;

    public Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Object o) {
        
        return 0;
    }
}
