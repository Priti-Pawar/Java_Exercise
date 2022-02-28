package Core_Java_Exercise;

public class Exercise16 { 
	public boolean noTriples(int[] nums) {

			for(int i = 0; i < nums.length-2; i++){
			if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
			return false;
			}
			}
			return true;
		}
	
	}


			
	
