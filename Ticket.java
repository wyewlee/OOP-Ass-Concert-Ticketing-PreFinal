
public class Ticket extends Product {

    private final double TICKETPRICE = 15.00; //normal price before discount
    private int ticketNo; //ticketCount
    private String SeatNo;
    private boolean adultTicket; //check whether adult?
    private double finalPrice; //after discount
    //private double totalPrice;  ??

    public Ticket() {
    }

    public Ticket(int ticketNo, String SeatNo, boolean ticketType) {
        this.ticketNo = ticketNo;
        this.SeatNo = SeatNo;
        this.adultTicket = ticketType;
        this.finalPrice = getDiscountTrig(ticketType);
    }

    public Ticket(String prodID, String prodName, int ticketNo,
            String SeatNo, boolean ticketType) {
        super(prodID, prodName);
        this.ticketNo = ticketNo;
        this.SeatNo = SeatNo;
        this.adultTicket = ticketType;
        this.finalPrice = getDiscountTrig(ticketType);
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getSeatNo() {
        return SeatNo;
    }

    public void setSeatNo(String SeatNo) {
        this.SeatNo = SeatNo;
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

    @Override
    public String toString() {
        return "Ticket{" + "ticketNo=" + ticketNo + ", SeatNo=" + SeatNo
                + ", ticketType=" + adultTicket + ", finalPrice=" + finalPrice + '}';
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
