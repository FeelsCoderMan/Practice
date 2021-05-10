/**
 * @param {character[][]} grid
 * @return {number}
 */
 var recursionIsland=function(grid,i,j){
    if(i<0 || i>=grid.length || j<0 || j>=grid[i].length ||grid[i][j]=='0'){
        return;
    }
    grid[i][j]=0;
    recursionIsland(grid,i+1,j);
    recursionIsland(grid,i,j+1);
    recursionIsland(grid,i-1,j);
    recursionIsland(grid,i,j-1);

};

 var numIslands = function(grid) {
    let count=0;
    for(let i=0;i<grid.length;i++){
        for(let j=0;j<grid[i].length;j++){
            if(grid[i][j]=='1'){
                count++;
                recursionIsland(grid,i,j);
            }
        }
    }
    return count;
    
};
