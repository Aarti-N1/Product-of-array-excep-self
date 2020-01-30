package medium;

public class ProductOfArrayExceptSelf_238 {

	//Input:  [1,2,3,4]
	//Output: [24,12,8,6]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null)
            return null;
        int[] suffixProduct = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length-1)
                suffixProduct[i] = 1;
            else{
                suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(suffixProduct[i]);
        }
        int product=1;
        int[] ans = new int[nums.length];
        ans[0]= suffixProduct[0];
        for(int i=1;i<nums.length;i++){
            product=product * nums[i-1];
            ans[i]= product* suffixProduct[i];
        }
        return ans;
    }
}
