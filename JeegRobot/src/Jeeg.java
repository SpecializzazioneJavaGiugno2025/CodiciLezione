public class Jeeg {
    private Arm armSx;
    private Arm armDx;
    private Leg legSx;
    private Leg legDx;

    //Jeeg dipende sterttamente da oggetti di tipo Arm e Leg
    public Jeeg(Arm armSx, Arm armDx, Leg legSx, Leg legDx) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.legSx = legSx;
        this.legDx = legDx;
    }

    public void attackDx(){
        this.armDx.attack();
    }

    public void attackSx(){
        this.armSx.attack();
    }

    public void legDxDefence(){
        this.legDx.defence();
    }

    public void jump(){
        this.legSx.jumpForward();
    }

    public Arm getArmSx() {
        return armSx;
    }

    // public void setArmSx(Arm armSx, String password) {
    //     if(password == "12345678"){
    //         this.armSx = armSx;
    //     }
    // }

    public void setArmSx(Arm armSx) {
        this.armSx = armSx;
    }

    public Arm getArmDx() {
        return armDx;
    }

    public void setArmDx(Arm armDx) {
        this.armDx = armDx;
    }

    public Leg getLegSx() {
        return legSx;
    }

    public void setLegSx(Leg legSx) {
        this.legSx = legSx;
    }

    public Leg getLegDx() {
        return legDx;
    }

    public void setLegDx(Leg legDx) {
        this.legDx = legDx;
    }

    
}
