/*
 * Copyright (c) 2017 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package reactor.rabbitmq;

import java.util.Map;

/**
 *
 */
public class ExchangeSpecification {

    private String exchange;
    private String type = "direct";
    private boolean durable, autoDelete, internal;
    private Map<String, Object> arguments;

    public static ExchangeSpecification exchange() {
        return new ExchangeSpecification();
    }

    public ExchangeSpecification exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    public ExchangeSpecification type(String type) {
        this.type = type;
        return this;
    }

    public ExchangeSpecification durable(boolean durable) {
        this.durable = durable;
        return this;
    }

    public ExchangeSpecification autoDelete(boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    public ExchangeSpecification internal(boolean internal) {
        this.internal = internal;
        return this;
    }

    public ExchangeSpecification arguments(Map<String, Object> arguments) {
        this.arguments = arguments;
        return this;
    }

    public String getExchange() {
        return exchange;
    }

    public String getType() {
        return type;
    }

    public boolean isDurable() {
        return durable;
    }

    public boolean isAutoDelete() {
        return autoDelete;
    }

    public boolean isInternal() {
        return internal;
    }

    public Map<String, Object> getArguments() {
        return arguments;
    }
}
