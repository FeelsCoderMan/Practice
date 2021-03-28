#include <bits/stdc++.h>

using namespace std;


int main(){
    int n;
    scanf("%d",&n);
    int integers=0;
    double init_sum=0;
    int floored_sum=0;
    for(int i=0;i<2*n;++i){
        double x;
        scanf("%lf",&x);
        init_sum+=x;
        if(abs(x-llround(x))<=1e-9){ //integer
            integers++;
            floored_sum+=llround(x);
        }else{ //non-int
            floored_sum+=llround(floor(x));
        }
    }
    int non_int=2*n-integers;
    int min_calc=max(0,n-integers)+floored_sum;
    int max_calc=min(n,non_int)+floored_sum;
    double answer=1e15;
    //brute
    for(int i=min_calc;i<=max_calc;++i){
        answer=min(answer,abs(i-init_sum));
    }
    printf("%.3lf\n",answer);

    
    

}