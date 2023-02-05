package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java


public class Lv0_01_Babbling {
	
    public static int solution(String[] strArr) {
        int answer = 0;
        String[] pass = new String[] { "aya", "ye", "woo", "ma"};
        
        for(int i=0; i<strArr.length; i++) {
        	for(int j=0; j<pass.length; j++) {
        		strArr[i] = strArr[i].replaceFirst(pass[j], "*");
        		strArr[i] = strArr[i].replace("*", "");
        	}
        	
        	if(strArr[i].isEmpty()) {
        		answer++;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		 String[] babbling = new String[] { "ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		 
		 System.out.println(solution(babbling));
	}

}
