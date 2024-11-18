public class Main {
    static final int HARGA_TIKET = 1000000; // Harga tiket statis 1 juta
    
    public static void main(String[] args) {
        // Membuat objek tiket berdasarkan kelas
        Ticket economyTicket = new EconomyTicket(HARGA_TIKET);
        Ticket businessTicket = new BusinessTicket(HARGA_TIKET);
        Ticket firstClassTicket = new FirstClassTicket(HARGA_TIKET);
        
        // Header reservasi tiket
        System.out.println("\n============================");
        System.out.println("       RESERVASI TIKET      ");
        System.out.println("============================\n");

        System.out.println("Harga Awal Tiket: " + HARGA_TIKET + "\n");
        
        // Menampilkan detail tiket
        System.out.println("Economy Class Ticket:");
        economyTicket.printTicketDetail();

        System.out.println("\nBusiness Class Ticket:");
        businessTicket.printTicketDetail();

        System.out.println("\nFirst Class Ticket:");
        firstClassTicket.printTicketDetail();
        
        // Menampilkan info tambahan reservasi
        System.out.println("\n============================");
        System.out.println("Reservasi Tiket:");
        System.out.println("----------------------------");
        economyTicket.printTicketDetail();

        System.out.println("\n----------------------------");
        businessTicket.printTicketDetail();

        System.out.println("\n----------------------------");
        firstClassTicket.printTicketDetail();
        System.out.println("\n============================");
    }
}
