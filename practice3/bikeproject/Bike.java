package bikeproject;

public class Bike implements BikeParts {
    private String handleBars;
    private String frame;
    private String tyres;
    private String seatType;
    private int numGears;

    public Bike() {
    }

    public Bike(
            String handleBars,
            String frame,
            String tyres,
            String seatType,
            int numGears
    ) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        this.numGears = numGears;
    }

    @Override
    public String getHandleBars() {
        return handleBars;
    }

    @Override
    public void setHandleBars(String newValue) {
        handleBars = newValue;
    }

    @Override
    public String getTyres() {
        return tyres;
    }

    @Override
    public void setTyres(String newValue) {
        tyres = newValue;
    }

    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public void setSeatType(String newValue) {
        seatType = newValue;
    }

    public void printDescription() {
        System.out.println("\n" + MAKE + "\n"
                + "This bike has " + handleBars + " handlebars on a "
                + frame + " frame with " + numGears + " gears."
                + "\nIt has a " + seatType + " seat with " + tyres + " tyres.");
    }
}
