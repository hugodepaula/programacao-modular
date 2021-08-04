import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main( String[] args ) {
    
        Set<String> conjunto = new HashSet<String>();
        
        conjunto.add( "Bernardo" );
        conjunto.add( "Carolina" );
        conjunto.add( "Felipe" );
        conjunto.add( "Carolina" );
        conjunto.add( "Ana" );
    
        System.out.println( conjunto );
        
        Set<String> conjuntoOrdenado = 
                            new TreeSet<String>( conjunto );
        
        System.out.println( conjuntoOrdenado );
    }
}
