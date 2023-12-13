package j0816;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Frame frame=new Frame("BorderLayout");
		
		//frame.setLayout(new BorderLayout());
	      frame.setLayout(new BorderLayout(10,2));//처음 arguement는 Horizontal(좌우)의 간격,
		                                          //두번째는 Vertical(상하)의 간격
		
		Button eastButton=new Button("East");
		Button westButton=new Button("West");
		Button southButton=new Button("South");
		Button northButton=new Button("North");
		Button centerButton=new Button("Center");
		
		 //Panel의 Component 추가    
		Panel panel=new Panel(new BorderLayout());
		Button panelSouth=new Button("Panel_South");
		Button panelNorth=new Button("Panel_North");
		Button panelCenter=new Button("Panel_Center");
		panel.add("South",panelSouth);
		panel.add("North",panelNorth);
		panel.add("Center",panelCenter);
		
		frame.add("East",eastButton);
		frame.add("West",westButton);
		frame.add("South",southButton);
		frame.add("North",northButton);
		frame.add("Center",panel);   //centerButton대신 판넬추가
		
		frame.setSize(500,300);
		frame.setVisible(true);
		
	
	}

	

}
