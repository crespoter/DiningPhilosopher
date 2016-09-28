package diningPhilosopher;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainPhils {
	
	
	static class Monitor
	{
		int status[];
		void pickup(int i)
		{
			if(status[i]==2)return;
			status[i]=1;
			test(i);
			System.out.println("HERERERERERRE"+i);
		}
		void test(int i)
		{
			if(status[(i+4)%5]!=2 && status[(i+1)%5]!=2 && status[i]==1)
			{
				status[i]=2;
			}
		}
		void putdown(int i)
		{
			status[i]=0;
			System.out.println("Pick up "  +  i);
			test((i+4)%5);
			test((i+1)%5);
		}
		Monitor(){
			status=new int[5];
			System.out.println("HERERE");
			for(int i=0;i<5;i++)
			{
				status[i]=0;
			}
		}
	}
	public static void main(String args[])
	{

		Monitor d = new Monitor();
		
		
		JFrame frame = new JFrame("Test");
		  frame.setVisible(true);
		  frame.setSize(1920,1080);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  JPanel panel = new JPanel();
		  frame.add(panel);
		  
		  JButton button3=new JButton("Philosopher #3");
		  JButton button5 = new JButton("Philosopher #5");
		  JButton button2 = new JButton("Philosopher #2");
		  
		  
		  JButton button4 = new JButton("Philosopher #4");
		   
		  
		  
		  JButton button1 = new JButton("Philosopher #1");
		  panel.add(button1);
		  panel.add(button2);
		  panel.add(button3);
		  panel.add(button4);
		  panel.add(button5);
		  
		  
		  
		  button1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(d.status[0]==2)
					{
						d.putdown(0);
					}
					else
					{
						d.pickup(0);
					}
					if(d.status[0]==0)
					{
						button1.setBackground(Color.green);
					}
					else if(d.status[0]==1)
					{
						button1.setBackground(Color.orange);
					}
					else if(d.status[0]==2)
					{
						button1.setBackground(Color.red);
					}
					
					
					if(d.status[1]==0)
					{
						button2.setBackground(Color.green);
					}
					else if(d.status[1]==1)
					{
						button2.setBackground(Color.orange);
					}
					else if(d.status[1]==2)
					{
						button2.setBackground(Color.red);
					}
					
					
					if(d.status[2]==0)
					{
						button3.setBackground(Color.green);
					}
					else if(d.status[2]==1)
					{
						button3.setBackground(Color.orange);
					}
					else if(d.status[2]==2)
					{
						button3.setBackground(Color.red);
					}
					
					
					
					if(d.status[3]==0)
					{
						button4.setBackground(Color.green);
					}
					else if(d.status[3]==1)
					{
						button4.setBackground(Color.orange);
					}
					else if(d.status[3]==2)
					{
						button4.setBackground(Color.red);
					}
					
					if(d.status[4]==0)
					{
						button5.setBackground(Color.green);
					}
					else if(d.status[4]==1)
					{
						button5.setBackground(Color.orange);
					}
					else if(d.status[4]==2)
					{
						button5.setBackground(Color.red);
					}
				}
			});
		  
		  

		  
		   
		  button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				
					
					if(d.status[1]==2)
					{
						d.putdown(1);
					}
					else
					{
						d.pickup(1);
					}
						if(d.status[0]==0)
						{
							button1.setBackground(Color.green);
						}
						else if(d.status[0]==1)
						{
							button1.setBackground(Color.orange);
						}
						else if(d.status[0]==2)
						{
							button1.setBackground(Color.red);
						}
						
						
						if(d.status[1]==0)
						{
							button2.setBackground(Color.green);
						}
						else if(d.status[1]==1)
						{
							button2.setBackground(Color.orange);
						}
						else if(d.status[1]==2)
						{
							button2.setBackground(Color.red);
						}
						
						
						if(d.status[2]==0)
						{
							button3.setBackground(Color.green);
						}
						else if(d.status[2]==1)
						{
							button3.setBackground(Color.orange);
						}
						else if(d.status[2]==2)
						{
							button3.setBackground(Color.red);
						}
						
						
						
						if(d.status[3]==0)
						{
							button4.setBackground(Color.green);
						}
						else if(d.status[3]==1)
						{
							button4.setBackground(Color.orange);
						}
						else if(d.status[3]==2)
						{
							button4.setBackground(Color.red);
						}
						
						if(d.status[4]==0)
						{
							button5.setBackground(Color.green);
						}
						else if(d.status[4]==1)
						{
							button5.setBackground(Color.orange);
						}
						else if(d.status[4]==2)
						{
							button5.setBackground(Color.red);
						}
					
				}
			});
		 
		  
		  
		   
		  button3.addMouseListener(new MouseAdapter() 
		  {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(d.status[2]==2)
					{
						d.putdown(2);
					}
					else
					{
						d.pickup(2);
					}
					if(d.status[0]==0)
					{
						button1.setBackground(Color.green);
					}
					else if(d.status[0]==1)
					{
						button1.setBackground(Color.orange);
					}
					else if(d.status[0]==2)
					{
						button1.setBackground(Color.red);
					}
					
					
					if(d.status[1]==0)
					{
						button2.setBackground(Color.green);
					}
					else if(d.status[1]==1)
					{
						button2.setBackground(Color.orange);
					}
					else if(d.status[1]==2)
					{
						button2.setBackground(Color.red);
					}
					
					
					if(d.status[2]==0)
					{
						button3.setBackground(Color.green);
					}
					else if(d.status[2]==1)
					{
						button3.setBackground(Color.orange);
					}
					else if(d.status[2]==2)
					{
						button3.setBackground(Color.red);
					}
					
					
					
					if(d.status[3]==0)
					{
						button4.setBackground(Color.green);
					}
					else if(d.status[3]==1)
					{
						button4.setBackground(Color.orange);
					}
					else if(d.status[3]==2)
					{
						button4.setBackground(Color.red);
					}
					
					if(d.status[4]==0)
					{
						button5.setBackground(Color.green);
					}
					else if(d.status[4]==1)
					{
						button5.setBackground(Color.orange);
					}
					else if(d.status[4]==2)
					{
						button5.setBackground(Color.red);
					}
				}
			});
		 
		  
		  
		  
		  button4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(d.status[3]==2)
					{
						d.putdown(3);
					}
					else
					{
						d.pickup(3);
					}
					if(d.status[0]==0)
					{
						button1.setBackground(Color.green);
					}
					else if(d.status[0]==1)
					{
						button1.setBackground(Color.orange);
					}
					else if(d.status[0]==2)
					{
						button1.setBackground(Color.red);
					}
					
					
					if(d.status[1]==0)
					{
						button2.setBackground(Color.green);
					}
					else if(d.status[1]==1)
					{
						button2.setBackground(Color.orange);
					}
					else if(d.status[1]==2)
					{
						button2.setBackground(Color.red);
					}
					
					
					if(d.status[2]==0)
					{
						button3.setBackground(Color.green);
					}
					else if(d.status[2]==1)
					{
						button3.setBackground(Color.orange);
					}
					else if(d.status[2]==2)
					{
						button3.setBackground(Color.red);
					}
					
					
					
					if(d.status[3]==0)
					{
						button4.setBackground(Color.green);
					}
					else if(d.status[3]==1)
					{
						button4.setBackground(Color.orange);
					}
					else if(d.status[3]==2)
					{
						button4.setBackground(Color.red);
					}
					
					if(d.status[4]==0)
					{
						button5.setBackground(Color.green);
					}
					else if(d.status[4]==1)
					{
						button5.setBackground(Color.orange);
					}
					else if(d.status[4]==2)
					{
						button5.setBackground(Color.red);
					}
				}
			});		  
		  
		  
		
		  button5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(d.status[4]==2)
					{
						d.putdown(4);
					}
					else
					{
						d.pickup(4);
					}
					if(d.status[0]==0)
					{
						button1.setBackground(Color.green);
					}
					else if(d.status[0]==1)
					{
						button1.setBackground(Color.orange);
					}
					else if(d.status[0]==2)
					{
						button1.setBackground(Color.red);
					}
					
					
					if(d.status[1]==0)
					{
						button2.setBackground(Color.green);
					}
					else if(d.status[1]==1)
					{
						button2.setBackground(Color.orange);
					}
					else if(d.status[1]==2)
					{
						button2.setBackground(Color.red);
					}
					
					
					if(d.status[2]==0)
					{
						button3.setBackground(Color.green);
					}
					else if(d.status[2]==1)
					{
						button3.setBackground(Color.orange);
					}
					else if(d.status[2]==2)
					{
						button3.setBackground(Color.red);
					}
					
					
					
					if(d.status[3]==0)
					{
						button4.setBackground(Color.green);
					}
					else if(d.status[3]==1)
					{
						button4.setBackground(Color.orange);
					}
					else if(d.status[3]==2)
					{
						button4.setBackground(Color.red);
					}
					
					if(d.status[4]==0)
					{
						button5.setBackground(Color.green);
					}
					else if(d.status[4]==1)
					{
						button5.setBackground(Color.orange);
					}
					else if(d.status[4]==2)
					{
						button5.setBackground(Color.red);
					}
				}
			});
		  
		  
		  button1.setBackground(Color.green);
		  button2.setBackground(Color.green);
		  button3.setBackground(Color.green);
		  button4.setBackground(Color.green);
		  button5.setBackground(Color.green);
		  
		  
		  //NON GUI AREA UNCOMMENT FOR SAFE MODE
		  /*
		
		System.out.println("Number of pickups");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		for(int i=0;i<n;i++){
			int x=reader.nextInt();
			d.pickup(x);
		}
		System.out.println("Number of drops");
		n=reader.nextInt();
		for(int i=0;i<n;i++){
			int x=reader.nextInt();
			d.pickup(x);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(d.status[i]);
		}
		*/
	}
	
}
