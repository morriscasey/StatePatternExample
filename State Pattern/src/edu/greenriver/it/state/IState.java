package edu.greenriver.it.state;

import edu.greenriver.it.context.KeyLock;

public interface IState
{
	public void insertKey();
	public void removeKey();
	public void turnKey();
	public void unlocked();
}
