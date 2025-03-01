package builder;

import prototype.NPC;
import prototype.Room;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}
