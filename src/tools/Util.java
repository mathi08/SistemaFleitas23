/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07032685110
 */
public class Util {
        public static void habilitar(boolean valor, JComponent ... vetComp){
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
            
        }
        }
        
        public static void limparCampos(JComponent... vetComp) {
            for (JComponent componente : vetComp) {
                if (componente instanceof JTextField) {
                ((JTextField) componente).setText(""); 
                } else if (componente instanceof JComboBox){
                ((JComboBox)componente).setSelectedIndex(-1);
                }else if (componente instanceof JCheckBox) {
                ((JCheckBox)componente).setSelected(false);
                }
            }
            
        
    }
        
        public static void mensagem() {
        
        }

    public static void mensagem(String cadeia) {
        JOptionPane.showMessageDialog(null, cadeia);
    }

    public static boolean perguntar(String cadeia) {
       int resp =  JOptionPane.showConfirmDialog(null, "Deseja excluir o registro",
       "confirmar", JOptionPane.YES_NO_OPTION);
       if (resp == JOptionPane.YES_OPTION){
       return true;
       }else {
       return false;}      
    }
    public static int strInt(String cad) {
    if (cad != null && !cad.isEmpty()) {
        return Integer.parseInt(cad);
    } else {
        // Lida com o caso em que a string está vazia ou nula
        // Retorne um valor padrão ou lance uma exceção, dependendo dos requisitos.
        return 0; // Retornando 0 como exemplo; ajuste conforme necessário.
    }
}
    public static String intStr(int num){
    return Integer.toString(num);
    }
    public static double strDouble(String cad){
        return Double.parseDouble(cad);
    }
    public static String doubleStr(double num){
     return Double.toString(num);
    }
    public static Date strDate(String cad)throws ParseException{
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return dateFormat.parse(cad);
    }
    public static String dateStr(Date data){
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    return dateFormat.format(data);
    }
}
