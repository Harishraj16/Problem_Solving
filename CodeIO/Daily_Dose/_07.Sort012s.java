//time:O(N) optimal code below is also have O(N) but this takes more time than optimal code bellow;
class Solution
{
    public static void sort012(int a[], int n)
    {
        int zero = 0,one=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) zero++;
            else if(a[i]==1) one++;
        }
        for(int i=0;i<zero;i++){
            a[i]=0;
        }
        for(int i=zero;i<(zero+one);i++){
            a[i]=1;
        }
        for(int i=zero+one;i<n;i++){
            a[i]=2;
        }
    }
}

//Optimal way:
class Solution
{
    public static void sort012(int a[], int n)
    {
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp = a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            else{
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}
