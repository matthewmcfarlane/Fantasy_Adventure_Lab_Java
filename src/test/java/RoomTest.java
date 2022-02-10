package Room;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;


    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void RoomStartsEmpty() {
        assertEquals(0, room.getExitSize());
    }

    @Test
    public void canCreateExits() {
        room.createExits();
        assertEquals(true, room.getExits().contains(Exit.NORTH));
        System.out.println(room.getExits());
        System.out.println(room.getExitSize());

    }
}
