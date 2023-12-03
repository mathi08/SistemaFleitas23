/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MmsCategoria;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u07875284120
 */
public class MmsCategoriaDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(MmsCategoria.class); //importar do bean e do hibernate; criteria é pra fazer select * from na O.O
        criteria.add(Restrictions.eq("idcategoria", id)); //é um método estático; id é o parametro da linha 46
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; //registros no java sao transformados em bean; nao precisa do array pq mudou na linha 50 só pra list
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsCategoria.class); //importar do bean e do hibernate; criteria é pra fazer select * from na O.O
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista; //registros no java sao transformados em bean; nao precisa do array pq mudou na linha 50 só pra list
    }
    
     public List listConsumoMin(int consumoMin) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsCategoria.class);
        criteria.add(Restrictions.ge("mmsConsumoMinimo", consumoMin));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
     public List listSli(String Sli) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsCategoria.class);
        criteria.add(Restrictions.like("mmsSliCrossFire", "%" + Sli+ "%"));
        List results = criteria.list();
        session.getTransaction().commit();  
        return results;
     }    
    public List listConsumoSli(int consumoMin, String Sli) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MmsCategoria.class);
         criteria.add(Restrictions.ge("mmsConsumoMinimo", consumoMin));
        criteria.add(Restrictions.like("mmsSliCrossFire", "%" + Sli+ "%"));

        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    
    
}
    
}

