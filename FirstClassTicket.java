class FirstClassTicket extends Ticket {
    private static final double Diskon = 0.50;

    public FirstClassTicket(double Harga_Awal) {
        super(Harga_Awal);
    }

    @Override
    public int calculateFare() {
        return (int) (Harga_Awal * (1 + Diskon));
    }
}