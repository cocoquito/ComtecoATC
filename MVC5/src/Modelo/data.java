
package Modelo;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JTextField;



public class data {
    public LinkedList<Cliente> clientes = new LinkedList<Cliente>();
    public void clientesDatos(){
        Cliente c1 = new Cliente("jorge", "ldzm", 441146, 'A', 424553, 7845, 'X', 'N');
        Cliente c2 = new Cliente("Maria", "zeballos", 45896, 'A', 424555, 7848, 'T', 'X');
        Cliente c3 = new Cliente("cesar", "cuadros", 48767, 'C', 424556, 'T', 'N', 'X');
        Cliente c4 = new Cliente("Herald", "Rojas", 45866, 'B', 424557, 7850, 'T', 'X');
        Cliente c5 = new Cliente("ines", "zeballos", 77723, 'C', 424558, 7851, 'X', 'N');
        Cliente c6 = new Cliente("gonzalo", "Rojas", 9878, 'A', 424559, 7852, 'T', 'N');
        Cliente c7 = new Cliente("Federico", "Sandoval", 8983, 'B', 42456, 7853, 'X', 'N');
        Cliente c8 = new Cliente("Diego", "Fernandez", 897765, 'A', 424561, 7854, 'X', 'N');
        clientes.add(c1);clientes.add(c2);clientes.add(c3);clientes.add(c4);clientes.add(c5);clientes.add(c6);clientes.add(c7);clientes.add(c8);
    }
    
    public Cliente RVCli (JComboBox dt, JTextField xv){
        Cliente c= null;//objeto cliente auxiliar
        int iSelec = dt.getSelectedIndex();
        
        if (iSelec == 0) {
            c = existeCliPorCI(Integer.parseInt(xv.getText().trim()));
        } else if (iSelec == 1) {
            c = existeCliPorNomCompleto(xv.getText().trim());
        } else if (iSelec == 2) {
            c = existeCliPorContrato(Integer.parseInt(xv.getText().trim()));
        } else if (iSelec == 3) {
            c = existeCliPorTelef(Integer.parseInt(xv.getText().trim()));
        } else {
            
        }
        return c;
    }
    
    public Cliente existeCliPorNomCompleto(String txtt) {//valida por nombre completo
        Cliente res = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNomCompletoCli().equalsIgnoreCase(txtt)) {
                res = clientes.get(i);
            }
        }
        return res;
    }

    public Cliente existeCliPorTelef(int f) {//valida por telefono
        Cliente res = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNoTelef() == f) {
                res = clientes.get(i);
            }
        }
        return res;
    }
   
    public Cliente existeCliPorContrato(int f) {//valida por contrato
        Cliente res = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getContrato() == f) {
                res = clientes.get(i);
            }
        }
        return res;
    }

    public Cliente existeCliPorCI(int f) {//valida por carnet
        Cliente res = null;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedulaCL() == f) {
                res = clientes.get(i);
            }
        }
        return res;
    }
    
}
