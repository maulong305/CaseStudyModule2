
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuManagement {
    static List<MotelRoom> motelRoomList = new ArrayList<>();

    public static void main(String[] args) {

    }
    public static void menu() throws Exception {

        if (motelRoomList.size() == 0) {
            FileManagement.readCounterFile();
            FileManagement.readMotelRoomFile(motelRoomList);
        }
        System.out.println("\n");
        System.out.println("Enter 1: Add Room ");
        System.out.println("Enter 2: Delete Room ");
        System.out.println("Enter 3: Edit Room ");
        System.out.println("Enter 4: Search ");
        System.out.println("Enter 5: Display ");
        System.out.println("Enter 6: Print Bill");

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        switch (m) {
            case 1:
                MotelRoom newRoom = RoomManage.create();
                motelRoomList.add(newRoom);
                FileManagement.writerMotelRoomFile(motelRoomList);
                break;
            case 2:
                RoomManage.delete(motelRoomList);
                FileManagement.writerMotelRoomFile(motelRoomList);
                break;
            case 3:
                RoomManage.repair(motelRoomList);
                FileManagement .writerMotelRoomFile(motelRoomList);
                break;
            case 4:
                RoomManage.searchRoom(motelRoomList);
                break;
            case 5:
                RoomManage.display(motelRoomList);
                break;
            case 6:
                RoomManage.pay(motelRoomList);
                FileManagement.writerMotelRoomFile(motelRoomList);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Please choose again!");
                break;
        }

    }
}
