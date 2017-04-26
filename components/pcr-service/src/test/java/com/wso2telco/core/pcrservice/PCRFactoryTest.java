package com.wso2telco.core.pcrservice;

import org.junit.Test;

import com.wso2telco.core.pcrservice.exception.PCRException;
import com.wso2telco.core.pcrservice.model.RequestDTO;

import junit.framework.TestCase;

/**
 * The class <code>PCRFactoryTest</code> contains tests for the class {@link
 * <code>PCRFactory</code>}
 *
 * @author yasith
 * @version $Revision$
 * @pattern JUnit Test Case
 * @generatedBy CodePro at 9/1/16 10:25 AM
 */
public class PCRFactoryTest extends TestCase {

    @Test
    public void testGenerateUUIDPcr() throws PCRException {

        PCRFactory pcrFactory = new PCRFactory();
        RequestDTO requestDTO = new RequestDTO("u1", "ax", "s1");
        PCRGeneratable pcrGeneratable = pcrFactory.getPCRGenarator();

        Returnable pcr = pcrGeneratable.getPCR(requestDTO);
        System.out.println(pcr.getID());
        //assertThat();
        assertEquals("p1", pcr.getID());
    }

    /**
     * Construct new test instance
     *
     * @param name the test name
     */
    public PCRFactoryTest(String name) {
        super(name);
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(PCRFactoryTest.class);
    }
}

/*$CPS$ This comment was generated by CodePro. Do not edit it.
 * patternId = com.instantiations.assist.eclipse.pattern.testCasePattern
 * strategyId = com.instantiations.assist.eclipse.pattern.testCasePattern.junitTestCase
 * additionalTestNames = 
 * assertTrue = false
 * callTestMethod = true
 * createMain = false
 * createSetUp = false
 * createTearDown = false
 * createTestFixture = false
 * createTestStubs = false
 * methods = 
 * package = com.wso2telco.core.pcrservice
 * package.sourceFolder = pcr-service/src/test/java
 * superclassType = junit.framework.TestCase
 * testCase = PCRFactoryTest
 * testClassType = PCRFactory
 */