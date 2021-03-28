#include <bits/stdc++.h>

using namespace std;


int main(){
    vector<int> seq;
    int temp;
    while(cin>>temp){
        seq.push_back(temp);
    }
    sort(seq.begin(),seq.end());
    for(int i=0;i<seq.size();i++){
        if(i<seq.size()-1){
            cout << seq[i] << '+';
        }else{
            cout << seq[i];
        }
    }

}