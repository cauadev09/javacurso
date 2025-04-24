package maratonajava;

public class ArraysAula01 {

    public static void main(String[] args){

//    int[] idades = new int[3];
//    idades[0] = 21;
//    idades[1] = 15;
//    idades[2] = 17;
//
//    System.out.println(idades[1]);



//        String[] nomes = new String[3];
//
//        nomes[0] = "Maria";
//        nomes[1] = "Joao";
//        nomes[2] = "Jose";
//
//        for (int i=0; i < 3; i++){
//
//            System.out.println(nomes[i]);
//
//        }


//          String[] nomes = new String[]{"Joao", "Maria", "Glauber"};
//
//          for (String nome: nomes) {
//
//              System.out.println(nome);
//
//          }


//         String[] nomes = new String[3]; // Arrays
//
//         nomes[0] = "Cleber";
//         nomes[1] = "joao";
//         nomes[2] = "Maria";
//
//         for (int nome=0; nome < 3; nome++){
//             System.out.println(nomes[nome]);
//
//         }

// Arrays Multidimencionais

           int[][] dias = new int[3][3];

            dias[0][0] = 10;
            dias[0][1] = 20;
            dias[0][2] = 54;

        dias[1][0] = 10;
        dias[1][1] = 20;
        dias[1][2] = 54;

        dias[2][0] = 10;
        dias[2][1] = 20;
        dias[2][2] = 54;

        int resultado = 1;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
//                if (i==j){
//                    resultado = resultado * dias [i] [j];
//                }
               // System.out.println(dias[i][j]);
            }
        }


        for (int[] arrBase : dias) {
            for (int num : arrBase){
               // System.out.println(num);
            }
        }


        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[] {1, 2}; // inicia de outra forma
        arrayInt[1] = new int [3];
        arrayInt[2] = new int [6];

        int[][] arrayInts = {{0, 0}, {1, 2, 3}, {1, 2 ,3 ,4}};// outra maneira de inicialização


        for (int[] arrayBase : arrayInt){
            System.out.println("\n------");
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }



























    }


}
