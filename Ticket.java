abstract class Ticket {
    protected double Harga_Awal;

    public Ticket(double Harga_Awal) {
        this.Harga_Awal = Harga_Awal;
    }

    public abstract int calculateFare();

    public void printTicketDetail() {
        System.out.println("Harga Total: " + calculateFare() + "\n");
    }
}