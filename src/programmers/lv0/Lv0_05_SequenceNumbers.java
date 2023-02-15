package programmers.lv0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120924?language=java
// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
public class Lv0_05_SequenceNumbers {
	
    public static int solution(int[] common) {
        int answer = 0;
        
        int stdIdx = common.length-1;
        
		if(common[stdIdx] - common[stdIdx-1] == common[stdIdx-1] - common[stdIdx-2]) {
			answer = common[stdIdx] + (common[stdIdx] - common[stdIdx-1]); 
		}else {
			int a = common[stdIdx]-common[stdIdx-1]; 
			int b = common[stdIdx-1] - common[stdIdx-2];
			int val = a / b;
			
			answer = common[stdIdx] * val;
		}
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
//    	System.out.println(solution(new int[]{2,4,6,8,10, 12}));
    	System.out.println(solution(new int[] {2,4,8,16,32})); // 2, 4, 8
//    	System.out.println(solution(new int[] {3,9})); // 2, 4, 8
    }
	

}
