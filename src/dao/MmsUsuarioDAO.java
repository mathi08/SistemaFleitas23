/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MmsUsuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u07875284120
 */
public class MmsUsuarioDAO extends DAO_Abstract {
    
    public MmsUsuario LoginUsuario(String apelidoUsuario, String senha) {
        session.beginTransaction();

        Query query = session.createQuery("FROM MmsUsuario WHERE mmsApelido = :mms_apelido AND mmsSenha = :mms_senha");
        query.setParameter("mms_apelido", apelidoUsuario);
        query.setParameter("mms_senha", senha);

        MmsUsuario mmsusuario = (MmsUsuario) query.uniqueResult();

        session.getTransaction().commit();

        return mmsusuario;
    }

    @Override
    public void insert(Object object) {
       session.beginTransaction(); //nao precisa flush e clear pq está mandando uma informacao nova. ja no up e delt ta pegando uma informação ja existente
       session.save(object);
       session.getTransaction().commit(); //todas as operacoes com banco de dados precisam de transacao com hibernate
    }

    @Override
    public void update(Object object) {
       session.beginTransaction();
       session.flush(); //porque vai limpar o cash do hiberenate pra ele não gravar coisas erradas
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush(); //porque vai limpar o cash do hiberenate pra ele não gravar coisas erradas
       session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsUsuario.class); //importar do bean e do hibernate; criteria é pra fazer select * from na O.O
        criteria.add(Restrictions.eq("id", id)); //é um método estático; id é o parametro da linha 46
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; //registros no java sao transformados em bean; nao precisa do array pq mudou na linha 50 só pra list
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsUsuario.class); //importar do bean e do hibernate; criteria é pra fazer select * from na O.O
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; //registros no java sao transformados em bean; nao precisa do array pq mudou na linha 50 só pra list
    }
        public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsUsuario.class);
        criteria.add(Restrictions.like("mmsNome", "%" + nome+ "%"));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
     public List listCpf(String Cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsUsuario.class);
        criteria.add(Restrictions.like("mmsCpf", "%" + Cpf+ "%"));
        List results = criteria.list();
        session.getTransaction().commit();  
        return results;
     }    
    public List listNomeCpf(String Nome, String Cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsUsuario.class);
        criteria.add(Restrictions.like("mmsNome", "%" + Nome+ "%"));        
        criteria.add(Restrictions.like("mmsCpf", "%" + Cpf+ "%"));

        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
        
        
}

