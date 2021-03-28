#include <iostream>

using namespace std;

int main(){
    unsigned long long x,y,k;
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        cin>>x>>y>>k;
        unsigned long long totalStick=k*(1+y);
        unsigned long long totalCount=(totalStick-1+x-2)/(x-1)+k;
        cout << totalCount << '\n';
        

    }
    return 0;
}