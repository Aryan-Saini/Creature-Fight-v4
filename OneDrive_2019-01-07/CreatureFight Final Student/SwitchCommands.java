import greenfoot.*;

/**
 * Write a description of class PlayerCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwitchCommands implements MenuCommands
{
    /**
     * execute executes the appropriate action based on which kind 
     * of menu is being used, which option is selected, and for which creature
     * the option is selected
     * 
     * @param idx is the index of the option chosen
     * @param c is the creature that is currently in play
     * @return Nothing is returned
     */
    public void execute(int idx, Creature c)
    {
        if(c instanceof Charmander || c instanceof Pikachu)
        {
            c.switchCreature(idx+1);
        }
        else if(c instanceof Golem || c instanceof Lapras)
        {
            if(idx == 1)
            {
                c.switchCreature(idx+1);
            }
            else
            {
                c.switchCreature(idx);
            }
        }
        else
        {
            c.switchCreature(idx);
        }
    }
}
