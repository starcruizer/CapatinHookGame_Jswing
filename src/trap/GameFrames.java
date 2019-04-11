package trap;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameFrames extends JDialog implements ActionListener 
{
	int l,count = 0,breakVal = 0;
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static void main(String[] args) 
	{
		try 
		{
			GameFrames dialog = new GameFrames();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void getrule(int k) 
	{
		l = k;
	}
	public GameFrames() 
	{
		breakVal = Bucket.trapVar();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JButton nine = new JButton("9");
			nine.setBounds(126, 171, 112, 23);
			nine.addActionListener(this); 
			contentPanel.setLayout(null);
			contentPanel.add(nine);
		}
		{
			JButton one = new JButton("1");
			one.setBounds(40, 24, 112, 23);
			contentPanel.add(one);
			one.addActionListener(this); 
			//one.setEnabled(false);
		}
		{
			JButton two = new JButton("2");
			two.setBounds(203, 24, 112, 23);
			contentPanel.add(two);
			two.addActionListener(this); 
		}
		{
			JButton three = new JButton("3");
			three.setBounds(40, 58, 112, 23);
			contentPanel.add(three);
			three.addActionListener(this); 
		}
		{
			JButton four = new JButton("4");
			four.setBounds(203, 58, 112, 23);
			contentPanel.add(four);
			four.addActionListener(this); 
		}
		{
			JButton five = new JButton("5");
			five.setBounds(40, 92, 112, 23);
			contentPanel.add(five);
			five.addActionListener(this); 
		}
		{
			JButton six = new JButton("6");
			six.setBounds(203, 92, 112, 23);
			contentPanel.add(six);
			six.addActionListener(this); 
		}
		{
			JButton seven = new JButton("7");
			seven.setBounds(40, 127, 112, 23);
			contentPanel.add(seven);
			seven.addActionListener(this); 
		}
		
		
		{
			JButton eight = new JButton("8");
			eight.setBounds(203, 127, 112, 23);
			contentPanel.add(eight);
			eight.addActionListener(this); 
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	public void actionPerformed(ActionEvent e) {
		int flag=1;
		String str=e.getActionCommand();
		count++;
		if(game.rule == 1) {
			flag = Algorithm.rule01(str,breakVal);
			if(flag == 1 && count == 5) {
				System.out.println("You Won");
				dispose();
				SuceesWindow suc = new SuceesWindow();
				suc.setVisible(true);
				suc.setBounds(100,100,450,300);				
			}	
			else if(flag == 0) {
				System.out.println("You Lost");
				dispose();
				LostWindow los = new LostWindow();
				los.setVisible(true);
				los.setBounds(100,100,450,300);
			}
		}
		if(game.rule == 2) 
		{
			flag = Algorithm.rule02(str,breakVal);
			if(flag == 1 && count <= 3) 
			{
				System.out.println("You are Amazing");
				dispose();
				AmazingWindow amw = new AmazingWindow();
				amw.setVisible(true);
				amw.setBounds(100,100,450,300);
			}	
			else if(flag == 1 && count< 5) 
			{
				System.out.println("You've Won!");
				dispose();
				SuceesWindow suc = new SuceesWindow();
				suc.setVisible(true);
				suc.setBounds(100,100,450,300);
			}
			else if(count>= 5)
			{
				System.out.println("You've Lost!");
				dispose();
				LostWindow los = new LostWindow();
				los.setVisible(true);
				los.setBounds(100,100,450,300);
			}	
		}
	}
}
