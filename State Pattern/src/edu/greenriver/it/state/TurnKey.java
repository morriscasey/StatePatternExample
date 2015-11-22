package edu.greenriver.it.state;

import edu.greenriver.it.context.KeyLock;

public class TurnKey implements IState
{
	KeyLock keyLock;

	public TurnKey(KeyLock keyLock) {
        this.keyLock = keyLock;
    }
	
	@Override
	public void insertKey()
	{
		System.out.println("Key already inserted");
		
	}

	@Override
	public void removeKey()
	{
		System.out.println("Can't remove because key is turning");
	}

	@Override
	public void turnKey()
	{
		System.out.println("Turning key");
		keyLock.setState(keyLock.getUnlocked());
		
		
	}

	@Override
	public void unlocked()
	{
		System.out.println("Preparing to unlock");
		
	}
	
	public String toString()
	{
		return "closed";
	}


}
