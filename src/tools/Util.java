/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author halom
 */
public class Util {
    public static void habilitar(boolean valor, JComponent... vetComp) { 
        for (int i = 0; i < vetComp.length; i++) { 
            vetComp[i].setEnabled(valor);
        }
    }
public static void limparCampos(JComponent... vetComp){
        for (JComponent componente : vetComp) {
            if (componente instanceof JTextField){ //JFormatedTextField n precisa fazer pq ja entra no textfield no polimorfiso
            ((JTextField)componente).setText("");
        } else if (componente instanceof JComboBox){
            ((JComboBox) componente).setSelectedIndex(-1);
        } else if (componente instanceof JCheckBox) {
        ((JCheckBox)componente).setSelected(false);
        }
      }
    }
    
    public static void mensagem(String cadeia) {
        JOptionPane.showMessageDialog(null, cadeia);
    }
    
    public static boolean perguntar(String cadeia) {
        
        JOptionPane.showConfirmDialog(null, cadeia,
        "Perguntar", JOptionPane.YES_NO_OPTION);
        int resp = JOptionPane.showConfirmDialog(null, "Confirmar excluir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
         return true;
        } else {
        return false;
        }   
    }
    
    public static int strInt(String  cad) {
            return Integer.parseInt(cad);
    }
    
    public static String intStr(int num){
        return "";
    }
    
    public static double doubleStr(double cad){
        return 0;
    }
    
    public static String DoubleStr(double num){
        return "";
    }
    
    public static Date StrDate(String cad){
        return null;
    }
    
    public static Date dateStr(String num){
        return null;
    }
}


