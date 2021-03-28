#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
    string word;
    cin >>word;
    transform(word.begin(),word.end(),word.begin(), ::tolower);
    vector<char> chr;
    int vowelCount=0;
    for(char i:word){
        switch(i){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                break;
            default:
                chr.push_back(i);
                break;
        }
    }
    for(int i=0;i<chr.size();i++){
        cout << '.' << chr[i];
    }
    
    

    return 0;



}