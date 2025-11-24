package Lab_4_COMPOSITION;

import java.security.PublicKey;
import java.util.*;

class House {
    private List<Room> rooms;    

    House(){
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void showRoom(){
        for(Room x:rooms){
            x.display();
        }
    }
}
