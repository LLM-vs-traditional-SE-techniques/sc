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


public class CodexTest_0_9_22 { 
  @Test
    /**
     * test case for Normalize.transform() and invert()
     * @throws Exception
     */
    public static void testNormalizeTransformAndInvert() throws Exception{
        System.out.println("Normalize transform and invert");
        Instances data = new Instances(new BufferedReader(new FileReader(TRAINING_DATA)));
        Instances testData = new Instances(new BufferedReader(new FileReader(TEST_DATA)));
        data.setClassIndex(data.numAttributes() - 1);
        testData.setClassIndex(testData.numAttributes() - 1);
        int size=data.numAttributes()-1;
        Normalize normalizer = new Normalize();
        normalizer.setInputFormat(data);
        Instances dataNorm = Filter.useFilter(data, normalizer);
        Instances testDataNorm = Filter.useFilter(testData, normalizer);
        //split each instance
        double[][] result=new double[2][size];
        double[][] input=new double[2][size];
        for(int i=0;i<data.numInstances();i++){
            if(!data.instance(i).equalHeaders(dataNorm.instance(i))){
                fail("Headers not equal");
            }
            for(int j=0;j<data.numAttributes()-1;j++){
                result[i][j]=dataNorm.instance(i).value(j);
                input[i][j]=data.instance(i).value(j);
            }
}