/**
 * Copyright (C) 2015 Red Hat, Inc. (jdcasey@commonjava.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.util.jhttpc.it.self;

import org.commonjava.util.jhttpc.it.root.AbstractRootSignedIT;
import org.junit.Test;

/**
 * Created by jdcasey on 11/2/15.
 */
public class SimpleSSLGet_Self_IT
        extends AbstractSelfSignedIT
{
    @Test
    public void run()
            throws Exception
    {
        super.simpleSSLGet();
    }
}
