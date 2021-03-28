#include <iostream>
#include <vector>
using namespace std;

int main(){
    string word;
    string hello="hello";
    int j=0;
    int count=0;
    cin>> word;
    bool flag=false;
    for(int i=0;i<word.size();i++){
        if(word[i]==hello[j]){
            j++;
            count++;
        }
        if(count>=5){
            cout<< "YES";
            flag=true;
            break;
        }
    }
    if(!flag){
        cout << "NO";
    }
}