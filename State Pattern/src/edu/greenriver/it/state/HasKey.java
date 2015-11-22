package edu.greenriver.it.state;

import edu.greenriver.it.context.KeyLock;

public class HasKey implements IState
{
	KeyLock keyLock;

	public HasKey(KeyLock keyLock) {
        this.keyLock = keyLock;
    }
	
	@Override
	public void insertKey()
	{
		System.out.println("Key already inserted!");
		
	}

	@Override
	public void removeKey()
	{
		System.out.println("Removing key!");
		keyLock.setState(keyLock.getNoKey());
	}

	@Override
	public void turnKey()
	{
		System.out.println("Key turned!");
		keyLock.setState(keyLock.getUnlocked());
	}

	@Override
	public void unlocked()
	{
		System.out.println("Need to turn the key!");
		
	}
	
	public String toString()
	{
		return "closed";
	}

}
