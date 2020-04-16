package Week1;

public class ArrayFun {
    int[] nums;
    int[] mixedNums;
    int realSmall;
    int realBig;
    public ArrayFun(int[] nums)
    {
        this.nums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = nums[i];
        }



        this.mixedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            mixedNums[i] = nums[i];
        }

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

    public int greatestDiff(){
        int answer;
        int biggestNum = nums[0];
        int smallestNum = nums[0];
        int biggestMix = nums[0];
        int smallestMix = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > biggestNum){
                biggestNum = nums[i];
            }
            if(nums[i] < smallestNum){
                smallestNum = nums[i];
            }
            if(mixedNums[i] > biggestMix){
                biggestMix = mixedNums[i];
            }
            if(mixedNums[i] < smallestMix){
                smallestMix = mixedNums[i];
            }
        }
        if((smallestMix - biggestNum) * -1 > (smallestNum - biggestMix) * -1){
            answer = (smallestMix - biggestNum) * -1;
        }
        else{
            answer = (smallestNum - biggestMix) * -1;
        }
        return answer;
    }


}

