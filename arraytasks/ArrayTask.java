package arraytasks;

public class ArrayTask {

    private int[] nums = new int[10];
    private int size = 4;

    public ArrayTask(){
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
    }

    // Insert at position
    public void insertValue(int position, int element){

        for(int i = size; i >= position; i--){
            nums[i] = nums[i-1];
        }

        nums[position-1] = element;
        size++;

        printArray();
    }

    // Add at end
    public void addElement(int element){

        nums[size] = element;
        size++;

        printArray();
    }

    // Delete element
    public void deleteValue(int position){

        for(int i = position-1; i < size-1; i++){
            nums[i] = nums[i+1];
        }

        size--;

        printArray();
    }

    // Rotation (Left or Right)
    public void rotate(int type, int k){

        for(int r = 0; r < k; r++){

            if(type == 1){ // Left rotation

                int first = nums[0];

                for(int i = 0; i < size-1; i++){
                    nums[i] = nums[i+1];
                }

                nums[size-1] = first;

            } else if(type == 2){ // Right rotation

                int last = nums[size-1];

                for(int i = size-1; i > 0; i--){
                    nums[i] = nums[i-1];
                }

                nums[0] = last;
            }
        }

        printArray();
    }

    // Print array
    public void printArray(){

        System.out.println("Array elements:");

        for(int i = 0; i < size; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}