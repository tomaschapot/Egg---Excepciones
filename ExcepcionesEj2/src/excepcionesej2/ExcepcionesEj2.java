package excepcionesej2;

public class ExcepcionesEj2 {

    public static void main(String[] args) {
        
        
        Integer[] lista = new Integer[3];
        
        try{
            lista[0] = 20;
            lista[1] = 5;
            lista [2] = 10;
            lista[3] = 25;
            lista[4] = 0;
            
            
        }catch(ArrayIndexOutOfBoundsException e){
            
            System.out.println("Error, el array no tiene ese tamanio");
            
        }
        
        for(Integer a : lista){
            
            System.out.println(a);
        }
        
        
    }
    
}

