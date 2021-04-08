package Test01POO;

public class Comercial extends Trabajador{
    String cargo;
    boolean estado;

    public Comercial(String nombre, String apellido, int cedula, String cargo) {
        super(nombre, apellido, cedula);
        this.cargo = cargo;
        estado=false;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String txt){
        cargo = txt;
    }
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean v){
        estado = v;
    }
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getApellido() {
        return super.getApellido();
    }

    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    public int getCedula() {
        return super.getCedula();
    }

    public void setCedula(int cedula) {
        super.setCedula(cedula);
    }
    public void mostrar() {
        System.out.println("{ Nombre: "+super.getNombre()+"-> Apellido: "+super.getApellido()
                +"-> Cargo: "+cargo+"-> Estado:"+estado+ " }");
    }
}
