/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.jms.config;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephane Nicoll
 */
public class JmsListenerContainerTestFactory implements JmsListenerContainerFactory<MessageListenerTestContainer> {

	private final List<MessageListenerTestContainer> containers =
			new ArrayList<MessageListenerTestContainer>();

	public List<MessageListenerTestContainer> getContainers() {
		return containers;
	}

	@Override
	public MessageListenerTestContainer createMessageListenerContainer(JmsListenerEndpoint endpoint) {
		MessageListenerTestContainer container = new MessageListenerTestContainer(endpoint);
		this.containers.add(container);
		return container;
	}

}
