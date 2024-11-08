/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package componentevisualpersonalizado;

import java.awt.Color;
import java.awt.Font;
import static javax.swing.BorderFactory.createLineBorder;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author pacob
 */
public class JPanelPersonalizado extends javax.swing.JPanel {

    private Color colorBordeCorrecto = Color.GREEN;
    private Color colorBordeIncorrecto = Color.RED;
    private Color colorBordePorDefecto = Color.BLACK;
    
    private String textoArriba = "Introduzca su correo electronico";
    private Color colorTextArriba = Color.BLACK;
    private Font fuenteTextoArriba = new Font("Arial", Font.BOLD, 25);
    
    private String textHint = "Escriba aquí su e-mail";
    private Color colorTextoHint = Color.DARK_GRAY;
    private Font fuenteTextHint = new Font("Arial", Font.ITALIC, 12);
    
    private String textMensajeCorrecto = "E-mail valido";
    private String textMensajeIncorrecto = "E-mail no valido";
    private Color colorMensajeCorrecto = Color.GREEN;
    private Color colorMensajeIncorrecto = Color.RED;
    private Font fuenteMensajeError = new Font("Arial", Font.BOLD, 20);
    /**
     * Creates new form JPanelPersonalizado
     */
    public JPanelPersonalizado() {
        initComponents();
    }
    
    // Texto del mensaje de arriba
    public String getTextoArriba() {
        return textoArriba;
    }

    public void setTextoArriba(String textoArriba) {
        jLabel1.setText(textoArriba);
    }
    
    //Color del mensaje de arriba
    public Color getColorTextArriba() {
        return colorTextArriba;
    }

    public void setColorTextArriba(Color colorTextArriba) {
        jLabel1.setForeground(colorTextArriba);
    }
    
    //Fuente del mensaje de arriba
    public Font getFuenteTextoArriba() {
        return fuenteTextoArriba;
    }

    public void setFuenteTextoArriba(Font fuenteTextoArriba) {
        jLabel1.setFont(fuenteTextoArriba);
    }
    
    //Text del hint
    public String getTextHint() {
        return textHint;
    }

    public void setTextHint(String textHint) {
        jLabel2.setText(textHint);
    }
    
    //Color del texto del hint
    public Color getColorTextoHint() {
        return colorTextoHint;
    }

    public void setColorTextoHint(Color colorTextoHint) {
        jLabel2.setForeground(colorTextoHint);
    }
    
    //Fuente del texto del hint
    public Font getFuenteTextHint() {
        return fuenteTextHint;
    }

    public void setFuenteTextHint(Font fuenteTextHint) {
        jLabel2.setFont(fuenteTextHint);
    }

    //Texto del mensaje correcto
    public String getTextMensajeErrorCorrecto() {
        return textMensajeCorrecto;
    }

    public void setTextMensajeErrorCorrecto(String textMensajeCorrecto) {
        this.textMensajeCorrecto = textMensajeCorrecto;
    }
    
    //Texto del mensaje incorrecto
    public String getTextMensajeErrorIncorrecto() {
        return textMensajeIncorrecto;
    }

    public void setTextMensajeErrorIncorrecto(String textMensajeIncorrecto) {
        this.textMensajeIncorrecto = textMensajeIncorrecto;
    }

    //Fuente del mensaje de error
    public Font getfuenteMensajeError() {
        return fuenteMensajeError;
    }

    public void setfuenteMensajeError(Font fuenteMensaje) {
        this.fuenteMensajeError = fuenteMensaje;
    }
    
    //Color del mensaje correcto
    public Color getColorMensajeCorrecto() {
        return colorMensajeCorrecto;
    }

    public void setColorMensajeCorrecto(Color colorMensajeCorrecto) {
        this.colorMensajeCorrecto = colorMensajeCorrecto;
    }
    
    //Color del mensaje incorrecto
    public Color getColorMensajeIncorrecto() {
        return colorMensajeIncorrecto;
    }

    public void setColorMensajeIncorrecto(Color colorMensajeIncorrecto) {
        this.colorMensajeIncorrecto = colorMensajeIncorrecto;
    }

    //Color del borde por defecto
    public void setColorBordePorDefecto(Color color) {
        jTextFieldEmail.setBorder(createLineBorder(color));
        colorBordePorDefecto = color;
    }
    
    public Color getColorBordePorDefecto() {
        return colorBordePorDefecto;
    }
    
    //Color del borde cuando el email es correcto
    public void setColorBordeCorrecto(Color color) {
        colorBordeCorrecto = color;
    }
    
    public Color getColorBordeCorrecto() {
        return colorBordeCorrecto;
    }
    
    //Color del borde cuando el email es incorrecto
    public void setColorBordeIncorrecto(Color color) {
        colorBordeIncorrecto = color;
    }
    
    public Color getColorBordeIncorrecto() {
        return colorBordeIncorrecto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();

        jLabel1.setText("Introduzca un correo electrónico");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Escriba aquí su e-mail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 128, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(0, 80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMensaje)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        String emailText = jTextFieldEmail.getText();
        
        if (emailText.length() > 1) {
            jLabel2.setVisible(false);
        }
        
        if (emailValidator(emailText)) {
            cambiaColorTexto(colorMensajeCorrecto, textMensajeCorrecto, colorBordeCorrecto, fuenteMensajeError);
        } else {
            cambiaColorTexto(colorMensajeIncorrecto, textMensajeIncorrecto, colorBordeIncorrecto, fuenteMensajeError);
            
        }
    }//GEN-LAST:event_jTextFieldEmailKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables

    
    public static boolean emailValidator(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        
        return validator.isValid(email);
    }
    
    public void cambiaColorTexto(Color color, String textMensaje, Color colorBorde, Font fuenteMensajeError) {
        jLabelMensaje.setText(textMensaje);
        jLabelMensaje.setForeground(color);
        jLabelMensaje.setFont(fuenteMensajeError);
        jTextFieldEmail.setBorder(createLineBorder(color));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(colorBorde));
    }
}
