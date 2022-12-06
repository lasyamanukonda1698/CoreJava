package JavaClass;

import java.util.ArrayList;

public class MultiDim {
    public static void main(String[] args) {
        try {
            int[][] arr1 = new int[2][2];
            int[][] intArray = new int[3][4];
            System.out.println("Array elements are:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    intArray[i][j] = i + 1;
                    System.out.print(intArray[i][j] + " ");
                }
                System.out.println();
            }

                String[] arr2 = new String[3];
                Float[] arr3 = new Float[3];
                arr3[0] = 4.5f;
                arr3[1] = 7.9f;
                arr3[2] = 7.0f;
                arr2[0] = "lasya";
                arr2[1] = "Abhi";
                arr2[2] = "Usha";
                arr1[0][0] = 1;
                arr1[0][1] = 2;
                arr1[1][0] = 3;
                arr1[1][1] = 4;
                ArrayList<Integer> arr4 = new ArrayList<>();
                for (int k = 0; k < 5; k++) {
                    arr4.add(k);
                }
                System.out.println(arr4.toString());

                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1.length; j++) {
                        System.out.print(arr1[i][j] + " ");
                    }
                    System.out.println(" ");
                }


        }

            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
            catch(Exception e){
                System.out.println("exception caught");
            }


        }

}
