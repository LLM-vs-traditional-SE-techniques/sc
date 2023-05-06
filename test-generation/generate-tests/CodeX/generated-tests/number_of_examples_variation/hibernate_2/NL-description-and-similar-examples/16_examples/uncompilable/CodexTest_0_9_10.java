import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
  private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		// include size
		s.writeInt(s.size());
		// then write all key/value pairs
		for (Map.Entry<K, V> e : s.entrySet()) {
			s.writeObject(e.getKey());
			s.writeObject(e.getValue());
		}
	}
}