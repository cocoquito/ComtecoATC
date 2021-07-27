package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    //ActionLIstener -> escucha los eventos de algun boton
    private Vista view;
    private Modelo model;
    
    //constructor del Controlador
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model=model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){//inicia vista
        view.setTitle("MVC Multiplicar");//Establecer el titulo al Jframe
        view.setLocationRelativeTo(null); //para que iniciel jframe en el centro de la pantalla
    }
    
    public void actionPerformed(ActionEvent e){//recive un evento 
        model.setN1(Integer.parseInt((view.txtUno.getText())));
        model.setN2(Integer.parseInt((view.txtDos.getText())));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getN3REsultado()));
    }
}
