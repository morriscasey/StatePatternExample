package edu.greenriver.it.state;

import edu.greenriver.it.context.KeyLock;

public class Unlocked implements IState
{
	KeyLock keyLock;
	
	public Unlocked(KeyLock keyLock) {
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
		System.out.println("Can't remove key, already unlocking");
	}

	@Override
	public void turnKey()
	{
		System.out.println("Turning key to lock");
		keyLock.setState(keyLock.getHasKey());
		
		
	}

	@Override
	public void unlocked()
	{
		System.out.println("Lock is unlocked");
		keyLock.setState(keyLock.getNoKey());
		
	}
	
	public String toString()
	{
		return "open";
	}


}
