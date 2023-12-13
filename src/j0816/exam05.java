package j0816;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class exam05 extends JFrame{
	exam05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("애완 동물");
		
		Container c= getContentPane();
	    c.setLayout(new BorderLayout());
	    
		JPanel pn=new JPanel();
		JLabel lb=new JLabel();
	    
	    JRadioButton[] radio = new JRadioButton[3];
	    
	    String[] pet = {"강아지", "고양이", "금붕어"};
	    
	    ButtonGroup bg = new ButtonGroup();
	    
	    ImageIcon[] image = {
	    new ImageIcon("images/dog.png"),
        new ImageIcon("images/cat.png"),
        new ImageIcon("images/goldfish.png")
	    };
	    
	    for(int i=0; i<radio.length; i++) {
	    	radio[i] = new JRadioButton(pet[i]);
	    	bg.add(radio[i]);
	    	pn.add(radio[i]);
	    	radio[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange()==ItemEvent.DESELECTED){
		                return;
		            }
		            if(radio[0].isSelected()){
		                lb.setIcon(image[0]);
		            }
		            else if(radio[1].isSelected()){
		                lb.setIcon(image[1]);
		            }
		            else{
		                lb.setIcon(image[2]);
					}
					
				}
	    		
	    	});

	    /*
	     ItemEvent는 말 그대로 아이템 이벤트다. 
	     체크박스나 라디오 버튼에서 선택 상태가 바뀌는 경우 이벤트가 발생(이벤트 객체)한다.
         주요 메소드는 "getStateChange()" 
         선택된 경우에는 ItemEvent.SELECTED, 아니면 ItemEvent.DESELECTED가 반환된다.
         "getItem"은 이벤트를 발생시킨 아이템 객체를 리턴한다. 
         [출처] Java - Gui 요소들.|작성자 ㄷㅁ

	     */
	
	}
	    	
		add(pn,BorderLayout.NORTH);
		add(lb,BorderLayout.CENTER);
		setSize(300,500);
		setVisible(true);	

	}

	public static void main(String[] args) {
		// 실습02
		new exam05();

	}

}
