import java.util.Objects;

public class RubricaKey {
    public String cf;

    public RubricaKey(String cf) {
        this.cf = cf;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if(this == obj) return true;

    //     if(obj == null || getClass() != obj.getClass()) return false;

    //     RubricaKey r = (RubricaKey) obj;

    //     return Objects.equals(cf, r.cf);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(cf);
    // }

}
