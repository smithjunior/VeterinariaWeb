package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GenericDAO<Generic> {

    private EntityManager manager;
    private Class<Generic> clazz;

    public GenericDAO(EntityManager manager, Class<Generic> clazz) {
        this.manager = manager;
        this.clazz = clazz;
    }

    public void inserir(Generic obj) {
        manager.persist(obj);
    }

    public Generic consultar(Long id) {
        return manager.find(clazz, id);
    }

    public List<Generic> listar() {
        Query query = manager.createQuery("select o from "+clazz.getName()+" o");
        return query.getResultList();
    }
    public void excluir(Generic obj){
        manager.remove(manager.merge(obj));
    }
     public void alterar(Generic obj){
        manager.merge(obj);
    }
}
