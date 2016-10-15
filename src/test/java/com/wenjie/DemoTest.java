package com.wenjie;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.michelboudreau.alternator.AlternatorDB;
import com.michelboudreau.alternator.AlternatorDBClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    private AlternatorDBClient client;
    private DynamoDBMapper mapper;
    private AlternatorDB db;

    @Before
    public void setUp() throws Exception {
        this.client = new AlternatorDBClient();
        this.mapper = new DynamoDBMapper(this.client);
        this.db = new AlternatorDB().start();
    }

    @After
    public void tearDown() throws Exception {
        this.db.stop();
    }

    @Test
    public void test() {
        // Add test here that uses the mapper or the client
    }
}
