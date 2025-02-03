package pattern.facade;

public class ShoppingFacade {
    private final BookShop bookShop;
    private final CarShop carShop;
    private final ClockShop clockShop;
    private final GlovesShop glovesShop;
    private final TicketBooth ticketBooth;

    public ShoppingFacade(BookShop bookShop, CarShop carShop, ClockShop clockShop, GlovesShop glovesShop, TicketBooth ticketBooth) {
        this.bookShop = bookShop;
        this.carShop = carShop;
        this.clockShop = clockShop;
        this.glovesShop = glovesShop;
        this.ticketBooth = ticketBooth;
    }

    public void prepareToTravel() {
        bookShop.buyBooks();
        carShop.buyCar();
        clockShop.byuCLock();
        glovesShop.buyGloves();
        ticketBooth.buyTicket();

    }
}
