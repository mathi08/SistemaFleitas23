package bean;
// Generated 22/09/2023 15:20:10 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MmsUsuario generated by hbm2java
 */
@Entity
@Table(name="mms_usuario"
    ,catalog="db_mathias_fleitas"
)
public class MmsUsuario  implements java.io.Serializable {


     private int mmsIdUsuario;
     private String mmsNome;
     private String mmsApelido;
     private String mmsCpf;
     private Date mmsDataNasc;
     private String mmsSenha;
     private int mmsNivel;
     private String mmsAtivo;

    public MmsUsuario() {
    }

    public MmsUsuario(int mmsIdUsuario, String mmsNome, String mmsApelido, String mmsCpf, Date mmsDataNasc, String mmsSenha, int mmsNivel, String mmsAtivo) {
       this.mmsIdUsuario = mmsIdUsuario;
       this.mmsNome = mmsNome;
       this.mmsApelido = mmsApelido;
       this.mmsCpf = mmsCpf;
       this.mmsDataNasc = mmsDataNasc;
       this.mmsSenha = mmsSenha;
       this.mmsNivel = mmsNivel;
       this.mmsAtivo = mmsAtivo;
    }
   
     @Id 

    
    @Column(name="mms_idUsuario", unique=true, nullable=false)
    public int getMmsIdUsuario() {
        return this.mmsIdUsuario;
    }
    
    public void setMmsIdUsuario(int mmsIdUsuario) {
        this.mmsIdUsuario = mmsIdUsuario;
    }

    
    @Column(name="mms_nome", nullable=false, length=70)
    public String getMmsNome() {
        return this.mmsNome;
    }
    
    public void setMmsNome(String mmsNome) {
        this.mmsNome = mmsNome;
    }

    
    @Column(name="mms_apelido", nullable=false, length=25)
    public String getMmsApelido() {
        return this.mmsApelido;
    }
    
    public void setMmsApelido(String mmsApelido) {
        this.mmsApelido = mmsApelido;
    }

    
    @Column(name="mms_cpf", nullable=false, length=45)
    public String getMmsCpf() {
        return this.mmsCpf;
    }
    
    public void setMmsCpf(String mmsCpf) {
        this.mmsCpf = mmsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="mms_dataNasc", nullable=false, length=45)
    public Date getMmsDataNasc() {
        return this.mmsDataNasc;
    }
    
    public void setMmsDataNasc(Date mmsDataNasc) {
        this.mmsDataNasc = mmsDataNasc;
    }

    
    @Column(name="mms_senha", nullable=false, length=45)
    public String getMmsSenha() {
        return this.mmsSenha;
    }
    
    public void setMmsSenha(String mmsSenha) {
        this.mmsSenha = mmsSenha;
    }

    
    @Column(name="mms_nivel", nullable=false)
    public int getMmsNivel() {
        return this.mmsNivel;
    }
    
    public void setMmsNivel(int mmsNivel) {
        this.mmsNivel = mmsNivel;
    }

    
    @Column(name="mms_ativo", nullable=false, length=1)
    public String getMmsAtivo() {
        return this.mmsAtivo;
    }
    
    public void setMmsAtivo(String mmsAtivo) {
        this.mmsAtivo = mmsAtivo;
    }




}


