package com.br.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;

@Configuration
public class KafkaAdminConfig {
	
    public KafkaProperties properties;
    
    public KafkaAdminConfig(KafkaProperties properties) {
        this.properties = properties;
    }
    
    @Bean
    public KafkaAdmin KafkaAdmin() {
        var configs = new HashMap<String, Object>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());
        return new KafkaAdmin(configs);
    }

    @Bean
    public KafkaAdmin.NewTopics topicsProjExTopic() {
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name("proj-ex-topic").partitions(2).replicas(1).build()
        );
    }

    @Bean
    public KafkaAdmin.NewTopics topicsProjExPayment() {
        return new KafkaAdmin.NewTopics(
                TopicBuilder.name("payment-ex-topic").partitions(1).replicas(1).build()
        );
    }

}
