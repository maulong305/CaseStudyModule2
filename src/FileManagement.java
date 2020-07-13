import java.io.*;
import java.util.List;

public class FileManagement {

    public static void writerMotelRoomFile(List<MotelRoom> motelRoomList) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(motelRoomList);

        bos.flush();
        bos.close();
        fos.close();
    }

    public static void readMotelRoomFile(List<MotelRoom> motelRoomList) throws Exception {
        File fileMotelRoomList = new File("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv");

        if (fileMotelRoomList.exists() && fileMotelRoomList.isFile()) {
            FileInputStream fis = new FileInputStream("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\motelRoomList.csv");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            List<MotelRoom> lisData = (List<MotelRoom>)ois.readObject();
            for (int i = 0; i < lisData.size(); i++) {
                MotelRoom motelRoom = lisData.get(i);
                motelRoomList.add(motelRoom);
            }
            fis.close();
            bis.close();
            ois.close();
        }
    }

    public static void readCounterFile() throws IOException {
        File fileCouter = new File("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counter.txt");

        if (fileCouter.exists() && fileCouter.isFile()) {
            FileReader frCounter = new FileReader("D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counter.txt");
            int counter = (int) frCounter.read();
            frCounter.close();

            MotelRoom.count = counter;
        }
    }
}
