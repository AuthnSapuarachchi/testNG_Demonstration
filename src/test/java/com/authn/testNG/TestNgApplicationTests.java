package com.authn.testNG;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SpringBootTest
class TestNgApplicationTests extends AbstractTestNGSpringContextTests {

    // 1. Setup Mechanism (Fixture)
    @BeforeMethod
    void setUp() {
        System.out.println("--- Initializing Quality Gate Environment ---");
    }

    // 2. The Core Test (Context Load + Assertion)
    @Test(description = "Verifies that the Spring context loads without failures")
    void contextLoads() {
        Assert.assertTrue(true, "Application context failed to initialize.");
    }

    // 3. Teardown Mechanism
    @AfterMethod
    void tearDown() {
        System.out.println("--- Cleaning up Environment ---");
    }

}
