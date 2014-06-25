/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Juliano Toriani <julianotoriani@gmail.com>
 */
public class GenericDAO<E> {

    private EntityManager manager;
    private Class<E> clazz;

    public GenericDAO(EntityManager manager, Class<E> clazz) {
        this.manager = manager;
        this.clazz = clazz;
    }

    public void inserir(E obj) {
        manager.persist(obj);
    }

    public E consultar(long id) {
        return manager.find(clazz, id);
    }

    public List<E> listar() {
        Query query = manager.createQuery("select o from "+clazz.getName()+" o");
        return query.getResultList();
    }
    public void excluir(E obj){
        manager.remove(obj);
    }
     public void alterar(E obj){
        manager.merge(obj);
    }
}
