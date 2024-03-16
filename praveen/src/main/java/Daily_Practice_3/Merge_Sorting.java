package Daily_Practice_3;

public class Merge_Sorting {
    int[] array;
    int[] tempMergeArr;
    int length;

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1);
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++; // Increment i after copying
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }

    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            divideArray(lowerIndex, middle); // Divide the left half
            divideArray(middle + 1, higherIndex); // Divide the right half
            mergeArray(lowerIndex, middle, higherIndex); // Merge the halves
        }
    }

    public static void main(String[] args) {
        int[] inputArr = {48, 36, 52, 19, 21, 48};
        Merge_Sorting mSorting = new Merge_Sorting();
        mSorting.sort(inputArr);

        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }
}
