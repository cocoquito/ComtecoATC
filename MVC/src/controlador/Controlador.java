
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view=view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        model.setNumero1(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumero2(Integer.parseInt(view.txtNumero2.getText()));
        model.multiplicar();
        view.txtNumero3.setText(String.valueOf(model.getResultado()));
        
    }
}
