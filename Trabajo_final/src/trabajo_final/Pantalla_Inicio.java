/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajo_final;

import Datos.CategoriaDAO;
import Datos.Conexion_Base_de_Datos;
import Datos.ProductoDAO;
import entidades.Categoria;
import entidades.Cesta;
import static entidades.Cesta.cesta;
import entidades.Producto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author usuarioDAW
 */
public class Pantalla_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_Inicio
     */
    public Pantalla_Inicio() {
        initComponents();
        scrollProductos.setViewportView(panel_compra);
        cargarProductos();
        setTitle("Alma Rociera");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Cargar Imagen de Imagen_Inicio
        ImageIcon inicio = new ImageIcon(getClass().getResource("/Imagenes/Imagen_Inicio.jpeg"));
        Image inicioEscalada = inicio.getImage().getScaledInstance(
                labelImagen.getWidth(),
                labelImagen.getHeight(),
                Image.SCALE_SMOOTH
        );
        labelImagen.setIcon(new ImageIcon(inicioEscalada));
        Pantalla_Inicio.getWidth();
        Pantalla_Inicio.getHeight();
        panel_compra.setLayout(new GridLayout(0, 5, 10, 10));
    }

    private void cargarProductos() {
        panel_compra.removeAll(); // Limpia si ya había

        ArrayList<Producto> productos = ProductoDAO.obtenerProductos();

        for (Producto prod : productos) {
            JPanel tarjeta = new JPanel();
            tarjeta.setLayout(new BoxLayout(tarjeta, BoxLayout.Y_AXIS));
            tarjeta.setPreferredSize(new Dimension(150, 220));
            tarjeta.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            tarjeta.setBackground(Color.LIGHT_GRAY);

            // Cargar imagen
            System.out.println(prod.getNombre());
            ImageIcon rutaImagen = new ImageIcon(getClass().getResource("/Imagenes/" + prod.getNombre() + ".jpg"));
            Image imagenProducto = rutaImagen.getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH);
            JLabel Imagen;
            Imagen = new JLabel(new ImageIcon(imagenProducto));

            Imagen.setPreferredSize(new Dimension(120, 100));
            Imagen.setAlignmentX(Component.CENTER_ALIGNMENT);
            
            // Cargar el nombre y el precio de la base de datos
            JLabel Nombre = new JLabel(prod.getNombre(), SwingConstants.CENTER);
            JLabel Precio = new JLabel(String.format("%.2f €", prod.getPrecio()), SwingConstants.CENTER);
            Nombre.setAlignmentX(Component.CENTER_ALIGNMENT);
            Precio.setAlignmentX(Component.CENTER_ALIGNMENT);
           
            //Creación de los Botones
            JButton Comprar = new JButton("Comprar");
            JButton VerMas = new JButton("Ver más");
            Comprar.setAlignmentX(Component.CENTER_ALIGNMENT);
            VerMas.setAlignmentX(Component.CENTER_ALIGNMENT);
            
            //Añadir al boton compra una frase y añadir el producto a la lista compra
            Comprar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Cesta.agregarProducto(prod);
                    JOptionPane.showMessageDialog(null, "Se ha añadido a la cesta");
                }
            });
            //Hacemos que le botos Ver Mas, cambie de pagina y guarde los datos que queremos
            VerMas.addActionListener(e -> {
                this.setVisible(false);
                String nombre = prod.getNombre();
                String descripcion = prod.getDescripcion();
                double precio = prod.getPrecio();
                ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/" + prod.getNombre() + ".jpg"));
                DetallesProducto detalle = new DetallesProducto(nombre, descripcion, precio, imagen);
                detalle.setVisible(true);
            });
            
            
            //Subir los Jlabel y los botones
            tarjeta.add(Imagen);
            tarjeta.add(Nombre);
            tarjeta.add(Precio);
            tarjeta.add(Comprar);
            tarjeta.add(VerMas);

            panel_compra.add(tarjeta);
         
        }

        panel_compra.revalidate();
        panel_compra.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImagen = new javax.swing.JLabel();
        Pantalla_Inicio = new javax.swing.JPanel();
        Iniciar_sesion = new javax.swing.JButton();
        scrollProductos = new javax.swing.JScrollPane();
        panel_compra = new javax.swing.JPanel();
        Pagar = new javax.swing.JButton();
        Nombre_Tienda = new javax.swing.JLabel();
        Categorias = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pantalla_Inicio.setBackground(new java.awt.Color(229, 211, 165));

        Iniciar_sesion.setText("Iniciar sesion");
        Iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_sesionActionPerformed(evt);
            }
        });

        panel_compra.setBackground(new java.awt.Color(229, 211, 165));

        javax.swing.GroupLayout panel_compraLayout = new javax.swing.GroupLayout(panel_compra);
        panel_compra.setLayout(panel_compraLayout);
        panel_compraLayout.setHorizontalGroup(
            panel_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
        );
        panel_compraLayout.setVerticalGroup(
            panel_compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
        );

        scrollProductos.setViewportView(panel_compra);

        Pagar.setText("Cesta");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        Nombre_Tienda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 48)); // NOI18N
        Nombre_Tienda.setForeground(new java.awt.Color(64, 145, 108));
        Nombre_Tienda.setText("Alma Rociera");

        Categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Categorias.setSelectedItem(Categoria);
        Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pantalla_InicioLayout = new javax.swing.GroupLayout(Pantalla_Inicio);
        Pantalla_Inicio.setLayout(Pantalla_InicioLayout);
        Pantalla_InicioLayout.setHorizontalGroup(
            Pantalla_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pantalla_InicioLayout.createSequentialGroup()
                .addGroup(Pantalla_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE))
                    .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nombre_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(Pagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Iniciar_sesion)))
                .addGap(32, 32, 32))
        );
        Pantalla_InicioLayout.setVerticalGroup(
            Pantalla_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                .addGroup(Pantalla_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Pantalla_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Iniciar_sesion)
                            .addComponent(Pagar)))
                    .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nombre_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pantalla_InicioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pantalla_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pantalla_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_sesionActionPerformed
        Iniciar_sesion login = new Iniciar_sesion();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Iniciar_sesionActionPerformed

    private void CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriasActionPerformed
        for (Categoria cat : CategoriaDAO.Categoria()) {
            Categorias.setSelectedItem(cat);
        }
    }//GEN-LAST:event_CategoriasActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        Factura factura = new Factura();
        factura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicio().setVisible(true);
            }
        });
        SwingUtilities.invokeLater(Pantalla_Inicio::new);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Categorias;
    private javax.swing.JButton Iniciar_sesion;
    private javax.swing.JLabel Nombre_Tienda;
    private javax.swing.JButton Pagar;
    private javax.swing.JPanel Pantalla_Inicio;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JPanel panel_compra;
    private javax.swing.JScrollPane scrollProductos;
    // End of variables declaration//GEN-END:variables
}
