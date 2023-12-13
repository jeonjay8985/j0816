package j0816;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam04 extends JFrame{
	exam04(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 처리");
		
		Container c= getContentPane();
	    c.setLayout(new FlowLayout());

	    
	    JButton btn1=new JButton("버튼을 누르세요");
        add(btn1);
        
        
        btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//c.setBackground(Color.YELLOW);
				btn1.setText("버튼이 눌렸습니다");
			}
        	
        	
        });
	    setSize(300, 200);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		// 실습01
		
		new exam04();

	}

}
