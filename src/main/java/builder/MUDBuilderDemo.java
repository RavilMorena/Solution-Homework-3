package builder;

import prototype.NPC;
import prototype.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cavern")
                .addRoom(new Room("Entrance", "A dark and damp entrance."))
                .addRoom(new Room("Treasure Room", "Glittering with gold and jewels."))
                .addNPC(new NPC("Goblin", "A sneaky little creature."));

        Dungeon dungeon = builder.build();
        dungeon.displayDungeon();
    }
}
