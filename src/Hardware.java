public class Hardware
{
    private int howManyDifferentTools;

    public int getHowManyDifferentTools() {
        return howManyDifferentTools;
    }

    public void setHowManyDifferentTools(int howManyDifferentTools) {
        this.howManyDifferentTools = howManyDifferentTools;
    }
    public void purchaseTools (int tools){
        System.out.println("I PURCHASED " + tools + " MANY TOOLS TODAY FOR "+  tools*100*Math.random() +" DOLLARS!");
    }
}
