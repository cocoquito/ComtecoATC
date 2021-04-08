package Test01POO;

public class Reclamo {
    private Cliente c;
    private String fecha;
    //Comercial o;
    private String descrip;
    private boolean estadoReclamo;
    private boolean finalizReclamo;
    private char producto;
    private String idReclamo;
    private Tecnico tech;

    public Reclamo(Cliente c, String fecha, String descrip, char producto) {
        this.c = c;
        this.fecha = fecha;//formato : dd-mm-yyyy
        this.descrip = descrip;
        this.producto = producto;
        this.estadoReclamo = false;
        this.finalizReclamo = false;
        idReclamo = "REC"+c.getContrato()+"-"+fecha.substring(0,5);
        tech = null;
    }

    public Tecnico getTech() {
        return tech;
    }

    public void setTech(Tecnico tech) {
        this.tech = tech;
    }

    public char getProducto() {
        return producto;
    }

    public void setProducto(char producto) {

        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Reclamo{" +
                "c=" + c +
                ", fecha='" + fecha + '\'' +
                ", descrip='" + descrip + '\'' +
                ", estadoReclamo=" + estadoReclamo +
                ", finalizReclamo=" + finalizReclamo +
                '}';
    }

    public Cliente getC() {

        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(boolean estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public boolean isFinalizReclamo() {
        return finalizReclamo;
    }

    public void setFinalizReclamo(boolean finalizReclamo) {
        this.finalizReclamo = finalizReclamo;
    }
}
