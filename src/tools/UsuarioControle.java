/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import bean.MmsUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class UsuarioControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MmsUsuario getBean(int linha) {
        return (MmsUsuario) lista.get(linha);
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
        MmsUsuario usuarios = (MmsUsuario) lista.get(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getMmsIdUsuario();
        }
        if (columnIndex == 1) {
            return usuarios.getMmsNome();
        }
        if (columnIndex == 2) {
            return usuarios.getMmsApelido();
        }
        if (columnIndex == 3) {
            return usuarios.getMmsCpf();
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
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
}
