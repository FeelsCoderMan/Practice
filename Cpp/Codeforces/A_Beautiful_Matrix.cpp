#include <bits/stdc++.h>
using namespace std;


int main(){
    int totalMovex,totalMovey;
    int temp;
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            cin>>temp;
            if(temp==1){
                totalMovex=(int) abs(2-i);
                totalMovey=(int) abs(2-j);
                break;
            }
        }
    }
    cout << totalMovex+totalMovey;
    return 0;
    
}