#include <bits/stdc++.h>

using namespace std;


int main(){
    int n;
    int res=0;
    string x;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>x;
        if(x[0]=='+' || x[x.length()-1]=='+'){
            res++;
        }else if(x[0]=='-' || x[x.length()-1]=='-'){
            res--;
        }
    }
    cout << res;
    



}