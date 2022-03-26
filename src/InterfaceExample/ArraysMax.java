package InterfaceExample;

public class ArraysMax implements ArrayInterface {

    private int[] arr;
    private String[] arr1;

    @Override
    public Integer findMaxArray() {
        Integer  max =arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    @Override
    public void findSum(Integer a, Integer b) {
        Integer sum=0;
        for (int i=a;i<=b;i++){
            sum+=i;
            System.out.println("Sum is :" +sum);
        }


    }

    @Override
    public void printWords() {
       for (int i=0;i<arr1.length;i++){
           if (arr1[i].endsWith("R")){
               System.out.println("Array Ends with "+arr1[i]);
           }
       }


    }
}