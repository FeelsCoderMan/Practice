#include <iostream>
#include <vector>

using namespace std;

int main(){
    int n,place,temp;
    cin >> n>>place;
    int count=0;
    vector<int> seq;
    while(n--){
        cin>>temp;
        seq.push_back(temp);
    }
    for(int i:seq){
        if(i>=seq[place-1] && i>0){
            count++;
        }
    }
    cout << count;

    return 0;




}