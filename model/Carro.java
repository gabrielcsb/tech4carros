package model;
public class Carro {
    
   private String placa;
   private int numChassi;

   

    public Carro(String placa, int numChassi) {
    this.placa = placa;
    this.numChassi = numChassi;
}
    void acelerar(){

    }
    boolean frear(){
        return false;
    }
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        if (placa.length() == 7 && placa.matches("[A-Z]{4}\\d{4}")) {
            
        }
        this.placa = placa;
    }

    public int getNumChassi(){
        return numChassi;
    }
    public void setNumChassi(int numChassi){
        this.numChassi = numChassi;
    }
    

}
