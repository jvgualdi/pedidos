package tec.jvgualdi.pedidos_ms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import tec.jvgualdi.pedidos_ms.dto.OrderCreatedEvent;

// RabbitMQ desativado - testando o serviço isolado. Implementação original comentada abaixo.
@Component
public class OrderPublisher {

    private static final Logger log = LoggerFactory.getLogger(OrderPublisher.class);

    public void publish(OrderCreatedEvent order) {
        log.info("RabbitMQ desativado - evento não publicado: {}", order);
    }

//    private final RabbitTemplate rabbitTemplate;
//    @Value("${spring.rabbitmq.queue}")
//    private String queueName;
//
//    public OrderPublisher(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public void publish(OrderCreatedEvent order) {
//        rabbitTemplate.convertAndSend(queueName, order);
//    }
}
