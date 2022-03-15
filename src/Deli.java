public class Deli {
    private boolean breakfastHours;
    private String neighborhoodName;

    public boolean isBreakfastHours() {
        return breakfastHours;
    }

    public void setBreakfastHours(boolean breakfastHours) {
        this.breakfastHours = breakfastHours;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }
    public void buySandwhich(String sandwhich)
    {
        System.out.println("I bought the " + sandwhich + "today and it was really good, maybe I'll try it again next time!");
    }
}
