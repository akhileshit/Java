import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3Array {
    public static void main(String[] args) throws FileNotFoundException{
    	File file = new File("D3array.txt");
        Scanner sc = new Scanner(file);
        
        // TODO: Ask user for array dimensions and create the 3D array
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][][] arr = new int[l][m][n];

        
        // TODO: Populate the array with user input
        for (int i=0; i<l; i++) {
            for (int j=0; j<m; j++) {
                for (int k=0; k<n; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3D Array:");
        for (int i=0; i<l; i++) {
            System.out.println("Layer " + (i+1) + ":");
            for (int j=0; j<m; j++) {
                for (int k=0; k<n; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        
        // TODO: Calculate and print average of each 3D column
        
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                double sum = 0.0;
                for (int k=0; k<l; k++) {
                    sum += arr[k][i][j] ;
                }
                System.out.println("Average of column (" + i + "," + j + "): " + sum/l);
            }
        }
        sc.close();
    }
}