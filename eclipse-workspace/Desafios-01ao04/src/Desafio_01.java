import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Desafio_01 {

    public static void main(String[] args) throws Exception {

System.out.println("Digite a quantidade de elementos: "); 
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(in.readLine());        
         
        int numero = Integer.parseInt(sc.nextToken());   

        System.out.println("Digite os numeros: "); 
    
        ArrayList<Integer> valor_in = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
       
        for (int i = 0; i < numero; i++) {
            
            sc = new StringTokenizer(in.readLine());
            valor_in.add(Integer.parseInt(sc.nextToken()));
                
            if (valor_in.get(i) % 2 == 0) {
                
                pares.add(valor_in.get(i));
            
            } else {
               
                impares.add(valor_in.get(i));
            
            }
         
        }
        
        Collections.sort(pares);    
        Collections.sort(impares);        

        Collections.reverse(impares);
		
        System.out.println("Resultado:");
        
		for (int par : pares) {
        
            System.out.println(par);
        
        }
        
        for (int impar : impares) {
            
            System.out.println(impar);
        
        }     
    }
}