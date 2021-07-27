
package modelo;


public class Modelo {
    private int n1, n2,n3REsultado;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3REsultado() {
        return n3REsultado;
    }

    public void setN3REsultado(int n3) {
        this.n3REsultado = n3;
    }
    public int multiplicar(){
        return this.n3REsultado = this.n1 * this.n2;
    }
}
