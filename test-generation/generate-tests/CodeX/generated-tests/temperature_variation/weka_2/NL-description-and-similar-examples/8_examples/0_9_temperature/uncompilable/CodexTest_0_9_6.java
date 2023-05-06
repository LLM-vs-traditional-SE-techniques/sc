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


public class CodexTest_0_9_6 { 
  @Test
  public <T> void forEach(T[] array, Consumer<? super T> action) {
		for (int i = 0; i < array.length; i++) {
			action.accept(array[i]);
		}
	}
}