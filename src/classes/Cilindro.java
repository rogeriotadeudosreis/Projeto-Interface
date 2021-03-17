package classes;

public class Cilindro extends FiguraGeometrica implements IFiguraGeometrica{

    protected float altura = 0;

    public Cilindro(float raio, float altura) {
        super(raio);
        this.altura = altura;
    }    

    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularVolume() {
        float result = (3.1415f * raio * raio * altura);
        return result;
    }

    public String getTipoFigura() {
         return "CILINDRO";
        
    }
    public float calcularAreaTotal() {
        float result = (2 * 3.1415f * raio * raio + calcularAreaLateral());
        return result;
    }
    public float calcularAreaLateral() {
        float result = (2 * 3.1415f * raio * altura);
        return result;
    }
    public String toString(){
        String saida = "DADOS DA FIGURA GEOMÉTRICA" + "\n";
        saida += "Área lateral: " + calcularAreaLateral() + "\n";
        saida += "Área total: " + calcularAreaTotal() + "\n"; 
        saida += "Volume: " + calcularVolume() + "\n";
        saida += "Tipo de figura: " + getTipoFigura();
        
        return saida;
    }

}
