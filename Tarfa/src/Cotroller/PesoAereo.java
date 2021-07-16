
package Cotroller;


public class PesoAereo {
    
    private float Altura;
    private float Largo;
    private float Ancho;
    private float PBascula;
    private float PVolumetrico;
    private float Costo;
    private float Totoal;
    
    public PesoAereo(){
        this.Altura = 0.0f;
        this.Largo = 0.0f;
        this.Ancho = 0.0f;
        this.PBascula = 0.0f;
        this.PVolumetrico = 0.0f;
        this.Costo = 0.0f;
        this.Totoal = 0.0f;
        
        
    }
    //funcion de calcular el peso volumetrico
    private float PesoVolumetricoCalcular(){
        return ((getAltura()*getLargo()*getAncho())/3600);
    }
    
    public String CalcularCosto(){
        
        this.setPVolumetrico(this.PesoVolumetricoCalcular());
        
        if(this.getPBascula() > this.getPVolumetrico()){
            
          return    "| Altura: " +this.getAltura()+"\n"
                  + "| Ancho: "+this.getAncho()+"\n"
                  + "| Largo: "+this.getLargo()+"\n"
                  + "| Peso Bascula: "+this.getPBascula()+"\n"
                  + "| Total: "+this.CalcularTotal(getPBascula(),this.getCosto())+"\n"; 
        }
          return    "| Altura: " +this.getAltura()+"\n"
                  + "| Ancho: "+this.getAncho()+"\n"
                  + "| Largo: "+this.getLargo()+"\n"
                  + "| Peso Volumetricos: "+this.getPVolumetrico()+"\n" 
                  + "| Total: "+CalcularTotal(getPVolumetrico(),getCosto())+"\n";
    }
    /*funcion de calcular el total*/
    private float CalcularTotal(float Peso,float costo){
        return (costo*Peso);
    }

    /**
     * @return the Altura
     */
    public float getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the Largo
     */
    public float getLargo() {
        return Largo;
    }

    /**
     * @param Largo the Largo to set
     */
    public void setLargo(float Largo) {
        this.Largo = Largo;
    }

    /**
     * @return the Ancho
     */
    public float getAncho() {
        return Ancho;
    }

    /**
     * @param Ancho the Ancho to set
     */
    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    /**
     * @return the PBascula
     */
    public float getPBascula() {
        return PBascula;
    }

    /**
     * @param PBascula the PBascula to set
     */
    public void setPBascula(float PBascula) {
        this.PBascula = PBascula;
    }

    /**
     * @return the PVolumetrico
     */
    public float getPVolumetrico() {
        return PVolumetrico;
    }

    /**
     * @param PVolumetrico the PVolumetrico to set
     */
    public void setPVolumetrico(float PVolumetrico) {
        this.PVolumetrico = PVolumetrico;
    }

    /**
     * @return the Costo
     */
    public float getCosto() {
        return Costo;
    }

    /**
     * @param Costo the Costo to set
     */
    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    /**
     * @return the Totoal
     */
    public float getTotoal() {
        return Totoal;
    }

    /**
     * @param Totoal the Totoal to set
     */
    public void setTotoal(float Totoal) {
        this.Totoal = Totoal;
    }
    
    
    
    

  
    
}
