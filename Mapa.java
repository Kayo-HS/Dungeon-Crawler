public class Mapa {
    public void mapaMatriz(){
        int[][] mapamatriz = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1},
        };
        for(int i= 0;i < 5 ; i++){
            for(int j= 0;j < 5 ;j++){
                System.out.print(mapamatriz[i][j]);
            }
            System.out.println();
            
        }
    }
}
