package j0816;

import java.util.ArrayList;
import java.util.List;

public class exam01 {

	public static void main(String[] args) {
		// 리스트 컬렉션 자동 크기 10, 크기 조절하고싶으면 ()안에다 작성
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");            //0번
		list.add("JDBC");            //1번
		list.add("Servlet/JSP");     //원래2번    ->3번으로 밀려남
		list.add(2,"Database");      //2번 재지정
		list.add("iBatis");          //4번
		
		int size = list.size();
		System.out.println("총 객체수 : " +size);
		System.out.println("-----------------");
		System.out.println("2번객체 : " +list.get(2));
		
		System.out.println("-----------------");
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(i+" : " +list.get(i));
	    }
	    System.out.println("-----------------");
	    list.remove(2);              //2번 삭제 ->3번이 2번으로 앞으로 당겨짐 (일반 배열은 뻥 뚫림)
	    list.remove(2);              //2번 삭제 ->구3번 삭제
	    list.remove("iBatis");       //iBatis삭제
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(i+ " : " +list.get(i));
	    }
	    
		
	}

}
