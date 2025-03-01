// prototype/NPC.java
package prototype;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description);
    }
}
