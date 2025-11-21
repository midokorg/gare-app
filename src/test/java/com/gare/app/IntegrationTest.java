package com.gare.app;

import com.gare.app.config.AsyncSyncConfiguration;
import com.gare.app.config.EmbeddedElasticsearch;
import com.gare.app.config.EmbeddedKafka;
import com.gare.app.config.EmbeddedSQL;
import com.gare.app.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { GareApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
