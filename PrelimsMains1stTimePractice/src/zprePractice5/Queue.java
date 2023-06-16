package zprePractice5;

import java.util.Iterator;

public class Queue {
	
	static int a[]=new int[5];
	static int index=0;
	static void push(int num)
	{
		if(index<a.length)
		{
		a[index++]=num;
		}
		else
		System.out.println("sdsd");
	}
	static int pop()
	{
		if(index==0)
		{
			System.out.println("Queue is empty");
			return 0;
		}
		int temp=a[0];
		for (int i = 1; i <index; i++)
		{
			a[i]=a[i+1];
		}
		index--;
		return temp;
	}
	public static void main(String[] args) 
	{
		Queue.push(10);
		Queue.push(20);
		Queue.push(30);
		Queue.push(40);
		Queue.push(50);
		/*
		 * Queue.push(60); Queue.push(70); Queue.push(80); Queue.push(90);
		 * Queue.push(100); Queue.push(110); Queue.push(120);
		 */	Queue.push(130);
//		Stack.pop();
//		Stack.pop();
//		Stack.pop();
		System.out.println(Queue.pop());
		System.out.println(Queue.pop());
		}

}
