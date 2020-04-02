package train;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {

    public static final int SCALE = 1;
    
	/* Private constants */


    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);

        double trainWidth = 3 * TrainCar.CAR_WIDTH + 4 * TrainCar.CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight();
        double dx = TrainCar.CAR_WIDTH + TrainCar.CONNECTOR;

        TrainCar engine = new Engine(Color.BLACK);
        TrainCar boxcar = new Boxcar(Color.GREEN);
        TrainCar boxcar2 = new Boxcar(Color.BLUE);
        TrainCar caboose = new Caboose(Color.RED);
        canvas.add(engine, x, y-100);
        canvas.add(boxcar, x+dx, y-100);
        canvas.add(boxcar2, x+2*dx, y-100);
        canvas.add(caboose, x+3*dx, y-100);

    }



//


}