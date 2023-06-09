import java.util.Scanner;
class Radiator {
    private int RadiatorID;
    public boolean isOn;

    Radiator() {
        this.RadiatorID = RadiatorID + 15;
        System.out.println("" + this.RadiatorID);
    }
    public void setRadiatorID(int RadiatorID) {
        this.RadiatorID = RadiatorID;
    }
    public int getRadiator() {
        return this.RadiatorID;
    }
    public void heats(String roomName) {
        Room room = new Room(roomName);
        room.isHeatedBy(room.numRadiators);
    }
}
class Room {
    String roomName;
    int seatingCapacity, numRadiators;

    Room (String roomName) {
        this.seatingCapacity = 12;
    }
    public void isHeatedBy(int numRadiators) {
        this.numRadiators = numRadiators;
        if (this.numRadiators >= 0 && this.numRadiators < 2) {
            Radiator rd1 = new Radiator();
            System.out.println("\"Radiator successfully added to room.\"");
            this.numRadiators++;
            if (this.numRadiators >= 0 && this.numRadiators < 2) {
                Radiator rd2 = new Radiator();
                System.out.println("\"Radiator successfully added to room.\"");
                this.numRadiators++;
            }
            else {
                System.out.println("\"Radiator already added to room.\"");
            }
        }
        else if (this.numRadiators == 2) {
            System.out.println("\"Cannot add Radiator. Room has a maximum number of radiators.\"");
        }
    }
}
public class A1_Q1_22K_4054 {
    public static void main(String[] args) {
        String radiatorID;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student ID: ");
        radiatorID = sc.nextLine();

        String str = radiatorID;
        String s = str.replaceAll("[^0-9]", "");
        int wID = Integer.parseInt(s);
        wID = wID / 100;
        radiatorID = String.valueOf(wID % 100);

        System.out.println(radiatorID);
    }
}