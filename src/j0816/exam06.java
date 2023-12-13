package j0816;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam06 extends JFrame{
	exam06(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("애완 동물");
	    
	    JRadioButton dogg = new JRadioButton("강아지");
		JRadioButton catt = new JRadioButton("고양이");
		JRadioButton goldfishh = new JRadioButton("금붕어");
		
		ButtonGroup bg = new ButtonGroup();   //라디오버튼은 그룹을 생성해야함!
		bg.add(dogg);
		bg.add(catt);
		bg.add(goldfishh);
		
		JPanel jp1=new JPanel();
		jp1.add(dogg);
		jp1.add(catt);
		jp1.add(goldfishh);
		
		JLabel jl=new JLabel();
		
	    ImageIcon dog = new ImageIcon("images/dog.png");
		ImageIcon cat = new ImageIcon("images/cat.png"); 
		ImageIcon goldfish = new ImageIcon("images/goldfish.png");
		
		Container c= getContentPane();
	    c.setLayout(new BorderLayout());
	    
	    add(jp1,BorderLayout.NORTH);
		add(jl,BorderLayout.CENTER);
		jl.setHorizontalAlignment(JLabel.CENTER);
		
		dogg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jl.setIcon(dog);
			}
			
		});
		
		catt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jl.setIcon(cat);
			}
			
		});
		
		goldfishh.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jl.setIcon(goldfish);
			}
			
		});

	    setSize(300,400);
	  	setVisible(true);
	  	
		
	}

	public static void main(String[] args) {
		// 실습02
		
		new exam06();

	}

}
