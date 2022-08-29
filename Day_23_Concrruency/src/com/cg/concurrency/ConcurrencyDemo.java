package com.cg.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {
	public static void main(String []args) throws ExecutionException
	{
		//lambda exp for Runnable Interface (functional interface)
		Runnable r=()->
		{
			try
			{
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("Current time:-"+LocalDateTime.now());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		ExecutorService obj=Executors.newFixedThreadPool(10);
		obj.execute(r);
		Future<String>res=obj.submit(r,"done");
		//isDone()-> if task is complete it returns true else false
		while(res.isDone()==false)
		{
			try
			{
			System.out.println("the method returns value"+res.get());
			break;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(1000L);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		obj.shutdown();
	}


}
