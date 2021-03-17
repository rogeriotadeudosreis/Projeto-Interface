
package classes;

public class StartProjetoFigurasGeometricas {
    
    public static void imprimirObjeto(IFiguraGeometrica objeto){
        System.out.println("***** Método Imprimir Objeto *****");
        System.out.println("Figura: " + objeto.getTipoFigura());
        System.out.println("Área total: " + objeto.calcularAreaTotal());
        System.out.println("Volume: " + objeto.calcularVolume());
       // System.out.println("**********************************");        
    }
    public static void main(String[] args) {
        
        Esfera objetoEsfera = new Esfera(5);
        Cilindro objetoCilindro = new Cilindro(5, 5);
        Cone objetoCone = new Cone(3, 4);    
        
        imprimirObjeto(objetoEsfera);
        System.out.println("**********************************");
        System.out.println("\n");
        
        imprimirObjeto(objetoCone);
        System.out.println("Geratriz: " + objetoCone.calcularGeratriz());
        System.out.println("Área Lateral: " + objetoCone.calcularAreaLateral());
        System.out.println("**********************************");
        System.out.println("\n");        
        
        imprimirObjeto(objetoCilindro);
        System.out.println("Área Lateral: " + objetoCilindro.calcularAreaLateral());
        System.out.println("**********************************");
    }
    
}
