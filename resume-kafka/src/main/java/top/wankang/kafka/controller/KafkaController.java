package top.wankang.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.wankang.kafka.producer.KafkaProducer;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/8/6 16:48
 */
@RequestMapping("kafka")
@Controller
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping("sendMsg")
    @ResponseBody
    public void sendMsg(){
        kafkaProducer.send("hello!!!!!!");
    }

}
