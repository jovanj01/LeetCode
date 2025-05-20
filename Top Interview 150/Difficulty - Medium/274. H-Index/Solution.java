

class Solution {
    public static void main(String[] args){
        int[] citations = {3,0,6,1,5};
        
        int res = hIndex(citations);

        System.out.println("Res je: " + res);
    }

    //radi al sporo u PM
    // public static int hIndex(int[] citations){
    //     int hIndex;
    //     int counter = 0;

    //     if(citations.length == 1 && citations[0] == 0) return 0;
    //     if(citations.length == 1 && citations[0] == 1) return 1;

    //     citations = insertionSort(citations);

    //     int i=0;

    //     while(i < citations.length && citations[i] == 0){
    //         i++;
    //     }

    //     if(i == citations.length) return 0;

    //     hIndex = citations[citations.length-1];
        


    //     while (hIndex >= 0) {
    //         for (int j = 0; j < citations.length; j++) {
    //             if(citations[j] >= hIndex){
    //                 counter++;
    //             }
    //         }

    //         if(counter >= hIndex){
    //             return hIndex;
    //         }
    //         counter = 0;
    //         hIndex--;
    //     }

    //     return hIndex;
    // }

    // public static int[] bubbleSort(int[] citations){
    //     boolean swapped = false;
    //     int n = citations.length;
    //     int temp;

    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - 1 - i; j++) {
    //             if(citations[j] > citations[j+1]){
    //                 temp = citations[j];
    //                 citations[j] = citations[j+1];
    //                 citations[j+1] = temp;
    //                 swapped = true;
    //             }
    //         }

    //         if(!swapped){
    //             break;
    //         }
    //     }

    //     return citations;
    // } 

    // public static int[] insertionSort(int[] citations){
    //     int j;
    //     int key;

    //     for (int i = 1; i < citations.length; i++) {
    //         key = citations[i];
    //         j = i - 1;
    //         while(j > -1 && citations[j] > key){
    //             citations[j+1] = citations[j];
    //             j--;
    //         }
    //         citations[j+1] = key;
    //     }        

    //     return citations;
    // } 

    public static int hIndex(int[] citations){
        int papers = citations.length;
        int[] citationPapers = new int[papers+1];

        for (int citation : citations) {
            citationPapers[Math.min(citation, papers)]++;
        }


        int sum = 0;
        for (int i = citationPapers.length-1; i >= 0; i--) {
            sum += citationPapers[i];
            if(sum >= i){
                return i;
            }
        }

        return 0; 
    }
}