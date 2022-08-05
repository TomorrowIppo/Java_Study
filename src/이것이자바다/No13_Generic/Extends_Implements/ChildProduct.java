package 이것이자바다.No13_Generic.Extends_Implements;

public class ChildProduct<K, V, C> extends Product<K, V> {
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
