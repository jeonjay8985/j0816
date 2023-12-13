package j0816;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame frame=new Frame("FlowLayout");
		
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20)); //오른쪽 정렬, 좌우 간격, 상하 간격
		
		for(int i=1;i<=10;i++) {
			frame.add(new Button("Button"+i));
		}
		
		
		
		frame.setSize(500,300);
		frame.setVisible(true);
	}

}
