package trap;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JButton;
public class game implements ActionListener 
{
	public static int rule;
	private JFrame frame;
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					game window = new game();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	game() 
	{
		initialize();
	}
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTries = new JButton("Rule 1");
		btnTries.setBounds(157, 102, 89, 23);
		frame.getContentPane().add(btnTries);
		btnTries.addActionListener(this);
		
		JButton btnTries_1 = new JButton("Rule 2");
		btnTries_1.setBounds(157, 162, 89, 23);
		frame.getContentPane().add(btnTries_1);
		btnTries_1.addActionListener(this);
		
	}
	public void actionPerformed(java.awt.event.ActionEvent e) 
	{
		String str = e.getActionCommand();
		if(str.equals("RULE 1")) 
		{
			rule = 1;
			GameFrames gamef = new GameFrames();
			gamef.getrule(1);
			gamef.setVisible(true);
			gamef.setBounds(100,100,450,300);
			frame.dispose();
		}
		else if(str.equals("RULE 2")) 
		{
			rule = 2;
			GameFrames gamef = new GameFrames();
			gamef.getrule(2);
			gamef.setVisible(true);
			gamef.setBounds(100,100,450,300);
			frame.dispose();
		}		
	}	
}
