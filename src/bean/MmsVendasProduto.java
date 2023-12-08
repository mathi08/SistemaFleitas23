package bean;
// Generated 13/11/2023 18:58:12 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MmsVendasProduto generated by hbm2java
 */
@Entity
@Table(name="mms_vendas_produto"
    ,catalog="db_mathias_fleitas"
)
public class MmsVendasProduto  implements java.io.Serializable {


     private int mmsIdvendasProduto;
     private MmsVendas mmsVenda;
     private MmsProduto mmsProduto;
     private String mmsQuantidade;
     private Double mmsValorUnitario;

    public MmsVendasProduto() {
    }

	
    public MmsVendasProduto(int mmsIdvendasProduto, String mmsQuantidade, Double mmsValorUnitario) {
        this.mmsIdvendasProduto = mmsIdvendasProduto;
        this.mmsQuantidade = mmsQuantidade;
        this.mmsValorUnitario = mmsValorUnitario;
    }
    public MmsVendasProduto(int mmsIdvendasProduto, MmsVendas mmsVenda, MmsProduto mmsProduto, String mmsQuantidade, Double mmsValorUnitario) {
       this.mmsIdvendasProduto = mmsIdvendasProduto;
       this.mmsVenda = mmsVenda;
       this.mmsProduto = mmsProduto;
       this.mmsQuantidade = mmsQuantidade;
       this.mmsValorUnitario = mmsValorUnitario;
    }
   
     @Id  @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mms_idvendas_produto", unique=true, nullable=false)
    public int getMmsIdvendasProduto() {
        return this.mmsIdvendasProduto;
    }
    
    public void setMmsIdvendasProduto(int mmsIdvendasProduto) {
        this.mmsIdvendasProduto = mmsIdvendasProduto;
    }

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="mms_venda")

    public MmsVendas getMmsVenda() {
        return this.mmsVenda;
    }
    
    public void setMmsVenda(MmsVendas mmsVenda) {
        this.mmsVenda = mmsVenda;
    }

    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="mms_produto")
    public MmsProduto getMmsProduto() {
        return this.mmsProduto;
    }
    
    public void setMmsProduto(MmsProduto mmsProduto) {
        this.mmsProduto = mmsProduto;
    }

    
    @Column(name="mms_quantidade", nullable=false, length=45)
    public String getMmsQuantidade() {
        return this.mmsQuantidade;
    }
    
    public void setMmsQuantidade(String mmsQuantidade) {
        this.mmsQuantidade = mmsQuantidade;
    }

    
    @Column(name="mms_valorUnitario", nullable=false, precision=8)
    public Double getMmsValorUnitario() {
        return this.mmsValorUnitario;
    }
    
    public void setMmsValorUnitario(Double mmsValorUnitario) {
        this.mmsValorUnitario = mmsValorUnitario;
    }




}


