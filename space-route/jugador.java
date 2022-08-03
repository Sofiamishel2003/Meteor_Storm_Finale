import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador extends Actor
{ boolean permiso=true;
    MyWorld thisGame;
    /**
     * Act - do whatever the jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public jugador()
    {
        GreenfootImage nave=getImage();
        nave.scale(((int)nave.getWidth()/5),((int)nave.getHeight()/5));
    }
    public void act()
    {
        moveAround();
        disparar();
        muerte();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }

    }
    public void disparar()
    {
        if (Greenfoot.isKeyDown("space") && permiso==true)
        {
            getWorld().addObject(new balas(), getX()-1,getY()-48);
            permiso=false;
        }
        else if(!Greenfoot.isKeyDown("space")) //si continua precionando
        {
            permiso=true;
        }
    }
    public void muerte()
    {
        Actor colision = getOneIntersectingObject(meteoro.class);
        if (colision!=null)
        {
            Greenfoot.stop();
            getWorld().addObject(new YouLose(),250,300);
            thisGame.contador=0;
        }
        if (thisGame.contador==10)
        {
            getWorld().addObject(new YouWin(),250,300);
            Greenfoot.stop();
            thisGame.contador=0;
        }
        //Source del jugador :https://www.flaticon.es/icono-gratis/nave-espacial_1945907
        // Es de dominio público y se puede descargar gratis
    }
}
