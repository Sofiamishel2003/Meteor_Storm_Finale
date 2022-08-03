import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balas extends Actor
{
    MyWorld thisGame;
    /**
     * Act - do whatever the balas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimiento();
        disparo();
    }
    public balas() // para que sean mas pequeñas
    {
        GreenfootImage bolita=getImage();
        bolita.scale(((int)bolita.getWidth()/3),((int)bolita.getHeight()/3));
    }
    public void movimiento()
    {
        setLocation(getX(),getY()-5);
    }
    public void disparo()
    {
        Actor objetivo = getOneIntersectingObject(meteoro.class);
        if (objetivo!=null)
        {
            getWorld().removeObject(objetivo);
            getWorld().removeObject(this);
            thisGame.contador++;
        }
        else if (getY()==0) //para borrar las bolitas al final de la pantalla y no se acumulen
        {
            getWorld().removeObject(this);
        }
    }
    }
