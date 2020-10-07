/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

public class mat{
    int [][] matrix;

    mat(int [][] mat)
    {
        matrix=mat;
    }


    public static mat add(mat a,mat b)
    {
        // for(int k:a){
        //     System.out.println(i);
        // }
        for(int i=0;i<a.matrix.length;i++){
            for (int j=0;j<a.matrix.length;j++){
                a.matrix[i][j]+=b.matrix[i][j];
            }
        }
        return a;

    }
    public static mat multiply(mat a,mat b){
        // {int [][] m2=new int[r2][c2];
        int [][] M=new int[a.matrix.length][a.matrix.length];
        for(int i = 0; i < a.matrix.length; i++) {
            for (int j = 0; j < a.matrix.length; j++) {
                for (int k = 0; k < b.matrix.length; k++) {
                    M[i][j] += a.matrix[i][k] * b.matrix[k][j];
                }
            }
        }
        mat m2=new mat(M);
        return m2;
    }
    public static mat transpose(mat m)
    {
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = i; j < m.matrix.length; 
                 j++) { 
                int temp = m.matrix[j][i]; 
                m.matrix[j][i] = m.matrix[i][j]; 
                m.matrix[i][j] = temp; 
            } 
        }
        return m;
    }
    public static mat rotate(mat m){
        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = i; j < m.matrix.length; 
                 j++) { 
                int temp = m.matrix[j][i]; 
                m.matrix[j][i] = m.matrix[i][j]; 
                m.matrix[i][j] = temp; 
            } 
        }

        for (int i = 0; i < m.matrix.length; i++) {
            for (int j = 0, k = m.matrix.length - 1; 
                 j < k; j++, k--) { 
                int temp = m.matrix[j][i]; 
                m.matrix[j][i] = m.matrix[k][i]; 
                m.matrix[k][i] = temp; 
            } 
        } 
        return m;

    }
    public  void print()
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
