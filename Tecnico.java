package Test01POO;

public class Tecnico extends Trabajador{
    String cargo;
    boolean disponible;
    boolean asignadoCliente;
    Reclamo re;
    boolean enZona;

    public Tecnico(String nombre, String apellido, int cedula, String cargo) {
        super(nombre, apellido, cedula);
        this.cargo = cargo;
        disponible = true;
        asignadoCliente= false;
        re = null;
        enZona = true;
    }

    public boolean isEnZona() {
        return enZona;
    }

    public void setEnZona(boolean enZona) {
        this.enZona = enZona;
    }

    public Reclamo getReclamo(){return re;}
    public void setReclamo(Reclamo recl){re = recl;}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean getDisponible() {

        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAsignadoCliente() {
        return asignadoCliente;
    }

    public void setAsignadoCliente(boolean asignadoCliente) {
        this.asignadoCliente = asignadoCliente;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "Cargo='" + cargo +", Nombre = " +super.getNombre()+",Apellido = "+super.getApellido()
                +", Cedula = "+
                '}';
    }
}
