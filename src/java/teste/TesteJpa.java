/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import javax.persistence.EntityManager;
import util.JPAUtil;

/**
 *
 * @author smith
 */
public class TesteJpa {
    public static void main(String[] args) {
         EntityManager em = JPAUtil.getEntityManager();
    }
   
}
