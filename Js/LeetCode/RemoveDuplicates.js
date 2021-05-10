/**
 * @param {number[]} nums
 * @return {number}
 */
 var removeDuplicates = function(nums) {
    let curr=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]!=nums[j]){
            nums[++curr]=nums[j];
        }
    }
    return nums.length;
    
};

