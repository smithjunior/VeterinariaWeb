package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Animal;

public class AnimalDAO {
    
    private final GenericDAO<Animal> dao;
    private final EntityManager em;

    public AnimalDAO(EntityManager em) {
        this.dao = new GenericDAO<Animal>(em, Animal.class);
        this.em = em;
    }
    
    public List<Animal> pesquisar(String nome){
        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.nome = :nome", Animal.class);
        query.setParameter("nome", "%"+nome+"%");
        return query.getResultList();
    }

    public void inserir(Animal animal) {
        dao.inserir(animal);
    }

    public Animal consultar(long id) {
        return dao.consultar(id);
    }

    public List<Animal> listar() {
        return dao.listar();
    }

    public void excluir(Animal animal) {
        dao.excluir(animal);
    }

    public void alterar(Animal animal) {
        dao.alterar(animal);
    }
   
}
