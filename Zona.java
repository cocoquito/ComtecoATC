package Test01POO;

import java.util.ArrayList;

public class Zona {
    private char zona;
    private String descZona;
    private int cantTech;
    private ArrayList<Tecnico> tecnico;

    public Zona(char zona, String descZona ) {
        this.zona = zona;
        this.descZona = descZona;
        this.cantTech = 3;
        this.tecnico = new ArrayList<>();
        //ctrlTecnicos();
    }
    public void tecnicosDisp(){

    }
    public void ctrlTecnicos(){
        if(tecnico.size()==0){
            System.out.println("No hay tecnicos asignados a la zona |"+ zona+"|");
        }else{
            System.out.println("Hay "+tecnico.size()+" tecnicos asignados a la zona. |"+zona+"|");
        }
    }
    public Tecnico buscarTecnicoLibre(){
        int xi=tecnico.size()-1;
        Tecnico tt=null;
        boolean vi = true;
        int res = 0;
        int i =0;
        while(xi>=0 && vi == true){
            if(tecnico.get(i).getDisponible()==true){
                //System.out.println("Tecnico : "+tecnico.get(i).getNombre()+"Zona : "+getZona()
                //        +" : "+tecnico.get(i).getApellido());
                tt=tecnico.get(i);
                vi = false;
            }else{
                res++;
            }
            xi--;
            i++;
        }
        if(res==3){
            tt= null;
        }
        return tt;
    }
    public void addTecnico(Tecnico t){
        if(tecnico.size()<3){
            if(t.isEnZona()==true){
                tecnico.add(t);
                t.setEnZona(false);
                //System.out.println("tecnico :"+t.getNombre()+" "+t.getApellido()+" añadido.");
            }else{
                System.out.println("Tecnico:"+t.getNombre()+" "+t.getApellido()+" ya se ha asignado en otra zona.");
            }

            //cambiar estado a los tecnicos.
        }else{
            System.out.println("/!\\ ERROR - Se ha llenado el cupo de tecnicos, para la Zona "+zona);
        }
    }



    public char getZona() {

        return zona;
    }

    public void setZona(char zona) {

        this.zona = zona;
    }

    public String getDescZona() {

        return descZona;
    }

    public void setDescZona(String descZona) {

        this.descZona = descZona;
    }

    public int getCantTech() {

        return cantTech;
    }

    public void setCantTech(int cantTech) {

        this.cantTech = cantTech;
    }
    public void mostrarTecnicos(){
        for (int i = 0; i <tecnico.size() ; i++) {
            System.out.println("Tecnico:"+tecnico.get(i).getNombre()+" "+tecnico.get(i).getApellido()+" "+tecnico.get(i).getDisponible());
        }
    }
}
