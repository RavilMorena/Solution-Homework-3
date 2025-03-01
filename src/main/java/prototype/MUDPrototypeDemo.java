// prototype/MUDPrototypeDemo.java
package prototype;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Hallway", "A long and dark hallway.");
        Room clonedRoom = prototypeRoom.cloneEntity();

        NPC prototypeNPC = new NPC("Skeleton Warrior", "An undead fighter.");
        NPC clonedNPC = prototypeNPC.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom.getName());
        System.out.println("Cloned Room: " + clonedRoom.getName());

        System.out.println("Original NPC: " + prototypeNPC.getName());
        System.out.println("Cloned NPC: " + clonedNPC.getName());
    }
}
