//package com.kobe.service.config;
//
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.net.InetAddress;
//
///**
// * @author Kobe
// * @modified by
// * @Date 14:06 2019/2/15
// * @Description ElasticSearch配置
// */
//@Configuration
//public class ElasticSearchConfig {
//    /**
//     * 防止netty的bug
//     * java.lang.IllegalStateException: availableProcessors is already set to [4], rejecting [4]
//     */
//    @PostConstruct
//    void init() {
//        System.setProperty("es.set.netty.runtime.available.processors", "false");
//    }
//
//
//    @Bean
//    public TransportClient getEsClient() throws Exception {
//        //测试环境
//        //Settings settings = Settings.builder().put("cluster.name", "jiesi-5.4").build();// 集群名
//        //client  = new PreBuiltTransportClient(settings).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.182.12"), 20101));
//        //本机环境
//        Settings settings = Settings.builder().put("cluster.name", "elasticsearch").build();// 集群名
//        TransportClient client = new PreBuiltTransportClient(settings)
//                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
//
//        return client;
//    }
//}