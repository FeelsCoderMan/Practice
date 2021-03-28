#include <bits/stdc++.h>

using namespace std;




int main(){
    int n;
    cin>>n;
    string res;
    string x=to_string(n);
    for(char i:x){
        if((i-'0')==4 || (i-'0')==7){
            res="YES";
        }else{
            res="NO";
            break;
        }
    }
    if((n%4==0 || n%7==0) ||(n%47==0 || n%74==0)){
        res="YES";
    }
    cout << res;
    return 0;





}