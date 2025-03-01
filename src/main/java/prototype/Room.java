// prototype/Room.java
package prototype;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }
}
