package programmers.lv0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120831#
public class Lv0_04_EvenSum {

    public static int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<=n; i++) {
        	answer += i % 2 == 0 ? i:0;
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution(10));
    }
    
    
    
}
