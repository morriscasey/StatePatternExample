package edu.greenriver.it.state;

import edu.greenriver.it.context.KeyLock;

public class NoKey implements IState
{
	KeyLock keyLock;
	
	public NoKey(KeyLock keyLock) {
        this.keyLock = keyLock;
    }
	
	@Override
	public void insertKey()
	{
		System.out.println("You insert key into lock.");
		keyLock.setState(keyLock.getHasKey());
		
	}

	@Override
	public void removeKey()
	{
		System.out.println("Key was never inserted.");
		
	}

	@Override
	public void turnKey()
	{
		System.out.println("You try, but you are missing the key");
		
	}

	@Override
	public void unlocked()
	{
		System.out.println("Locked");
		
	}
	
	public String toString()
	{
		return "waiting for key";
	}
	
	


}
