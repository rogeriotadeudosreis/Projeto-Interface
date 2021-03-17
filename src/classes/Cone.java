
package classes;

public class Cone extends Cilindro {
    
    public Cone (float raio, float altura){        
        super(raio,altura);
        
    }
    
    public String getTipoFigura() {
        
        return "CONE";
    }
    
    public float calcularGeratriz(){
        float valor = altura * altura + raio * raio;
        return (float)(Math.sqrt(valor));  
    }
    
    public float calcularVolume(){
        return (float)(1.0/3.0 * 3.1415 * raio * raio * altura);
    }
    
    public float calcularAreaLateral() {
        return (float)(3.1415 * raio * calcularGeratriz());
    }
    
    public float calcularAreaTotal(){
        return (float)(3.1415 * raio * (calcularGeratriz() + raio));
    }
    public String toString(){
        String saida = "DADOS DA FIGURA GEOMÉTRICA" + "\n";
        saida += "Geratriz: " + calcularGeratriz() + "\n";
        saida += "Área lateral: " + calcularAreaLateral()+ "\n"; 
        saida += "Área total: " + calcularAreaTotal() + "\n"; 
        saida += "Volume: " + calcularVolume() + "\n";
        saida += "Tipo de figura: " + getTipoFigura();
        
        return saida;
    }
    
}
