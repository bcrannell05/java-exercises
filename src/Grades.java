import java.util.Scanner;

public class Grades {

    public static void main(String[]args){

        {
            Scanner GradeIn = new Scanner(System.in);
            Scanner NameIn = new Scanner(System.in);
            System.out.print( "How many students are there? " );
            int[]GradeArray = new int[GradeIn.nextInt()];
            String[]nameArray = new String[GradeIn.nextInt()];

            for( int i=0 ; i<GradeArray.length ; i++ )
            {
                System.out.print( "Enter Grade for Student " + (i+1) + ": " );
                GradeArray[i] = GradeIn.nextInt();
                System.out.print( "Enter Name of Student " + (i+1) + ": " );
                nameArray[i] = NameIn.nextLine();
            }

            bubbleSort(GradeArray, nameArray);


            for( int i : GradeArray ) System.out.println( i );
            System.out.println();

        }
    }

    private static void bubbleSort(int[]GradeArray, String[] nameArray){

        int n = GradeArray.length;
        int temp = 0;
        String temp2;

        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i);j++){

                if(GradeArray[j-1]<GradeArray[j]){
                    //swap
                    temp=GradeArray[j-1];
                    GradeArray[j-1]=GradeArray[j];
                    GradeArray[j]=temp;

                    temp2=nameArray[j-1];
                    nameArray[j=1]=nameArray[j];
                    nameArray[j]=temp2;


                }
            }
        }
    }
}