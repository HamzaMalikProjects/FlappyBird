import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BottomPipe here.
 * 
 * @author (Hamza Malik) 
 * @version (2019)
 */
public class TopPipe extends Actor
{
    // speed of pipe is -4 (moving left)!
    int PIPE_SPEED = -4;
    
    /**
     * Act - do whatever the BottomPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() + PIPE_SPEED, getY() );
    }    
}
