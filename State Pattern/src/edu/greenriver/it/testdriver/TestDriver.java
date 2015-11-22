package edu.greenriver.it.testdriver;

import edu.greenriver.it.context.KeyLock;


public class TestDriver
{

	public static void main(String[] args)
	{
		KeyLock lock = new KeyLock();

		System.out.println(lock);
		
		//Test Lock without key
		lock.removeKey();
		lock.turnKey();
		System.out.println(lock);
		
		//Insert key
		lock.insertKey();
		
		//Open Lock
		lock.turnKey();
		System.out.println(lock);
		
		//Close Lock
		lock.turnKey();
		System.out.println(lock);
		lock.removeKey();
		System.out.println(lock);
		lock.insertKey();
		lock.turnKey();
		lock.insertKey();
		lock.turnKey();

		System.out.println(lock);
		

	}

}
