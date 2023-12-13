package j0816;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame frame=new Frame("GridLayout");
	
			
		frame.setLayout(new GridLayout(4, 3, 10, 3)); //행, 열 , 좌우 간격, 상하 간격
		
		for(int i=1;i<=9;i++) {
			frame.add(new Button(""+i));
		}
		frame.add(new Button("*"));
		frame.add(new Button("0"));
		frame.add(new Button("#"));
		
		
		frame.setSize(500,300);
		frame.setVisible(true);

	}

}
