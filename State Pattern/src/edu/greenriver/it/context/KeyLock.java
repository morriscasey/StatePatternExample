package edu.greenriver.it.context;

import edu.greenriver.it.state.HasKey;
import edu.greenriver.it.state.IState;
import edu.greenriver.it.state.NoKey;
import edu.greenriver.it.state.TurnKey;
import edu.greenriver.it.state.Unlocked;

public class KeyLock
{
	IState noKey;
	IState hasKey;
	IState turnKey;
	IState unlocked;
	
	private IState state;
	
	public KeyLock()
	{
		noKey = new NoKey(this);
		hasKey = new HasKey(this);
		turnKey = new TurnKey(this);
		unlocked = new Unlocked(this);
		state = noKey;
	}
	
	public void insertKey()
	{
		state.insertKey();
	}
	
	public void removeKey()
	{
		state.removeKey();
	}
	
	public void turnKey()
	{
		state.turnKey();
	}
	
	
	public void setState(IState state)
	{
		this.state = state;
	}
	
	public IState getState()
	{
		return this.state;
	}

    public IState getNoKey() 
    {
        return noKey;
    }

    public IState getHasKey() 
    {
        return hasKey;
    }
    
    public IState getTurnKey()
    {
    	return turnKey;
    }

    public IState getUnlocked() 
    {
        return unlocked;
    }
	
    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("Lock is " + this.getState() + "\n");
		return result.toString();
	}

}
