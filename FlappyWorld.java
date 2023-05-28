import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (Hamza Malik) 
 * @version (2019)
 */
public class FlappyWorld extends World 
{
    int PipeCounter = 0;
    int FlappyBirdCounter = 0;
    int PIPE_SPACING = 105;
    int FIRST_PIPE = 204;
    int Score = 0;
    Score scoreObj = null;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels!
        super(600, 400, 1, false);

        // Set paint order!
        setPaintOrder(GameOver.class, Score.class, FlappyBird.class, Ground.class, TopPipe.class, BottomPipe.class);

        // Create a Flappy Bird Object!
        FlappyBird flappy = new FlappyBird();

        // Add flappy to our world!
        addObject(flappy, 100, getHeight()/2);

        // Create a Score object!
        scoreObj = new Score();
        scoreObj.setScore(0);

        // Add it to our world!
        addObject (scoreObj, 100, 100);
        
        // Add a Ground to our world!
        Ground ground = new Ground();
        GreenfootImage image = ground.getImage();
        addObject(ground, getWidth()/2, 400);
        prepare();
    }
    
    public void act() {
        // PipeCounter!
        PipeCounter++;
        if (PipeCounter % 73 == 0) {
            Pipes();
        }
        
        // Every time FlappyBird passes a pipe, a point is added!
        if (PipeCounter >= FIRST_PIPE) {
            if (FlappyBirdCounter % 73 == 0) {
            Score++;
            scoreObj.setScore(Score);
        }
        FlappyBirdCounter++;
        }
    }
    
    private void Pipes() {
        // BottomPipe!
        BottomPipe botPipe = new BottomPipe();
        int offset = Greenfoot.getRandomNumber(195)+155;
            addObject(botPipe, getWidth(), 150 + offset);
            
        // TopPipe!
        TopPipe topPipe = new TopPipe();
        addObject(topPipe, botPipe.getX(), botPipe.getY() - topPipe.getImage().getHeight() - PIPE_SPACING);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,301,387);
        ground.setLocation(284,386);
        ground.setLocation(287,376);
        ground.setLocation(457,366);
        removeObject(ground);
    }
} 

        
   




