import java.util.Scanner;

class Menu{
   Scanner leer= new Scanner(System.in);
    public static void main (String [] args){
        
        Menu menu= new Menu();
        menu.menuGeneral();
      

        public int menuGeneral(){
          int opcion;
            do{
                System.out.println("");
                System.out.println("===================================================");
                System.out.println("================= MENU DE OPCIONES ================");
                System.out.println("===== 1.SUMA DE MATRICES                       ====");
                System.out.println("===== 2.MULTIPLICACION DE MATRICES             ====");
                System.out.println("===== 3.TRANSPUESTA MATRIZ A^B                 ====");
                System.out.println("===== 4.SUMA DIAGONAL PRINCIPAL MATRIZ A^B     ====");
                System.out.println("===== 5.MAXIMO Y MINIMO MATRIZ A ^ B           ====");
                System.out.println("===== 6.COLUMNA IMPAR ^ FILAS PARES MATRIZ A^B ====");
                System.out.println("===================================================");
                System.out.print("Ingrese una opcion: ");
                opcion=leer.nextInt();

                switch(opcion){
                    case 1:
                        //SumadeMatriz();
                        break;
                    case 2:
                        //MultiplicacionMatriz();
                        break;
                    case 3:
                        //TranspuestaMatriz();
                        break;
                    case 4:
                        DiagonalPrincipalMatrices();
                        break;
                    case 5:
                        //MaximoMinimoMatriz();
                        break;
                    case 6:
                        //ColumnaImparFilaPar();
                        break;
                    case 7: System.out.println("................Saliendo del menu ..............");
                        System.exit(0);
                        break;
                    default: System.out.println("Ingrese una opcion valida.......!!");
                        break;

                }

            }while(opcion != 8);
            return 0;
        }


        public void DiagonalPrincipalMatrices(){

            int n, m, i, j;
            int A[][] = new int[10][10];
            int B[][] = new int[10][10];

            System.out.print("Ingrese dimension n: ");
            n = leer.nextInt();
            System.out.print("Ingrese dimension m: ");
            m = leer.nextInt();

            System.out.println("INGRESE VALORES MATRIZ A");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    System.out.print("A[" + (i) + "," + (j) + "]= ");
                    A[i][j] = leer.nextInt();
                }
            }

            System.out.println("INGRESE VALORES MATRIZ B");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    System.out.print("B[" + (i) + "," + (j) + "]= ");
                    B[i][j] = leer.nextInt();
                }
            }

            //IMPRIMIENDO MATRICES A Y B
            System.out.println("======== MATRIZ A =========");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    System.out.print("\t" + A[i][j]);
                }
                System.out.println();
            }

            System.out.println("====== MATRIZ B ========");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    System.out.print("\t" + B[i][j]);
                }
                System.out.println();
            }

            //IMPRIMIENDO DIAGONAL PRINCIPAL MATRIZ A  Y B
            int DA = 0,suma=0, DB = 0;
            System.out.println("===========DIAGONAL PRINCIPAL MATRIZ A  Y B =============");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    if(i==j){
                        System.out.print("\t"+A[i][j]);
                        DA=DA+A[i][j];

                    }
                }
            }
            System.out.println(" ---->> DA: "+DA);

            for (i = 1; i <= n; i++) {
                for (j = 1; j <= m; j++) {
                    if(i==j){
                        System.out.print("\t"+B[i][j]);
                        DB=DB+B[i][j];

                    }
                }
            }
            System.out.println(" ---->> DB: "+DB);

            suma=DA+DB;
            System.out.println("la suma es :"+suma);


    }
  
    }
}