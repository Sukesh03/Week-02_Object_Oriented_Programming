public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println();
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Ethan", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        System.out.println("Custom Booking:");
        customBooking.displayBooking();

        System.out.println("Copied Booking:");
        copiedBooking.displayBooking();
    }
}
