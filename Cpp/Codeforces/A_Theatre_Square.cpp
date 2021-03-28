#include <iostream>
#include <math.h>
using namespace std;


int main(){
    int x=0;
    int ylast=0;
    int xlast=0;
    unsigned long long count=0;
    int n,m,k;
    cin>>n>>m>>k;
    while (ylast<m){
        //cout << xlast  << ' '<<ylast  <<endl;
        count+=(unsigned long long) ceil((double)n/k);
        //cout<<count << ' ' <<'\n';
        ylast+=k;
        //cout << xlast  << ' '<<ylast  <<endl;
        x=0;
    }
    
    cout << count;
}

