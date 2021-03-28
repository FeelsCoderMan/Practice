#include <iostream>
using namespace std;


int main(){
    int subwayUsage,specialUsage,ticketCost,specialCost;
    cin>>subwayUsage>>specialUsage>>ticketCost>>specialCost;
    if(specialUsage*ticketCost<=specialCost){
        cout << subwayUsage*ticketCost;
    }else{
        cout << (subwayUsage/specialUsage)*specialCost+min(subwayUsage%specialUsage*ticketCost,specialCost);
    }
    return 0;

}