package programmers;

/** 
 * https://school.programmers.co.kr/learn/courses/30/lessons/120921
 * 
 * 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
 * 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
 * A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 
 * 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * 
 * */
public class Lv0_08_StringPush {
	public static int solution(String A, String B) {
		int cnt = 0;
		int len = A.length();

		String temp = A;
		for(int i=0; i<len; i++) {
			if(temp.equals(B)) {
				return cnt;
			}
			temp = temp.substring(len-1, len) + temp.substring(0, len-1); // hell'o'
			
//			temp = A.replaceFirst(Character.toString(c), "").concat(Character.toString(c)); // i:0 'h'ello -> ello
			
			
			System.out.println(temp);
			
			cnt++;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("hello", "ohell"));
	}
}
