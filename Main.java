package Test01POO;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;

public class Main {
    static ArrayList <Cliente> clientes;
    static LinkedList <Reclamo> listaReclamos;
    static boolean opt;
    static Cliente c;
    static ArrayList <Comercial> empATC;
    static ArrayList <Tecnico> empST;
    static LinkedList<Zona> lZonas;
    //static ArrayList<Reclamo> listaSoporte;

    public static void main (String []args){

        listaReclamos = new LinkedList<>();
        clientes = new ArrayList<Cliente>();
        //listaSoporte = new ArrayList<>();
        lZonas = new LinkedList<>();

        empATC = new ArrayList<>();
        empST= new ArrayList<>();

        Scanner read = new Scanner(System.in);
        //creando zonas
        Zona z1 = new Zona('A',"CENTRO CBA");
        Zona z2 = new Zona('B',"NORTE CBA");
        Zona z3 = new Zona('C',"SUD CBA");

        Cliente c1 = new Cliente("jorge","ldzm", 441146,'A',7845,'X','N');
        Cliente c2 = new Cliente("Maria","zeballos", 45896,'A',7848,'T','X');
        Cliente c3 = new Cliente("cesar","cuadros", 48767,'C',7849,'T','N');
        Cliente c4 = new Cliente("Herald","Rojas", 45866,'B',7850,'T','X');
        Cliente c5 = new Cliente("ines","zeballos", 77723,'C',7851,'X','N');
        Cliente c6 = new Cliente("gonzalo","Rojas", 9878,'A',7852,'T','N');
        Cliente c7 = new Cliente("Federico","Sandoval", 8983,'B',7853,'X','N');
        Cliente c8 = new Cliente("Diego","Fernandez", 897765,'A',7854,'X','N');
        clientes.add(c1);clientes.add(c2);clientes.add(c3);clientes.add(c4);clientes.add(c5);clientes.add(c6);clientes.add(c7);clientes.add(c8);
        //creando tecnicos del soporte
        Tecnico tc1 = new Tecnico("juan","lobo",5677,"soporteTECN");
        Tecnico tc2 = new Tecnico("javier","ldzm",8902,"soporteTECN");
        Tecnico tc3 = new Tecnico("olga","yañez",5678,"soporteTECN");
        Tecnico tc4 = new Tecnico("Carlos","zolo",5998,"soporteTECN");
        Tecnico tc5 = new Tecnico("Ciro","Paredes",5980,"soporteTECN");
        Tecnico tc6 = new Tecnico("Irwing","Davila",5234,"soporteTECN");
        Tecnico tc7 = new Tecnico("Carlos","caceres",7772,"soporteTECN");
        Tecnico tc8 = new Tecnico("Eneida","Flores",3459,"soporteTECN");
        Tecnico tc9 = new Tecnico("Patricia","Jimenez",5990,"soporteTECN");
        //lista de operadores de servicio Tecnico
        empST.add(tc1);empST.add(tc2);empST.add(tc3);empST.add(tc4);empST.add(tc5);empST.add(tc6);empST.add(tc7);empST.add(tc8);empST.add(tc9);
        z1.addTecnico(tc1);z1.addTecnico(tc2);z1.addTecnico(tc3);z2.addTecnico(tc6);z2.addTecnico(tc4);z2.addTecnico(tc5);z3.addTecnico(tc7);z3.addTecnico(tc8);z3.addTecnico(tc9);
        lZonas.add(z1);lZonas.add(z2);lZonas.add(z3);

        opt = true;
        int auxCI = 0;
        Tecnico aux22;
        while(opt){
            System.out.println("Ingrese una opción: ");
            System.out.println("[1] - Buscar Cliente"+"  "+"[2] Toma Reclamo/Asig. Tech."+" "+"[3] Tecnicos:"+"[4] Asignar Tecnicos"+"[5] Salir");
            int o = read.nextInt();

            switch(o){
                case 1:
                    System.out.println("ingrese el Ci del Cliente: ");
                    buscarCli ();
                    break;
                case 2://tomar reclamo
                    System.out.println("Ingrese los datos necesarios: ");
                    System.out.println("============================");
                    agregar();
                    listaReclamos.getLast().setEstadoReclamo(true);//ESTADO ATENDIDO DEL OBJ RECLAMO



                    System.out.println("el problema fue solucionado por el operador?: Si[1] No[0]");
                    int as = read.nextInt();//1

                    if(as == 1){
                        System.out.println("Reclamo finalizado¡¡");
                        listaReclamos.getLast().setFinalizReclamo(true);
                    }else {
                        System.out.println("Se pasara al soporte tecnico.\n para su atención.");

                        char aeuz = listaReclamos.getLast().getC().getZona();//A B C


                        aux22 = matchZona(aeuz).buscarTecnicoLibre();//tecnico q este libre y el objeto tecnico.
                        if (aux22 == null) {
                            System.out.println("no hay tecnico libre.");
                        } else {
                            System.out.println("Se ha asignado un tecnico al reclamo del cliente.");
                            listaReclamos.getLast().setTech(aux22);//añadido al reclamo un tecnico
                            aux22.setDisponible(false);//cambia es estado del tecnico a no disponible para atender a mas clientes.
                        }
                    }
                    //System.out.println();
                    break;
                case 3://asignar reclamo al tecnico segun zona
                    System.out.println("Tecnicos disponibles.");
                    System.out.println("====================");

                    System.out.println("Zona A:");
                    System.out.println("========");
                    z1.buscarTecnicoLibre();
                    System.out.println("---------------");
                    z1.mostrarTecnicos();
                    /*System.out.println("Zona B:");
                    System.out.println("========");
                    z2.mostrarTecnicos();
                    System.out.println("Zona C:");
                    System.out.println("========");
                    z3.mostrarTecnicos();*/

                    break;


                case 4://generar reportes clistando los clientes, reclamos, tecnicos, zonas.

                case 5:
                    System.out.println("Ha decido Salir.");
                    opt=false;
                    break;
                default:
                    System.out.println("Aqui se acaba todo.");
                    break;
            }
        }



        //creando operadores del ATC
        Comercial op1 = new Comercial("jorge","ldzm",4512,"operadorATC");
        Comercial op2 = new Comercial("julia","lopez",4896,"operadorATC");
        Trabajador op3 = new Comercial("jose", "vargas",44114,"operadorATC");


        //controla la asignacion de los tecnicos a las zonas.
        /*z1.ctrlTecnicos();
        z2.ctrlTecnicos();
        z3.ctrlTecnicos();*/

        //lista de operadores de ATC
        /*empATC.add(op1);
        empATC.add(op2);
        empATC.add(op3);*/



        /*z1.ctrlTecnicos();
        z2.ctrlTecnicos();
        z3.ctrlTecnicos();*/

    }
    static public Zona matchZona(char a){
        Zona auz=null;
        //char aeuz = listaReclamos.getLast().getC().getZona();
        int ctrl = lZonas.size()-1;
        int ii =0;
        boolean lop = true;
        while(ctrl>=0 && lop){

            if(a == lZonas.get(ii).getZona()){
                auz= lZonas.get(ii);
                lop = false;
            }
            ii++;
            ctrl--;
        }

        return auz;
    }

    static public void agregar(){
        Scanner read = new Scanner(System.in);
        Reclamo nt;
        String fe,de;char se;
        int idcli;
        System.out.println("Fecha: (dd-mm-yyyy)");
        fe=read.next();

        System.out.println("Cliente - Ingrese la cedula : ");

        idcli= read.nextInt();
        c= existeCli(idcli);
        if(c==null){
            System.out.println("No existe cliente ¡¡");
        }else{
            read.nextLine();
            System.out.println("Descripción : ");
            de=read.nextLine();
            System.out.print("\n");
            System.out.println("Servicio: ");
            se=read.next().charAt(0);
            nt = new Reclamo(c,fe,de,se);
            listaReclamos.add(nt);
        }


    }
    static void buscarCli (){
        Scanner read = new Scanner(System.in);
        int auxCI=read.nextInt();
        int i =0;
        int hg= clientes.size()-1;
        String Res="";
        while(hg>=0){
            if(clientes.get(i).getCedulaCL()==auxCI){
                Res = "Cedula encontrada : "+clientes.get(i).getName()
                        +" "+clientes.get(i).getLastName()+"."
                        +"/n Codigo Cliente : "+clientes.get(i).getCodCliente();
            }
            i++;
            hg--;
        }
        if(Res.length()>2){
            System.out.println(Res);
        }else{
            System.out.println("Sin resultados.");
        }
        System.out.println("Fin de la busqueda.");
        /*for (int i = 0; i <clientes.size() ; i++) {
            if(clientes.get(i).getCedulaCL()==auxCI){
                System.out.println("Cedula encontrada : "+clientes.get(i).getName()
                        +" "+clientes.get(i).getLastName()+".");
                System.out.println("Codigo Cliente : "+clientes.get(i).getCodCliente());
            }else{
                System.out.println("Cliente no encontrado.");
            }
        }*/
    }
    static Cliente existeCli(int f){//valida por carnet
        //Scanner read = new Scanner(System.in);
        Cliente res= null;
        //int auxCI=read.nextInt();
        for (int i = 0; i <clientes.size() ; i++) {
            if (clientes.get(i).getCedulaCL() == f) {
                res = clientes.get(i);
            }
        }
        return res;
    }
}
