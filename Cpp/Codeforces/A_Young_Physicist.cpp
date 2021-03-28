#include <iostream>
using namespace std;

int main(){
    int n;
    int x=0; int y=0; int z=0;
    cin>>n;
    while(n--){
        int xcur,ycur,zcur;
        cin>>xcur>>ycur>>zcur;
        x+=xcur;
        y+=ycur;
        z+=zcur;
    }
   if((x==0) && (y==0) && (z==0)){
       cout << "YES";
   }else{
       cout << "NO";
   }
   return 0;




}