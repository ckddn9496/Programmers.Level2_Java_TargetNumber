
public class Main {

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(new Solution().solution(numbers, target));
	}

}
class Solution {
    private int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int n, int value) {
    	// if all numbers were checked
    	if (numbers.length == n) {
    		if (target == value)
    			correct();
    		return;
    	}
    	// +
    	dfs(numbers, target, n+1, value+numbers[n]);
    	// -
    	dfs(numbers, target, n+1, value-numbers[n]);
    }
    private void correct() {
    	this.answer++;
    }
}