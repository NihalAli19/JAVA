class House {
    class Room {
        String roomType;
        private int roomSize, roomTemperature;

        public Room(String roomType, int roomSize, int roomTemperature) {
            this.roomType = roomType;
            this.roomSize = roomSize;
            this.roomTemperature = roomTemperature;
        }

        public String getRoomType() {
            return roomType;
        }

        public int getRoomSize() {
            return roomSize;
        }

        public int getRoomTemperature() {
            return roomTemperature;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public void setRoomSize(int roomSize) {
            this.roomSize = roomSize;
        }

        public void setRoomTemperature(int roomTemperature) {
            this.roomTemperature = roomTemperature;
        }

        public void details() {
            System.out.println("Room type: "+roomType);
            System.out.println("Room size: "+roomSize);
            System.out.println("Room temperature: "+roomTemperature);
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        House house = new House();
        House.Room room = house.new Room("Business",290,24);
        room.details();
    }
}
