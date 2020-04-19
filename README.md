# LongestPeak
- Write a function that takes in an array of integers and returns the length of the longest peak in the array.
- a peak is defined as adjacent integers in the array that area strictly increasing until they reach a highest value in the peak
- at least three number to form a peak.
- in other words it can be seen as sequences numbers is first increase then peak then last decrease
# Solution
- Replace the result by maximum as possible
- Iterate through all index and start consider tip peak form it
- the tip peak must satisfy condition as greater adjacent integers
- continue to expand the tip length if it possible satisfy condition that greater than the adjacent.
- after program ending consider a peak, compare their length with current maximum peak to get the LongestPeak
