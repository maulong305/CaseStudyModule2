import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Manager {
    private static List<MotelRoom> list = new ArrayList<>();
// add room
    public static boolean addNewRoom(String name, Double area, int rates) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMotelRoomName().equals(name)) {
                return false;
            }
        }

        return list.add(new MotelRoom(name, area, rates));
    }

    public static ArrayList<MotelRoom> getRoomList() {
        return (ArrayList<MotelRoom>) list;
    }

//    delete room
    public static void deleteRoom(int idRoom){
        for (MotelRoom m: list){
            if (m.getIdMotelRoom() == idRoom){
                list.remove(m);
            }
        }
    }

//    search
    public static List<MotelRoom> search(String roomName){
        List<MotelRoom> result = new ArrayList<>();
        for (MotelRoom m: list){
            if (m.getMotelRoomName().toLowerCase().contains(roomName.toLowerCase())){
                result.add(m);
            }
        }
        return result;
    }

// Edit room
    public static void edit(int idRoom,String newName, double newArea, int newRates) {
        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i).getIdMotelRoom() == idRoom){
                list.get(i).setMotelRoomName(newName);
                list.get(i).setMotelRoomArea(newArea);
                list.get(i).setRates(newRates);
            }
        }
    }

    public static boolean isExistId(int id) {
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i).getIdMotelRoom() == id) {
                return true;
            }
        }
        return false;
    }

}
