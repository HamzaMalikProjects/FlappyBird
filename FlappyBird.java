import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flappy_bird here.
 * 
 * @author (Hamza Malik) 
 * @version (2019)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double BOOST_SPEED = -11.4;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // If we touch a BottomPipe, Game Over!
        if (getOneIntersectingObject(BottomPipe.class) != null) {
            displayGameOver();
        }
        
        // If we touch a TopPipe, Game Over!
        if (getOneIntersectingObject(TopPipe.class) != null) {
            displayGameOver();
        }
        
        // If we touch the Ground, Game Over!
        if (getOneIntersectingObject(Ground.class) !=null) {
            displayGameOver();
            Greenfoot.stop();
        }
        
        rotateFlappyBird();
        setLocation( getX(), (int)(getY() + dy) );
        
        // If user press space bar, launch FlappyBird upward!
        if (Greenfoot.isKeyDown("space") == true)  {
            dy = BOOST_SPEED;
        }
        
        // If FlappyBird drops out of the world, Game over!
        if (getY() > getWorld().getHeight()) {
            displayGameOver();
        }
        dy = dy +g;
        }
    
    private void displayGameOver() {
        // GameOver!
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    
    private void rotateFlappyBird() {
        // FlappyBird rotation!
        if (dy<1)
            setRotation(-41);
        else if (dy<2)
            setRotation(+33);
        else if (dy<3)
            setRotation(41);
    }    
    
}