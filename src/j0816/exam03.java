package j0816;

import java.util.List;
import java.util.Vector;

/*class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}*/

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board1> list = new Vector<Board1>();
		
		list.add(new Board1("제목1", "내용1", "글쓴이1"));
		list.add(new Board1("제목2", "내용2", "글쓴이2"));
		list.add(new Board1("제목3", "내용3", "글쓴이3"));
		list.add(new Board1("제목4", "내용4", "글쓴이4"));
		list.add(new Board1("제목5", "내용5", "글쓴이5"));
		
	    for(int i=0; i<list.size(); i++) {
	    	Board1 board = list.get(i);
	    	System.out.println(board.subject+ "\t" +board.content+ "\t" +board.writer); //전체출력
	    }
	    
	    list.remove(2); //제목3 제거 1(0), 2(1), 3(2), 4(3), 5(4)
	    list.remove(3); //제목5 제거 1(0), 2(1), 4(2), 5(3)
	    System.out.println("<<<<<< 제거 후 >>>>>>");
	    for(int i=0; i<list.size(); i++) {
	    	Board1 board = list.get(i);
	    	System.out.println(board.subject+ "\t" +board.content+ "\t" +board.writer); //전체출력
	    }
	}
	
	
     

}
