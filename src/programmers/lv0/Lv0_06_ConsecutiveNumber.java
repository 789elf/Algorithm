package programmers.lv0;

import java.util.Arrays;

/**
 *
 *	https://school.programmers.co.kr/learn/courses/30/lessons/120923
 *
 *  연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 
 *  연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 * 
 * */
public class Lv0_06_ConsecutiveNumber {
   public static int[] solution(int num, int total) {
	   int[] answer = new int[num];
	   
	   int startNum = 0;
	   int middleNum = total / num;
	   boolean even = num % 2 == 0 ? true : false;
	   
	   if(even) {
		   startNum = middleNum - (num / 2) + 1;
	   }else {
		   startNum = middleNum - (num /2);	 
	   }
	   
	   for(int i=0; i<num; i++) {
		   answer[i] = startNum++;
	   }
	   
	   return answer;
    }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, 5)));
	}
}
