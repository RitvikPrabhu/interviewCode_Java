package interviewCode_Java;

public class twoSum {

    public int[] two_Sum(int[] nums, int target) {

        int [] output = new int[2];
        for (int i=0; i < nums.length; i++)
        {
            for (int j=0; j < nums.length; j++)
            {
                if (i == j)
                {
                    continue;
                }
                
                if (nums[i]+nums[j] == target)
                {
                    if (i < j)
                    {
                        output[0] = i;
                        output[1] = j;
                    }
                    
                    else
                    {
                        output[0] = j;
                        output[1] = i;
                    }
                }
            }
        }
        return output;
    }
}
