package programmers.lv0;

/**
 *  https://school.programmers.co.kr/learn/courses/30/lessons/120913?language=java
 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *  
 * */

public class Lv0_09_SplitArray {

    public static String[] solution(String my_str, int n) {
    	int length = my_str.length();	// 문자열길이
    	int remainder = length % n;		// 문자열길이 % 매개변수n
    	int size = remainder == 0 ? length / n : length / n + 1;	
    	
        String[] answer = new String[size];
        
        for(int i=0; i<size; i++) {
        	if(i == size-1 && remainder != 0) {
        		answer[i] = my_str.substring(i*n);
        		break;
        	}
        	answer[i] = my_str.substring(i*n, i*n+n);
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution("abc1Addfggg4556b", 6));
    }
}
