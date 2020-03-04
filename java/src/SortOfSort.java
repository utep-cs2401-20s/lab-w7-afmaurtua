public class SortOfSort {
    public void SortOfSort(int[] sort){
        int count = 0;
        int max = 0;// index
        for(int j = 0; j< sort.length; j++){ //looking for the largest number
            for(int i = 1; i< sort.length-j; i++){ //sorting throught the array
                if (sort[i] > sort[max]){ // keeping track of where it's already been sorted
                    max = i;
                }
            }
            if(count < 2){ //Actually sorting out the numbers
                int temp = sort[max];
                sort[max] = sort[(sort.length -1)-j];
                sort[(sort.length-1)-j] = temp;
                count ++;
            }
            else{
                int temp = sort[max];
                sort[max] = sort[j-2];
                sort[j-2] = temp;
                count ++;
                if(count == 4){
                    count = 0;
                }
            }
            max = 1;
        }
    }
}
