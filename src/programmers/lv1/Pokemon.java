package programmers.lv1;

import java.util.Arrays;

/** 
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * */
public class Pokemon {

    public static int solution(int[] nums) {
//    	int answer = nums.length/2;
    	int[] distArr = Arrays.stream(nums).distinct().toArray();
    	
    	
//    	System.out.println(Arrays.toString(distArr));
        
        
        return distArr.length > nums.length/2 ? nums.length/2 : distArr.length;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution(new int[] {3, 3, 3, 2, 2, 2}));
    }
}
