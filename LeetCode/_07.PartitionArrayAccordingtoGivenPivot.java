//2161. Partition Array According to Given Pivot

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int s = 0, m=0,l=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) s++;
            else if(nums[i]==pivot) m++;
            else l++;
        }
        int ans[] = new int[n];
        l=s+m;
        m=s;
        s=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) ans[s++]=nums[i];
            else if(nums[i]==pivot) ans[m++]=nums[i];
            else ans[l++] = nums[i]; 
        }
        return ans;
    }
}

//--------------------------------------------------------------------------------------------------------------------

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int index = 0;
        for(int i: nums){
            if(i<pivot){
                res[index] = i;
                index++;
            }
        }
        for(int i: nums){
            if(i==pivot){
                res[index] = i;
                index++;
            }
        }
        for(int i: nums){
            if(i>pivot){
                res[index] = i;
                index++;
            }
        }
        return res;
    }
}
