package j0816;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame frame=new Frame("CardLayout");
					
		Panel card1=new Panel();
		card1.setBackground(Color.DARK_GRAY);
		card1.add(new Label("Card 1"));
			
		Panel card2=new Panel();
		card2.setBackground(Color.ORANGE);
		card2.add(new Label("Card 2"));
			
		CardLayout layout=new CardLayout();
		frame.setLayout(layout);
			
			//card1의 이름은 "card1" 
		frame.add(card1, "card1");
	    	//card2의 이름은 "card2"
		frame.add(card2, "card2");
			
		layout.show(frame, "card1");
		
		
		frame.setSize(500,300);
		frame.setVisible(true);
		
	    //5초 대기
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//5초 후 frame에 추가한 다음 card를 보여줌
		layout.next(frame);

	}

}
