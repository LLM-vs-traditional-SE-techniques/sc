import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  
	*/
	
	public void testPrint() {
		// insert your test here
		
		// the best way to do this test is to read the memory files and run the code
		// and see if they produce a diff that is reasonable
		
		File file = new File("method/");
		String[] files = file.list();
		
		for (String f: files) {
			MethodCode mc = new MethodCode(f);
			
			System.out.println(mc.print());
		}
	}
	
	@Test
	public void testAddMethod() throws IOException{
		Database db = new Database();
		
		File folder = new File("tests/method/");
		String[] files = folder.list();
		
		for (String f: files) {
			MethodCode mc = new MethodCode(f);
			db.addMethodCode(mc);
		}
		
		assertEquals(db.treeSize(),9);
		
	}
}