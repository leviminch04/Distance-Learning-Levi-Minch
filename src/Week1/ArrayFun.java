package Week1;

public class ArrayFun {
    int[] nums;
    int[] mixedNums;
    int realSmall;
    int realBig;
    public ArrayFun(int[] nums)
    {
        this.nums = nums;
        this.mixedNums = nums;
        this.arrayMixup();

    }

    public int[] getMixedNums() {
        return mixedNums;
    }

    public int[] getNums() {
        return nums;
    }

    public void arrayMixup(){
        for(int i = 1; i < nums.length -1; i++){
            if (nums[i] % nums[i-1] == 0){
                mixedNums[i] = nums[i] / nums[i-1] * nums[i+1];
            }
            else if(nums[i] > nums[i+1]){
                mixedNums[i] = nums[i] / nums[i+1];
            }
            else{
                mixedNums[i] = nums[i];
            }
        }
    }

    public int greatestDiff()
    {

        int numsSmallest = nums[0];
        int numsBiggest = nums[0];
        int mixedSmallest = mixedNums[0];
        int mixedBiggest = mixedNums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < numsSmallest)
                numsSmallest = nums[i];
            if(nums[i] > numsBiggest)
                numsBiggest = nums[i];
        }

        for (int i = 0; i < mixedNums.length - 1; i++) {

            if(mixedNums[i] < mixedSmallest)
                mixedSmallest = mixedNums[i];
            if(mixedNums[i] > mixedBiggest)
                mixedBiggest = mixedNums[i];
        }
        if(((mixedSmallest - numsBiggest)* -1) > (numsSmallest - mixedBiggest)*1){
            return (mixedSmallest - numsBiggest)*-1;
        }
        return (mixedSmallest - mixedBiggest);
    }
}
