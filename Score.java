import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (Hamza Malik) 
 * @version (2019)
 */
public class Score extends Actor
{
    public Score () {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        setImage(newImage);
    }
    
    public void setScore(int score) {
       GreenfootImage newImage = getImage();
       newImage.clear();
       // Font is Comic Sans MS with font size 33!
       Font f = new Font("Comic Sans MS", 33);
       newImage.setFont(f);
       
       // BackGround Color is transparent Grey!
       Color c = new Color(127, 127, 127, 127);
       newImage.setColor(c);
       newImage.fill();
       
       // Font color is BLACK, set in the middle of the Score background!
       newImage.setColor(Color.BLACK);
       newImage.drawString("" + score, 35, 37);
       setImage(newImage);
    }
}
