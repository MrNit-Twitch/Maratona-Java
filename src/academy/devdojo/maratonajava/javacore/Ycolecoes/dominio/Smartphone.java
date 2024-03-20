package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //Reflexivo: X.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) ==true
    //Transitividade: para x,y,z diferentes de null, se x.equal(y) == true, e x.equal(z) == true, logo, y.equals(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj; //(Cast de objeto para se tornar string)
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber) && marca != null && marca.equals(smartphone.marca);
    }

    // se x.equals(y)  == true, y.hashCode() == x.hashCode().
    // se y.hashCode() == x.hashCode(), não necessariamento o equals de y.equals(x) tem que ser true.
    // x.equals(y) == false
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser diferente.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
