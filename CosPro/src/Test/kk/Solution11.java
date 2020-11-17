package Test.kk;

import java.util.Arrays;

public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] shirtsize = {"XS","S","L","L","XL","S"};
		
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(shirtsize)));
				
	}
	public int[] solution(String[] shirtsize) {
		String[] standard = {"XS","S","M","L","XL","XXL"};
		int[] result = new int[6];
		
		for(int i = 0;i < standard.length;i++) {
			if(shirtsize[i].equals("XS")) {
				result[0] = result[0]+1;
			}
			else if(shirtsize[i].equals("S")) {
				result[1] = result[1]+1;
			}
			else if(shirtsize[i].equals("M")) {
				result[2] = result[2]+1;
			}
			else if(shirtsize[i].equals("L")) {
				result[3] = result[3]+1;
			}
			else if(shirtsize[i].equals("XL")) {
				result[4] = result[4]+1;
			}
			else if(shirtsize[i].equals("XXL")) {
				result[5] = result[5]+1;
			}
			else {
				System.out.println("오류");
			}
		
		}
		return result;
	}
}
