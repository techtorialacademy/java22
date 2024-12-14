package StudySessions;

public class ArrayHomeworkTask8 {
    public static void main(String[] args) {
        // Find the first unique value from the array
        // {1, 1, 2, 2, 3, 4, 4 }
     int[] nums = {1, 1, 2, 2, 3,5,5,7,3,7,8,9,4, 4 };
     boolean isUnique = true;
     String ICheckedThisValueBefore = "";
        for (int i = 0; i < nums.length ; i++) {
            // nums[i] rest of the array is nums[i+1]
            isUnique = true;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] || ICheckedThisValueBefore.contains(nums[i]+"")){
                    // I know that I should not display the value nums[i] as it is not unique
                    isUnique = false;
                    ICheckedThisValueBefore = ICheckedThisValueBefore + nums[i] + ",";
                    break;
                }
            }
            if(isUnique){
                System.out.println(nums[i]);
                break;
            }

        }

    }
}
