package leetcode;

class Solution_twosum {
	public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,6,-1,-2,-3};
    	int[] result = new int[1] ;
    	result = twoSum(arr,7);
    	for(int i=0;i<result.length;i+=2)
    	{
    		System.out.println(result[i]+" "+result[i+1]);
    	}
    }
	public static int[] twoSum(int[] nums, int target) {
        int[] result = {};
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    result = add(result,i,j);
                }    
            }
        return result;
    }
    public static int[] add(int[] array , int num1, int num2) {
        int[] arr  = new int[array.length + 2];
        for(int i=0;i<array.length ;i++)
        {
            arr[i] = array[i];
        }
        arr[array.length] = num1;
        arr[array.length+1] = num2;
        return arr;
    }
}