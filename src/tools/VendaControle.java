/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import bean.MmsVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author halom
 */
public class VendaControle extends AbstractTableModel {
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MmsVendas getBean(int linha) {
        return (MmsVendas) lista.get(linha);
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
       MmsVendas vendas = (MmsVendas) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendas.getMmsIdVendas();
        }
        if (columnIndex == 1) {
            return vendas.getMmsDataVenda();
        }
        if (columnIndex == 2) {
            return vendas.getMmsValor();
        }
        if (columnIndex == 3) {
            return vendas.getMmsVendedores();
        }
        
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID Venda";
        }
        if (columnIndex == 1) {
            return "Data da Venda";
        }
        if (columnIndex == 2) {
            return "Valor venda";
        }
        if (columnIndex == 3) {
            return "Vendedores";
        }
        
        return "";
    }
    
}
