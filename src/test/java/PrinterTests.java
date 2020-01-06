import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void hasTonner(){
        assertEquals(100, printer.getTonnerVolume());
    }

    @Test
    public void canPrintPages(){
        printer.print(10, 9);
        assertEquals(10, printer.getSheetsOfPaper());
    }

    @Test
    public void canReduceToner(){
        printer.print(10, 9);
        assertEquals(10, printer.getTonnerVolume());
    }
}
