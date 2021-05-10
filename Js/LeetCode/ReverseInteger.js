/**
 * @param {number} x
 * @return {number}
 */
 var reverse = function(x) {
    let limit=Math.pow(2,31);
    const sign = x>0 ? 1: -1;
    const result = Number(String(Math.abs(x)).split('').reverse().join(''));
    return result > limit ? 0 : sign*result;

};
