import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int contador=0;
    GreenfootSound myMusic=new GreenfootSound("musica.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        comienzo();
    }
    public void act()
    {
        myMusic.playLoop();
        enemigos();
        showText("Puntos: "+ contador,400,25);
    }
    public void enemigos()
    {
        if (Greenfoot.getRandomNumber(60)<1)
        {
            addObject(new meteoro(), Greenfoot.getRandomNumber(600),0);
        }
    }
    private void comienzo()
    {
        jugador jugador1 = new jugador();
        addObject(jugador1, 10,10);
        jugador1.setLocation(250,530);
    }
    //referencias de ideas de código y resolución de problemas:https://www.youtube.com/watch?v=LT6IPr2W8dw&ab_channel=TannerCrow
    // el programa es dedominio público, con el unico fin en mente de educar y ayudar, se tomaron un par de referencias de ahí, sin embargo el código fue hecho de diferentes maneras
    //música con permiso del autor Music by <a href="https://pixabay.com/es/users/dstechnician-26430546/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=music&amp;utm_content=115161">DSTechnician</a> from <a href="https://pixabay.com//?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=music&amp;utm_content=115161">Pixabay</a>
}