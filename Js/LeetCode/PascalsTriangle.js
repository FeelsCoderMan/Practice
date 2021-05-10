/**
 * @param {number} numRows
 * @return {number[][]}
 */
 var generate = function(numRows) {
    let lst=[]
    if (numRows === 0){
        return lst;
    }
    lst.push([1]);
    for(let i=1;i<numRows;i++){
        prevRow=lst[i-1];
        let row=[1];
        
        for(let j=1;j<i;j++){
            row.push(prevRow[j-1]+prevRow[j]);
        }
        row.push(1);
        lst.push(row);
    }
    return lst;
    
};

