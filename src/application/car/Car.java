package application.car;

public class Car {
    private String carColor;
    private String chassis;
    private boolean inMovement;
    
    public Car(String cor, String chassis){
        this.carColor = cor;
        this.chassis = chassis;
    }
    
    public void andar(boolean inMovement){
        this.inMovement = inMovement;
        
        if(inMovement){
            System.out.println("Carro em movimento");
        }
        else{
            System.out.println("Carro parado");
        }
    }
    
    public String getCarColor() {
        return carColor;
    }
    
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    
    public String getChassis() {
        return chassis;
    }
    
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    
    public boolean isInMovement() {
        return inMovement;
    }
    
    public void setInMovement(boolean inMovement) {
        this.inMovement = inMovement;
    }
}
