
public class Ticket extends Product {

    private final double TICKETPRICE = 15.00; //normal price before discount
    private static int ticketCount; //ticketCount
    private String ticketID; //ticketCount
    private String SeatNo;
    private boolean adultTicket; //check whether adult?
    private double finalPrice; //after discount

    public Ticket() {
    }

    public Ticket(boolean ticketType) {
        ticketCount++;
        this.ticketID = "TIC" + (ticketCount + 1000);
        this.SeatNo = "A" + (ticketCount + 100);
        this.adultTicket = ticketType;
        this.finalPrice = getDiscountTrig(ticketType);
    }

    public Ticket(String prodID, String prodName,
            boolean ticketType) {
        super(prodID, prodName);
        ticketCount++;
        this.ticketID = "TIC" + (ticketCount + 1000);
        this.SeatNo = "A" + (ticketCount + 100);
        this.adultTicket = ticketType;
        this.finalPrice = getDiscountTrig(ticketType);
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
    }

    public static int getTicketCount() {
        return ticketCount;
    }

    public static void setTicketCount(int ticketCount) {
        Ticket.ticketCount = ticketCount;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public boolean isAdultTicket() {
        return adultTicket;
    }

    public void setTicketType(boolean ticketType) {
        this.adultTicket = ticketType;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getTICKETPRICE() {
        return TICKETPRICE;
    }

    @Override
    public String toString() {
        return super.toString() + "Ticket{" + "TICKETPRICE=" + TICKETPRICE + ", ticketID="
                + ticketID + ", SeatNo=" + SeatNo + ", adultTicket="
                + adultTicket + ", finalPrice=" + finalPrice + '}';
    }

    private double getDiscountTrig(boolean ticketType) {
        //calculate discount Trigger
        if (ticketType == false) {
            return finalPrice = this.TICKETPRICE - 5;
        } else {
            return finalPrice = this.TICKETPRICE;
        }

    }
}
