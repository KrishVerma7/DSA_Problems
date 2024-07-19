### Approach :

1. first make left array having max height at current block height and its left height.
2. Then make a right array having maximum height of current block and its right block.
now make a third array, which stores the trapped water by formula: <br>
***Math.min(left[i], right[i]) - height[i]***

because water will be traped upto the min height between two blocks ( ***Math.min(left[i], right[i])*** ) , also the current index may have a block which needs to be subtracted ( ***-height[i]*** )​
