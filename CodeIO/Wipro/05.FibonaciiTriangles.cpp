#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    int first = 1,second =1;
    vector<int> val={first,second};
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<val[j]<<" ";
        }
        first = second+first;
        int temp = val.back();
        val.push_back(first);
        second = first;
        first = temp;
        cout<<endl;
    }
    return 0;
}
