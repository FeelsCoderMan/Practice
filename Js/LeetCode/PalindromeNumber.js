/**
 * @param {number} x
 * @return {boolean}
 */
 var isPalindrome = function(x) {
    let xString=String(x); 
    if(x>0 || xString.length==1){
        return false;
    }
    for(let i=0;i<=Number(xString.length/2)-1;i++){
        if(xString[i]!=xString[xString.length-1-i]){
            return false;
        }
    }
    return true;
};
