package vista;

import controlador.Lanza_app_Prueba;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Botones extends  JButton{
    private Lanza_app_Prueba.Escucha escucha;
    private ImageIcon imageIcon;
    private ImageIcon imageIcon_Pressed;
    private int tamaño_fuente,alto,ancho;
    private JPanel jPanel;
    private ArrayList<JButton> palabras_array;

    public int getTamaño_fuente() {
        return tamaño_fuente;
    }

    public void setTamaño_fuente(int tamaño_fuente) {
        this.tamaño_fuente = tamaño_fuente;
    }
    public void setTamaño_boton(int ancho, int  alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void activar() {
        this.setEnabled(true);
    }

    public void desactivar() {
        this.setEnabled(false);
    }
    public Botones() {
        jPanel = new JPanel();
        palabras_array = new ArrayList<>();
        tamaño_fuente = 15;
        ancho=120;
        alto = 40;
        escucha = new Lanza_app_Prueba.Escucha();
        this.setBackground(null);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.addActionListener(escucha);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setFocusable(false); //Quita linea de los botones
        imageIcon = new ImageIcon();
        imageIcon_Pressed = new ImageIcon();
    }

    /**
     * Método de sobrecarga la clase Botones que estos parametros
     * @param titulo
     * @param tamaño
     * @param _ancho
     * @param _alto
     */

    public Botones(String titulo, int tamaño, int _ancho, int _alto  ) {
        this.setText(titulo);
        tamaño_fuente = tamaño;
        ancho = _ancho;
        alto = _alto;
        escucha = new Lanza_app_Prueba.Escucha();
        this.setBackground(null);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.addActionListener(escucha);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setFocusable(false);//Quita linea de los botones
        imageIcon = new ImageIcon();
        imageIcon_Pressed = new ImageIcon();
        getBoton_style_1(titulo);
    }


    public JButton getBoton_style_1(String titulo ) {
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones/Boton.png")));
        imageIcon_Pressed = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones/Boton_PRESSED.png")));
        this.setForeground(Color.white);
        this.setText(titulo);
        this.setFont(new Font(null,Font.BOLD,tamaño_fuente));
        this.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        this.setPressedIcon(new ImageIcon(imageIcon_Pressed.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        return this;
    }

    public JButton getBoton_style_2(String titulo) {
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones/Boton_2.png")));
        imageIcon_Pressed = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones/Boton_PRESSED_2.png")));
        this.setForeground(Color.white);
        this.setText(titulo);
        this.setFont(new Font(null,Font.BOLD,tamaño_fuente));
        this.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        this.setPressedIcon(new ImageIcon(imageIcon_Pressed.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        return this;
    }
    public JButton nivel(String titulo) {
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel.png")));
        imageIcon_Pressed = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel_pressed.png")));
        this.setForeground(Color.white);
        this.setText(titulo);
        this.setFont(new Font(null,Font.BOLD,tamaño_fuente));
        this.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        this.setPressedIcon(new ImageIcon(imageIcon_Pressed.getImage().getScaledInstance(ancho,alto,Image.SCALE_SMOOTH)));
        return this;
    }

    public JButton convert(String letra) {
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel.png")));
        imageIcon_Pressed = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel_pressed.png")));
        this.setForeground(Color.white);
        this.setFont(new Font(null,Font.BOLD,50));
        this.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));
        this.setPressedIcon(new ImageIcon(imageIcon_Pressed.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));
        this.setText(letra);
        return this;
    }


    public JPanel seText_grafico(String palabra) {
        jPanel.removeAll();
        jPanel.setBackground(null);
        imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel.png")));
        imageIcon_Pressed = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/botones_nivel/nivel_pressed.png")));
        this.setForeground(Color.white);
        this.setFont(new Font(null,Font.BOLD,50));
        this.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));
        this.setPressedIcon(new ImageIcon(imageIcon_Pressed.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));

        for ( String letra : palabra.split("")) {
            Botones botonX = new Botones();
            jPanel.add(botonX.convert(letra));
        }
        return jPanel;
    }
}
