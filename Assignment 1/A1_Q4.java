import java.util.Scanner;

class Movie {
    private String movieName, showTime;

    public void setmovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getmovieName() {
        return movieName;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    public String getShowTime() {
        return showTime;
    }

    public void displayDetails() {
        System.out.println("Movies you can watch today:");
        System.out.println("Movie Name: "+getmovieName());
        System.out.println("Show time: "+getShowTime());
    }
}

class Ticket {
    int row_number, seat_number, ticketID, bookedSeat = 2, bookRow = 5;
    String sID;
    private boolean seatStatus = false;

    public void ticketStatus(int row_number, int seat_number, String sID) {
        this.row_number = row_number;
        this.seat_number = seat_number;
        Scanner sc = new Scanner(System.in);
        String str = sID;
        String s = str.replaceAll("[^0-9]", "");
        int wID = Integer.parseInt(s);
        wID = wID / 100;
        this.ticketID = wID % 100;
        this.seatStatus = false;
        if (seat_number == bookedSeat && row_number == bookRow) {
            this.seatStatus = false;
            System.out.println("Sorry this ticket is booked!");
        } else {
            this.seatStatus = true;
            System.out.println("Ticket purchased successfully.\nTicket Number: " +ticketID+"\nSeat Number is: " +seat_number+ "\nRow: " +row_number);
        }
    }
}

public class A1_Q4_22K_4054 {
    public static void main(String[] args) {
        int row_number, seat_number;
        String sID;

        Scanner sc = new Scanner(System.in);

        Movie movie = new Movie();
        movie.setmovieName("Hera Pheri");
        movie.setShowTime("10:00 pm");
        movie.setmovieName("Phir Hera Pheri");
        movie.setShowTime("12:00 pm");
        movie.setmovieName("3 Idiots");
        movie.setShowTime("01:00 am");

        movie.displayDetails();

        System.out.println("\n*** Enter booking details ***");
        System.out.println("Seat number: ");
        seat_number = sc.nextInt();
        System.out.println("Row number: ");
        row_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Your Student ID:");
        sID = sc.nextLine();

        Ticket ticket = new Ticket();
        ticket.ticketStatus(row_number, seat_number, sID);
    }
}
