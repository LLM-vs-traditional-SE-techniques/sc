import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
    @Test
    @Transactional
    public void testAdd() {
        // create two entities with different data
        EntityManager em = entityManagerFactory.createEntityManager();
        Item item1 = new Item("name1");
        Item item2 = new Item("name2");
        Item item3 = new Item("name3");
        Item item4 = new Item("name4");
        // persist entities
        em.persist(item1);
        em.persist(item2);
        em.persist(item3);
        em.persist(item4);
        // flush
        em.flush();
        // perform query
        long count = em.createQuery("SELECT COUNT(i) FROM Item i", Long.class).getSingleResult();
        assertEquals(0, count);
    }

}