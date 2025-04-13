package com.rainwater.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GatewayApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        assertThat(mongoTemplate).isNotNull();
    }

    @Test
    void testMongoConnection() {
        boolean databaseExists = mongoTemplate.getDb().getName().equals("rainwater_logs");
        assertThat(databaseExists).isTrue();
    }
}
