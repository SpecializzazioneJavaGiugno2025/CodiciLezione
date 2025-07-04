public class Fist extends Arm{

    public Fist(Side side) {
            super(side);
    }
    
    @Override
    public void attack() {
       System.out.println("Pugno perforante del braccio " + this.side);
    }

}
