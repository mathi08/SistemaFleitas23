/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import bean.MmsCategoria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ControleCategoria extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MmsCategoria getBean(int linha) {
        return (MmsCategoria) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MmsCategoria categoria = (MmsCategoria) lista.get(rowIndex);
        if (columnIndex == 0) {
            return categoria.getMmsIdcategoria();
        }
        if (columnIndex == 1) {
            return categoria.getMmsNome();
        }
        if (columnIndex == 2) {
            return categoria.getMmsTipoPlaca();
        }
     
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Descrição";
        }
        if (columnIndex == 3) {
            return "Tipo Placa";
        }
        return "";
    }
}
