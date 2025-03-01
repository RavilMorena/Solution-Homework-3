// combined/MUDCombinedDemo.java
package combined;

import builder.*;
import prototype.*;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        // Create a dungeon using the builder pattern
        IDungeonBuilder builder = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(new Room("Main Hall", "A vast chamber with pillars."))
                .addNPC(new NPC("Guardian", "A mighty stone golem."));

        Dungeon dungeon = builder.build();
        dungeon.displayDungeon();

        // Use prototype to clone rooms
        Room prototypeRoom = new Room("Side Chamber", "A small room with mysterious carvings.");
        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();

        // Modify clones slightly
        clonedRoom1 = new Room(clonedRoom1.getName() + " Clone #1", "A copy of the original room.");
        clonedRoom2 = new Room(clonedRoom2.getName() + " Clone #2", "Another identical chamber.");

        // Add cloned rooms to the dungeon
        dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins Extended")
                .addRoom(clonedRoom1)
                .addRoom(clonedRoom2)
                .build();

        dungeon.displayDungeon();
    }
}
