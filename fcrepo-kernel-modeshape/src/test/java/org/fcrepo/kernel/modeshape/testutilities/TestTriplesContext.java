/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.kernel.modeshape.testutilities;

import com.hp.hpl.jena.rdf.model.Resource;
import org.fcrepo.kernel.api.models.FedoraResource;
import org.fcrepo.kernel.api.identifiers.IdentifierConverter;
import org.fcrepo.kernel.api.rdf.DefaultRdfStream;

import static java.util.stream.Stream.of;
import static com.hp.hpl.jena.graph.NodeFactory.createLiteral;
import static com.hp.hpl.jena.graph.NodeFactory.createURI;
import static com.hp.hpl.jena.graph.Triple.create;

/**
 * @author cabeer
 * @since 9/16/14
 */
public class TestTriplesContext extends DefaultRdfStream {
    /**
     * Add a triple that says we've been there..
     * @param resource a FedoraResource
     * @param idTranslator an IdentifierConvertor
     */
    public TestTriplesContext(final FedoraResource resource,
                              final IdentifierConverter<Resource, FedoraResource> idTranslator) {
        super(createURI("subject"), of(create(createURI("MockTriplesContextClass"), createURI("isAThing"),
                        createLiteral("n"))));
    }
}
