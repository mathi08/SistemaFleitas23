/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import bean.MmsProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class ProdutoControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MmsProduto getBean(int linha) {
        return (MmsProduto) lista.get(linha);
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
        MmsProduto produto = (MmsProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getMmsIdproduto();
        }
        if (columnIndex == 1) {
            return produto.getMmsNome();
        }
        if (columnIndex == 2) {
            return produto.getMmsMarca();
        }
        if (columnIndex == 3) {
            return produto.getMmsPreco();
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
            return "Marca";
        }
        if (columnIndex == 3) {
            return "Preco";
        }
        return "";
    }
}
