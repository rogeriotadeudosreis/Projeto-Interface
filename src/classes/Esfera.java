package classes;

public class Esfera extends FiguraGeometrica implements IFiguraGeometrica {

    public Esfera(float raio) {
        super(raio);
    }
    
    public float calcularAreaTotal() {
        float area = ((4 * 3.1415f) * (raio * raio));
        return area;
    }

    public float calcularVolume() {
        float volume = ((4 * 3.1415f) * (raio * raio * raio) / 3);
        return volume;
    }

    public String getTipoFigura() {
       
        return "ESFERA";
    }
    public String toString(){
        String saida = "DADOS DA FIGURA GEOMÉTRICA" + "\n";
        saida += "Área total: " + calcularAreaTotal() + "\n"; 
        saida += "Volume: " + calcularVolume() + "\n";
        saida += "Tipo de figura: " + getTipoFigura();
        
        return saida;
    }

}
