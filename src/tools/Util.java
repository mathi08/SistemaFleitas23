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
//                    JTextField objeto = (JTextField) componente;
//                    objeto.setText("");
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
       //JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
       int resp =  JOptionPane.showConfirmDialog(null, "Deseja excluir o registro",
       "confirmar", JOptionPane.YES_NO_OPTION);
       if (resp == JOptionPane.YES_OPTION){
       return true;
       }else {
       return false;}      
    }
    public static int strInt(String cad) {
    try {
        return Integer.parseInt(cad);
    } catch (NumberFormatException e) {
        // Trate a exceção de formato inválido aqui.
        // Pode retornar um valor padrão ou lançar uma exceção personalizada, dependendo das suas necessidades.
        return 0; // Retorna 0 como valor padrão em caso de erro.
    } catch (NullPointerException e) {
        // Trate a exceção de valor nulo aqui.
        return 0; // Retorna 0 como valor padrão em caso de erro.
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
