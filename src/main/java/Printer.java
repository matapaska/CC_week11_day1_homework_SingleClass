public class Printer {

    private int sheetsOfPaper;
    private int tonnerVolume;

    public Printer(int sheetsOfPaper, int tonnerVolume){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonnerVolume = tonnerVolume;
    }

    public int getSheetsOfPaper(){
        return this.sheetsOfPaper;
    }

    public int getTonnerVolume(){
        return this.tonnerVolume;
    }

    public void print(int pages, int copies){
        if (this.sheetsOfPaper > pages * copies){
             this.sheetsOfPaper -= (pages * copies);
             this.tonnerVolume -= (pages * copies);
        }
    }
}
