/**
 * @param {string} s
 * @return {number}
 */
 var romanToInt = function(s) {
    var dictRoman ={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000};
    let sum=0;
    if(s.includes("IV")){
        s=s.replace("IV","IIII");
    }
    if(s.includes("IX")){
        s=s.replace("IX","VIIII");
    }
    if(s.includes("XL")){
        s=s.replace("XL","XXXX");
    }
    if(s.includes("XC")){
        s=s.replace("XC","LXXXX");
    }
    if(s.includes("CD")){
        s=s.replace("CD","CCCC");
    }
    if(s.includes("CM")){
        s=s.replace("CM","DCCCC");
    }
    s=s.split("").map(x=> sum+=dictRoman[x]);
    return sum;  

};
