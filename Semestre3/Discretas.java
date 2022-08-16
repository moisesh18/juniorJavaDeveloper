package Semestre3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ButtonGroup;
import java.text.DecimalFormat;
public class Discretas extends JFrame implements ActionListener{
    private JPanel panel;
    private static JTextArea consola = new JTextArea(25,55);
    private JRadioButton [] radios = new JRadioButton[6];
    JTextField input = new JTextField(15);
    JButton boton = new JButton("Calcular");
    public static DecimalFormat decimales = new DecimalFormat("0.0");
    
    public static void main (String [] args){
        Discretas frame = new Discretas();
        frame.setSize(780,718);
        frame.crearGUI();
        frame.setVisible(true);
    }

    public void crearGUI(){ //interfaz grafica
        this.setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane ();
        window.setLayout(new FlowLayout());

        //fonts
        Font titulo = new Font("Tahoma", Font.BOLD,40);  
        Font pconsola =new Font("Dialog", Font.BOLD, 15);
        consola.setFont(pconsola);
        JLabel inicio = new JLabel ("            Portafolio de Matematicas Discretas            "); 
        inicio.setFont(titulo);
        window.add(inicio);

        ButtonGroup grupo1 = new ButtonGroup(); 

        //consola
        consola.setEditable(false);
        consola.setLineWrap(true);
        consola.setWrapStyleWord(true);

        //radiobuttons
        for(int fila = 0 ; fila<radios.length; fila++ ){
            radios[fila] = new JRadioButton();
            radios[fila].addActionListener(this);
            window.add(radios[fila]);
            grupo1.add(radios[fila]);
        }
        radios[0].setText("Tabla de Verdad");
        radios[1].setText("Compresion de Huffman");
        radios[2].setText("Integracion de Romberg");
        radios[3].setText("Metodo de los trapecios");
        radios[4].setText("Metodo Gauss-Jordan");
        radios[5].setText("Multiplicacion de Matrices");

        panel = new JPanel ();
        window.add(panel);
        window.add(input);
        boton.addActionListener(this);
        window.add(boton);
        consola.append( "Hola, yo soy la consola." );
        panel.add(consola);
    }

    public void actionPerformed (ActionEvent event)
    {
        if (event.getSource().equals(boton)){
            if(radios[0].isSelected()==true){
                Verdad.main(input.getText());
            }
            if(radios[1].isSelected()==true){
                Huffman.main(input.getText());
            }
            if(radios[2].isSelected()==true){
                //Romberg.main(Integer.parseInt(input.getText()));
                consola.append('\n' + '\n' + " El resultado de la integración de Romberg con n= "+input.getText() + " es "+Romberg.main(Integer.parseInt(input.getText())));;
            }
            if(radios[3].isSelected()==true){
                double r = Trapecios.main(Float.parseFloat(input.getText()));
            consola.append(""+'\n');
                consola.append('\n' + '\n' +" El resultado del metodo de los trapecios con n= "+input.getText() + " es "+String.valueOf(r));
            }
            if(radios[4].isSelected()==true){
                double [][] m = new double [3][3];
                double [] n = new double [3];
                consola.append('\n' +"");
                for (int i=0;i<m.length;i++){
                    int h = i+1;
                    for (int j=0;j<n.length;j++){
                        char x = 0;
                        if(j==0){
                            x = 'x';
                        }
                        if(j==1){
                            x = 'y';
                        }
                        if(j==2){
                            x = 'z';
                        }
                        m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor de " +x + " para la ecuacion numero " + h + ""));
                        consola.append(decimales.format(m[i][j])+"|");
                    }
                    n[i]= Integer.parseInt(JOptionPane.showInputDialog("Escribe el resultado para la ecuacion numero " + h + ""));
                    consola.append(decimales.format(n[i]));
                    consola.append('\n' +"");
                }
                consola.append('\n' +"");
                MetodoGJ.main(m,n);
            }
            if(radios[5].isSelected()==true){
                int [][] matriz1 = new int [3][3];
                int [][] matriz2 = new int [3][2];
                JOptionPane.showMessageDialog(null, "En este momento llenarás con numeros la matriz 1");
                consola.append('\n' +"Matriz1: ");
                consola.append('\n' +"");
                for (int i=0;i<matriz1.length;i++){
                    for (int j=0;j<matriz1.length;j++){
                        matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor numero " +(j+1)+ " para la ecuacion numero " + (i+1) + ""));
                        consola.append(decimales.format(matriz1[i][j])+"|");
                    }
                    consola.append('\n' +"");
                }
                JOptionPane.showMessageDialog(null, "Ahora llenarás con numeros la matriz 2");
                consola.append('\n' +"Matriz2");
                consola.append('\n' +"");
                for (int i=0;i<matriz2.length;i++){
                    for (int j=0;j<matriz2.length-1;j++){
                        matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor numero " +(j+1)+ " para la ecuacion numero " + (i+1) + ""));
                        consola.append(decimales.format(matriz2[i][j])+"|");
                    }
                    consola.append('\n' +"");
                }
                Matrices.main(matriz1,matriz2);
            }
        }

        if(event.getSource().equals(radios[0]))
        {
            consola.setText(null);
            input.setVisible(true);
            input.setText("");
            consola.append(""+'\n');
            consola.append('\n'+ "Escribe en el campo de texto la ecuacion usando las variables 'a' o 'b'. Con or=+ and=* y not=! (el not va despues de la variable)");
        }
        if(event.getSource().equals(radios[1]))
        {
            consola.setText(null);
            input.setVisible(true);
            input.setText("");
            consola.append(""+'\n');
            consola.append('\n'+ "Escribe en el campo de texto la palabra que quieras codificar ");
        }
        if(event.getSource().equals(radios[2]))//romberg
        {
            consola.setText(null);
            input.setVisible(true);
            input.setText("");
            consola.append(""+'\n');
            consola.append('\n'+ "Escribe en el campo de texto el numero de trapecios que desees para la ecuación Sen(Pi*x) en el algoritmo de Romberg (EXPERIMENTAL)");
        }
        if(event.getSource().equals(radios[3]))
        {
            consola.setText(null);
            input.setVisible(true);
            input.setText("");
            consola.append(""+'\n');
            consola.append('\n'+ "Escribe en el campo de texto el numero de trapecios que desees para la ecuación Sen(Pi*x)");
        }
        if(event.getSource().equals(radios[4])){
            consola.setText(null);
            input.setVisible(false);
            consola.append(""+'\n');
            consola.append('\n'+ "Presiona el boton Calcular para iniciar el proceso de llenado de la matriz que quieres resolver ");
        }
        if(event.getSource().equals(radios[5])){
            consola.setText(null);
            input.setVisible(false);
            input.setText("");
            consola.append('\n'+ "Presiona el boton Calcular para iniciar el proceso de llenado de las matrices que quieres multiplicar ");
        }

    }

    public static JTextArea returnTxt(){
        return consola;
    }
}
