package Room;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private ArrayList<Exit> exits;

    public Room() {
        this.exits = new ArrayList<Exit>();
    }

    public void createExits(){

        ArrayList<Exit> possibleExits = new ArrayList<Exit>();
        possibleExits.add(Exit.NORTH);
        possibleExits.add(Exit.EAST);
        possibleExits.add(Exit.SOUTH);
        possibleExits.add(Exit.WEST);
        Random rand = new Random();
        int numberOfExits = rand.nextInt(3);
        for (int i = 0; i < numberOfExits; i++){
            exits.add(possibleExits.get(i));
        }

    }

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public int getExitSize(){
        return getExits().size();
    }
}
