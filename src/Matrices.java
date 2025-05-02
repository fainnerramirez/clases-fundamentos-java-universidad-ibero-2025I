public class Matrices {
    // función para imprimir una matrix con formato
    public static void imprimirMatrix(int[][] matrixParam) {
        for(int i = 0; i < matrixParam.length; i++){
            for(int j = 0; j < matrixParam[i].length; j++){
                System.out.print(matrixParam[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int matrix2[][] = {
                {10,15,20},
                {2,5,1},
                {60, 12, 43}
        };

        System.out.println("========== DATOS DE LA MATRIX 1 =============");

        int resultRows[][] = new int[3][3];

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix.length; j++) {
                resultRows[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        int resultColumns[][] = new int[3][3];
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix.length; j++) {
                resultColumns[i][j] = matrix[j][i] + matrix2[j][i];
            }
        }

        System.out.println("========== DATOS DE LAS SUMAS MATRIX =============");
        System.out.println("La suma de las filas es: ");
        imprimirMatrix(resultRows);
        System.out.println("La suma de las columnas es: ");
        imprimirMatrix(resultColumns);
    }
}