#include <iostream>
using namespace std;
int f();

int main(){
    int query;
    int count=0;
    cin >> query;
    for(int i=0;i<query;i++){
        count+=f();
    }
    cout << count;
    return 0;

}


int f(){
    int a,b,c;
    cin>>a>>b>>c;
    return (a+b+c>=2) ? 1 : 0;
}