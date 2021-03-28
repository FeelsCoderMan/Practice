#include <bits/stdc++.h>

using namespace std;

int main(){
    string n,m;
    cin>>n>>m;
    for(auto &temp: n){
        temp=tolower(temp);
    }
    for(auto &temp: m){
        temp=tolower(temp);
    }
    bool flag=false;
    for(int i=0;i<n.length();++i){
        if(n[i]>m[i]){
            cout << 1;
            flag=true;
            break;
        }else if(n[i]<m[i]){
            cout << -1;
            flag=true;
            break;
        }
    }
    if(!flag){
        cout << 0;
    }
    return 0;




}