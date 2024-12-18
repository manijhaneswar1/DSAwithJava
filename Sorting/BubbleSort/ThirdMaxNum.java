public class ThirdMaxNum {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(thirdMax(arr));
    }
        static int thirdMax(int[] nums) {
            int max=nums[0];
            if(nums.length<=2){
                for(int i=0;i<nums.length;i++){
                    if(nums[i]>max){
                        max=nums[i];
                    }
                }
                return max;
            }
            // first oka Temp Array create cheyi with length 3 bcz MaxThird number kavali
            int[] tempArr=new int[3];
            //Array sorted cheyi
            boolean swapped;
            for(int i=0;i<=nums.length;i++){
                swapped=false;
                for(int j=0;j<nums.length-i-1;j++){
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j+1];
                        nums[j+1]=nums[j];
                        nums[j]=temp;
                        swapped=true;
                    }
                }
                //handle if it is already sorted
                if(!swapped){
                    return nums[nums.length-3];
                }
                //Temp arr loki nums[] nunchi last three 3 digits fill cheyi
                if(tempArr[i]!=nums[i]){
                    tempArr[i]=nums[nums.length-i-1];
                }
            }
            //now lastly find list element in Temp[]
            int thirdMax=tempArr[0];
            for(int i=0;i<tempArr.length;i++){
                if(tempArr[i]<thirdMax){
                    thirdMax=tempArr[i];
                }
            }
            //return least element which is our thirdMax ;
            return thirdMax;
        }
    }

