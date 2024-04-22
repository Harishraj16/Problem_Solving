void toBinary(int N)
{
    int ans = 0;
    int factor = 1;
    while(N!=0){
        ans += (N%2) * factor;
        factor *= 10;
        N/=2;
    }
    cout<<ans;
}
