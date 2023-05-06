import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_18 { 
  @Test
     
Input: public Endpoint getEndpoint() {
            return connection.getEndpoint();
        }
Output: public void test_clear_smoke() {
            // given
            IndexWriter.Operation op = w.opsMock.capture();
            // when
            v.clear();
            // then
            List<Entity> expected = new ArrayList<>();
            Assert.assertEquals(expected, op.getOps());
        }
}