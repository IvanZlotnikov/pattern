package pattern.facade;

public class Main {
    public static void main(String[] args) {
        //preparing human to good life

        //with hand
        BookShop bookShop = new BookShop();
        bookShop.buyBooks();

        CarShop carShop = new CarShop();
        carShop.buyCar();

        GlovesShop glovesShop = new GlovesShop();
        glovesShop.buyGloves();

        ClockShop clockShop = new ClockShop();
        clockShop.byuCLock();

        TicketBooth ticketBooth = new TicketBooth();
        ticketBooth.buyTicket();
        System.out.println();

        //with facade
        ShoppingFacade facade = new ShoppingFacade(
                new BookShop(),
                new CarShop(),
                new ClockShop(),
                new GlovesShop(),
                new TicketBooth());
        facade.prepareToTravel();
    }
}
