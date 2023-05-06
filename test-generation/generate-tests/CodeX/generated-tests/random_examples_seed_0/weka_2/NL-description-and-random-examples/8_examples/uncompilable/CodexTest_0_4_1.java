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


public class CodexTest_0_4_1 { 
  @Test
    public void testGetAsInstance() {
        try {
            Instances model = new Instances(new BufferedReader(new FileReader(
                    "src/test/resources/nominal.arff")));
            Instance instance = new Instance(model.numAttributes());
            instance.setDataset(model);
            instance.setValue(0, 0);
            instance.setValue(1, 1);
            instance.setValue(2, 2);
            instance.setValue(3, 3);
            instance.setValue(4, 4);
            instance.setValue(5, 5);
            instance.setValue(6, 6);
            instance.setValue(7, 7);
            instance.setValue(8, 8);
            instance.setValue(9, 9);
            instance.setValue(10, 10);
            instance.setValue(11, 11);
            instance.setValue(12, 12);
            instance.setValue(13, 13);
            instance.setValue(14, 14);
            instance.setValue(15, 15);
            instance.setValue(16, 16);
            instance.setValue(17, 17);
            instance.setValue(18, 18);
            instance.setValue(19, 19);
            instance.setValue(20, 20);
            instance.setValue(21, 21);
            instance.setValue(22, 22);
            instance.setValue(23, 23);
            instance.setValue(24, 24);
            instance.setValue(25, 25);
            instance.setValue(26, 26);
            instance.setValue(27, 27);
            instance.setValue(28, 28);
            instance.setValue(29, 29);
            instance.setValue(30, 30);
            instance.setValue(31, 31);
            instance.setValue(32, 32);
            instance.setValue(33, 33);
            instance.setValue(34, 34);
            instance.setValue(35, 35);
            instance.setValue(36, 36);
            instance.setValue(37, 37);
            instance.setValue(38
}