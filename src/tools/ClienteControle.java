package tools;

import bean.MmsCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ClienteControle extends AbstractTableModel {
    //estende a classe AbstractTableModel. Essa classe é usada como um modelo de 
    //tabela para exibir dados de clientes em uma interface gráfica usando o framework Swing.
    private List lista;
    
    //A variável lista é uma lista que contém os objetos de cliente a serem exibidos na tabela. 
    //Essa lista é definida através do método setList.
       
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public MmsCliente getBean(int linha) {
        return (MmsCliente) lista.get(linha);
    }
    //O método getBean retorna o objeto correspondente à linha especificada.
    
    @Override
    public int getRowCount() {
        return lista.size();
    }
    
     //retorna o número de linhas da tabela, que é determinado pelo tamanho da lista de clientes.

    @Override
    public int getColumnCount() {
        return 4;
    }
    // retorna o número de colunas da tabela, que é fixo em 4 neste caso.

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MmsCliente cliente = (MmsCliente) lista.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getMmsIdcliente();
        }
        if (columnIndex == 1) {
            return cliente.getMmsNome();
        }
        if (columnIndex == 2) {
            return cliente.getMmsRg();
        }
        if (columnIndex == 3) {
            return cliente.getMmsSexo();
        }
        return "";
    }
    
    //O método getValueAt é responsável por retornar o valor a ser exibido em uma célula específica
    // da tabela. Ele recebe como parâmetros o índice da linha (rowIndex) e o índice da coluna (columnIndex).
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "RG";
        }
        if (columnIndex == 3) {
            return "Sexo";
        }
        return "";
    }
}
