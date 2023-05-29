package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Front_Inicial extends JPanel {

    private JButton si_Juego, no_Juego;

    private JTextArea info_al_Jugador;

    private Escucha escucha;


    public Front_Inicial(){
        initGui();
        this.setSize(400,300);
        this.setOpaque(true);


    }

    public void initGui(){


        Font font = new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 36);


        escucha = new Escucha();

        si_Juego = new JButton(" SI ");
        si_Juego.setBackground(new Color(188, 234, 192));
        si_Juego.setForeground(new Color(82, 25, 196));
        no_Juego = new JButton(" NO ");
        no_Juego.setBackground(new Color(188, 234, 192));
        no_Juego.setForeground(new Color(82, 25, 196));



        si_Juego.addActionListener(escucha);
        no_Juego.addActionListener(escucha);




        info_al_Jugador = new JTextArea();
        info_al_Jugador.append("I know that word\n" +
                "Ejercite su memoria episódica\n" +
                "Desea jugar?");
        info_al_Jugador.setFont(font);
        info_al_Jugador.setForeground(new Color(188, 234, 192));;
        info_al_Jugador.setOpaque(false);

        GridBagLayout gridBagLayout = new GridBagLayout();

        this.setLayout(gridBagLayout);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=1; // columna 0
        gbc.gridy=0; // fila 0
        gbc.gridwidth=5; // ocupara 4 columnas
        gbc.gridheight=2; // ocupara 3 filas
        gbc.weightx = 1.0; // no se deformara
        gbc.weighty = 1.0; // no se deformara
        //gbc.fill = GridBagConstraints.BOTH; // se proporcionara parejo
        this.add(info_al_Jugador, gbc);

        gbc.gridx=1; // columna 0
        gbc.gridy=3; // fila 0
        gbc.gridwidth=1; // ocupara 4 columnas
        gbc.gridheight=1; // ocupara 3 filas
        gbc.weightx = 1.0; // no se deformara
        gbc.weighty = 1.0; // no se deformara
        //gbc.fill = GridBagConstraints.BOTH; // se proporcionara parejo
        this.add(si_Juego, gbc);

        gbc.gridx=3; // columna 0
        gbc.gridy=3; // fila 0
        gbc.gridwidth=1; // ocupara 4 columnas
        gbc.gridheight=1; // ocupara 3 filas
        gbc.weightx = 1.0; // no se deformara
        gbc.weighty = 1.0; // no se deformara
        //gbc.fill = GridBagConstraints.BOTH; // se proporcionara parejo
        this.add(no_Juego, gbc);




    }

    /**
     * inner class implements Listeners used by Front_Inicial class
     */
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==si_Juego){
                System.out.println(" que empieze el juego ");
            }
            else if(e.getSource()==no_Juego){
                System.out.println(" aqui se termina el juego y se muestra de nuevo el ingreso");
            }

        }
    }
}
