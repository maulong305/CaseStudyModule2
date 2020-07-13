import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class MotelRoom implements Serializable {
    private int idMotelRoom;
    private String motelRoomName;
    private double motelRoomArea;
    private int rates;
    private int ElectricPrice = 3000;
    private int WaterPrice = 20000;
    private long pay;
    private String status;

    static int count;

    public MotelRoom(String motelRoomName, double motelRoomArea, int rates) throws IOException {
        count++;
        FileWriter fileWriter = new FileWriter(
                "D:\\Bai_tap\\Module_2\\CaseStudyNew\\src\\counter.txt");
        fileWriter.write(count);
        fileWriter.close();

        this.idMotelRoom = count;
        this.motelRoomName = motelRoomName;
        this.motelRoomArea = motelRoomArea;
        this.rates = rates;
        this.status = "Not paid";
    }

    public long getPay() {
        return pay;
    }

    public void setPay(long pay) {
        this.pay = pay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdMotelRoom() {
        return idMotelRoom;
    }

    public void setIdMotelRoom(int idMotelRoom) {
        this.idMotelRoom = idMotelRoom;
    }

    public String getMotelRoomName() {
        return motelRoomName;
    }

    public void setMotelRoomName(String motelRoomName) {
        this.motelRoomName = motelRoomName;
    }

    public double getMotelRoomArea() {
        return motelRoomArea;
    }

    public void setMotelRoomArea(double motelRoomArea) {
        this.motelRoomArea = motelRoomArea;
    }

    public int getRates() {
        return rates;
    }

    public void setRates(int rates) {
        this.rates = rates;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MotelRoom.count = count;
    }

    public int getElectricPrice() {
        return ElectricPrice;
    }

    public void setElectricPrice(int electricPrice) {
        ElectricPrice = electricPrice;
    }

    public int getWaterPrice() {
        return WaterPrice;
    }

    public void setWaterPrice(int waterPrice) {
        WaterPrice = waterPrice;
    }

    @Override
    public String toString() {
        return
                "idMotelRoom = " + idMotelRoom +
                        ", motelRoomName = '" + motelRoomName + '\'' +
                        ", motelRoomArea = " + motelRoomArea +
                        ", rates = " + rates + ", Room Status = " + status + ", Pay = " + pay;
    }
}
