package teste;

import javax.persistence.EntityManager;
import util.JPAUtil;
public class TesteJpa {
    public static void main(String[] args) {
         EntityManager em = JPAUtil.getEntityManager();
    }   
}
