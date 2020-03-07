public class SortOfSort {
    public void SortOfSort(int[] sort){
        int begin = 0;
        int end = sort.length-1;
        int count = 0;
        boolean rightSide = true;

        while(begin != end){
            int max = begin;
            count++;

            for(int i = begin + 1; i <= end; i++){
                if(sort[i] > sort[max]){
                    max = i;
                }
            }

            if(count % 3 == 0){
                rightSide = !rightSide;
                count = 1;

            }
            System.out.print(begin + " " + end);
            System.out.println(" " + max);
            if(rightSide){
                int temp = sort[max];
                sort[max] = sort[end];
                sort[end] = temp;
                end --;
            } else{
                int temp = sort[max];
                sort[max] = sort[begin];
                sort[begin] = temp;
                begin ++;
            }

            for(int i = 0; i < sort.length;i++){
                System.out.print(sort[i] + " ");
            }
            System.out.println();
        }
    }
}
