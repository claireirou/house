
/**
 * Create a bird like creature that is aboslutely
 * not copyright infringment.
 *
 * @author Claire Iroudayasssamy
 * @version Jan 2019
 */
public class Tweeter
{
    private Circle bodyBlue;
    private Circle bodyWhite;
    private Circle bodyFiller;
    private Circle wing1Blue;
    private Circle wing1White;
    private Circle wing2Blue;
    private Circle wing2White;
    private Circle wing3Blue;
    private Circle wing3White;
    private Circle topWhite;
    private Circle beak1Blue;
    private Circle beak1White;
    private Circle beak2Blue;
    private Circle beak2White;
    private Circle headFiller;
    private Circle headBlue;
    private boolean drawn;

    /**
     * Constructor for objects of class Tweeter
     */
    public Tweeter()
    {
        bodyBlue = new Circle();
        bodyWhite = new Circle();
        bodyFiller = new Circle();
        wing1Blue = new Circle();
        wing1White = new Circle();
        wing2Blue = new Circle();
        wing2White = new Circle();
        wing3Blue = new Circle();
        wing3White = new Circle();
        topWhite = new Circle();
        beak1Blue = new Circle();
        beak1White = new Circle();
        beak2Blue = new Circle();
        beak2White = new Circle();
        headFiller = new Circle();
        headBlue = new Circle();
        drawn = false;
    }

    
    public void draw()
    {
        if(!drawn){
            bodyBlue.changeColor("light blue");
            bodyBlue.moveHorizontal(202);
            bodyBlue.moveVertical(36);
            bodyBlue.changeSize(400);
            bodyBlue.moveHorizontal(-100);
            bodyBlue.makeVisible();
            
            bodyWhite.changeColor("white");
            bodyWhite.moveHorizontal(123);
            bodyWhite.moveVertical(45);
            bodyWhite.changeSize(360);
            bodyWhite.moveHorizontal(-100);
            bodyWhite.makeVisible();
            
            bodyFiller.changeColor("light blue");
            bodyFiller.moveHorizontal(395);
            bodyFiller.moveVertical(193);
            bodyFiller.changeSize(141);
            bodyFiller.moveHorizontal(-100);
            bodyFiller.makeVisible();
            
            wing1Blue.changeColor("light blue");
            wing1Blue.moveHorizontal(331);
            wing1Blue.moveVertical(236);
            wing1Blue.changeSize(138);
            wing1Blue.moveHorizontal(-100);
            wing1Blue.makeVisible();
            
            wing1White.changeColor("white");
            wing1White.moveHorizontal(282);
            wing1White.moveVertical(195);
            wing1White.changeSize(130);
            wing1White.moveHorizontal(-100);
            wing1White.makeVisible();
            
            wing2Blue.changeColor("light blue");
            wing2Blue.moveHorizontal(309);
            wing2Blue.moveVertical(186);
            wing2Blue.changeSize(138);
            wing2Blue.moveHorizontal(-100);
            wing2Blue.makeVisible();
            
            wing2White.changeColor("white");
            wing2White.moveHorizontal(277);
            wing2White.moveVertical(134);
            wing2White.changeSize(129);
            wing2White.moveHorizontal(-100);
            wing2White.makeVisible();
            
            wing3Blue.changeColor("light blue");
            wing3Blue.moveHorizontal(310);
            wing3Blue.moveVertical(138);
            wing3Blue.changeSize(139);
            wing3Blue.moveHorizontal(-100);
            wing3Blue.makeVisible();
            
            topWhite.changeColor("white");
            topWhite.moveHorizontal(274);
            topWhite.moveVertical(-149);
            topWhite.changeSize(393);
            topWhite.moveHorizontal(-100);
            topWhite.makeVisible();
            
            beak1Blue.changeColor("light blue");
            beak1Blue.moveHorizontal(467);
            beak1Blue.moveVertical(59);
            beak1Blue.changeSize(178);
            beak1Blue.moveHorizontal(-100);
            beak1Blue.makeVisible();
            
            beak1White.changeColor("white");
            beak1White.moveHorizontal(503);
            beak1White.moveVertical(19);
            beak1White.changeSize(180);
            beak1White.moveHorizontal(-100);
            beak1White.makeVisible();
            
            beak2Blue.changeColor("light blue");
            beak2Blue.moveHorizontal(453);
            beak2Blue.moveVertical(42);
            beak2Blue.changeSize(179);
            beak2Blue.moveHorizontal(-100);
            beak2Blue.makeVisible();
            
            beak2White.changeColor("white");
            beak2White.moveHorizontal(478);
            beak2White.moveVertical(-9);
            beak2White.changeSize(188);
            beak2White.moveHorizontal(-100);
            beak2White.makeVisible();
            
            headFiller.changeColor("white");
            headFiller.moveHorizontal(401);
            headFiller.moveVertical(62);
            headFiller.changeSize(141);
            headFiller.moveHorizontal(-100);
            headFiller.makeVisible();
            
            headBlue.changeColor("light blue");
            headBlue.moveHorizontal(461);
            headBlue.moveVertical(155);
            headBlue.changeSize(141);
            headBlue.moveHorizontal(-100);
            headBlue.makeVisible();
            
            drawn = true;
        }
    }
}
