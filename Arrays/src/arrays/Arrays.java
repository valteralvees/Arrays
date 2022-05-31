package arrays;

import java.util.Arrays;

public class Arrays {

    public static void main(String[] args) {
        // TODO code application logic here
        double notasAlunoA[] = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        
        //Exibir todos os valores do array
        System.out.println(Arrays.toString(notasAlunoA));
        
        //Percorrendo o array
        double total = 0;
        for (int i = 0; i<notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        System.out.println(total/ notasAlunoA.length);
        
        double[] notasAlunoB = {6.9,8.9,5.5,10};
    }
    
}
