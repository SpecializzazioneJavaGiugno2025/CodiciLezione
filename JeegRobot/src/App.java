public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //Upcasting -> Assegno ad una variabile di tipo padre un oggetto di tipo figlio
        //Deve esistere necessariamente un rapporto di parentela
        Arm armSx = new Drill(Side.Sx);
        Arm armDx = new Fist(Side.Dx);
        Leg legSx = new Shield();
        Leg legDx = new Shield();

        //Object composition
        Jeeg jeeg = new Jeeg(armSx, armDx, legSx, legDx);

        jeeg.attackDx();
        jeeg.attackSx();
        jeeg.legDxDefence();
        jeeg.jump();
    }
}
