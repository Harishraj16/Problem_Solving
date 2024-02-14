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
