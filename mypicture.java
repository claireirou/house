
/**
 * Write a description of class mypicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mypicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square ground;
    private boolean drawn;

    /**
     * Constructor for objects of class mypicture
     */
    public mypicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        ground = new Square();
        drawn = false;
    }
    
    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            ground.changeSize(500);
            ground.changeColor("green");
            ground.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("red");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
    }

