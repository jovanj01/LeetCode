public class Main {
    public static void main(String[] args){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        Solution solution = new Solution();
        int res = solution.canCompleteCircuit(gas, cost);

        System.out.println("rez je: " + res);
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int gasSum = 0;
        int costSum = 0;

        for (int i = 0; i < gas.length; i++) {
            gasSum+=gas[i];
            costSum+=cost[i];            
        }

        if(gasSum < costSum) return -1;

        int currentGas = 0;
        int candidate = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                candidate = i + 1;
            }
        }

        return candidate;  
    }
}
