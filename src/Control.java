import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Control {

    public static void main(String[] args) throws IOException {

        while (true) {
            showMenu();
        }
    }
//    add Room
    public static void addRoom() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter motelRoomName : ");
        String motelRoomName = scanner.nextLine();

        System.out.println("Enter motelRoomArea : ");
        double motelRoomArea = scanner.nextDouble();

        System.out.println("Enter rates : ");
        int rates = scanner.nextInt();
        Manager.addNewRoom(motelRoomName, motelRoomArea, rates);
    }
// delete room
    public static void detele(){
        showRoomList();
        System.out.println("Nhập ID của phòng muốn xóa:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Manager.deleteRoom(id);
        showRoomList();
    }
//    search room
    public static void search(){
        System.out.println("Nhập tên phòng muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String roomName = scanner.nextLine();
        List<MotelRoom> result = Manager.search(roomName);
        for (MotelRoom m : result){
            System.out.println(m);
        }
    }
//    edit room
    public static void edit() {
        System.out.println("Nhập id phòng muốn sửa");
        Scanner scanner = new Scanner(System.in);
        int idRoom = scanner.nextInt();
        if (!Manager.isExistId(idRoom)){
            System.out.println("not found");
            return;
        }
        scanner.nextLine();
        System.out.println("Enter new name :");

        String newName = scanner.nextLine();

        System.out.println("Enter new Area ");
        double newArea = scanner.nextDouble();

        System.out.println("Enter new rates ");
        int newRates = scanner.nextInt();

        Manager.edit(idRoom, newName, newArea, newRates);


    }

    public static void showRoomList(){
        for (MotelRoom m: Manager.getRoomList()){
            System.out.println(m);
        }
    }

    public static void showMenu() throws IOException {
        System.out.println("Enter 1: Add Room ");
        System.out.println("Enter 2: Delete Room ");
        System.out.println("Enter 3: Edit Room ");
        System.out.println("Enter 4: Search ");
        System.out.println("Enter 5: Display ");

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        switch (m) {
            case 1:
                addRoom();
                break;
            case 2:
                detele();
                break;
            case 3:
                edit();
                break;
            case 4:
                search();
                break;
            case 5:
                showRoomList();
                break;
            default:
        }
    }


}
