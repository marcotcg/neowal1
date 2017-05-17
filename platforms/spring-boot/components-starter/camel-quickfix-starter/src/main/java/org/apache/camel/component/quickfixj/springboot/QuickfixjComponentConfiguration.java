/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.quickfixj.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.quickfixj.QuickfixjConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;

/**
 * The quickfix component allows to send Financial Interchange (FIX) messages to
 * the QuickFix engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.quickfix")
public class QuickfixjComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use the given MessageFactory
     */
    @NestedConfigurationProperty
    private MessageFactory messageFactory;
    /**
     * To use the given LogFactory
     */
    @NestedConfigurationProperty
    private LogFactory logFactory;
    /**
     * To use the given MessageStoreFactory
     */
    @NestedConfigurationProperty
    private MessageStoreFactory messageStoreFactory;
    /**
     * To use the given map of pre configured QuickFix configurations mapped to
     * the key
     */
    private Map<String, QuickfixjConfiguration> configurations;
    /**
     * If set to true the engines will be created and started when needed (when
     * first message is send)
     */
    private Boolean lazyCreateEngines = false;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public MessageFactory getMessageFactory() {
        return messageFactory;
    }

    public void setMessageFactory(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public LogFactory getLogFactory() {
        return logFactory;
    }

    public void setLogFactory(LogFactory logFactory) {
        this.logFactory = logFactory;
    }

    public MessageStoreFactory getMessageStoreFactory() {
        return messageStoreFactory;
    }

    public void setMessageStoreFactory(MessageStoreFactory messageStoreFactory) {
        this.messageStoreFactory = messageStoreFactory;
    }

    public Map<String, QuickfixjConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(
            Map<String, QuickfixjConfiguration> configurations) {
        this.configurations = configurations;
    }

    public Boolean getLazyCreateEngines() {
        return lazyCreateEngines;
    }

    public void setLazyCreateEngines(Boolean lazyCreateEngines) {
        this.lazyCreateEngines = lazyCreateEngines;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}