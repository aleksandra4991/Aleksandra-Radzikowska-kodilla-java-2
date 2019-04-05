package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

        @Test
        public void testGetFileName() {
            //Given
            Logger.getInstance().log("Alex");
            //When
            String checkedLog  = Logger.getInstance().getLastLog();
            //Then
            Assert.assertEquals("Alex",checkedLog);
        }

}
