import java.util.Scanner;
class vertNumPattern{
    public static void main(String[] args){
        int num=5,count=1;;
        int[][] mat=new int[num][num];
        for(int i=0;i<num ; i++){
            for(int j=i;j<num ; j++){
                mat[i][j]=count++;
            }
        }
        for(int[] arr:mat){
            for(int ele : arr){
                System.out.print(ele+"\t");
            }
            System.out.println();
        }
    }
}