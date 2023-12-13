package j0816;

import java.util.Arrays;
import java.util.List;

public class exam02 {

	public static void main(String[] args) {
		// 리스트 컬렉션 - Arrays.asList(T... a)메소드 사용
		
		List<String> list1 = Arrays.asList("홍길동", "이순신", "김자바");
        
		//for-each문
		for(String name: list1) {
		   System.out.println(name);	
		}
		
		//일반 for문으로 변경
		for(int i=0; i<list1.size(); i++) {
		 System.out.println(list1.get(i)); }
		
	   }
	{
	    List<Integer> list2 = Arrays.asList(1, 2, 3);
	    for(int value: list2) {
		  System.out.println(value);
	}
  }
}
