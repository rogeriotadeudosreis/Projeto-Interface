
package classes;

public abstract class FiguraGeometrica {
    
    protected float raio = 0;
    
    public FiguraGeometrica (float raio){
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    
}
