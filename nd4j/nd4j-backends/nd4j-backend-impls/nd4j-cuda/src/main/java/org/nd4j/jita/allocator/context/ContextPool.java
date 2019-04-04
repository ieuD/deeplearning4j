/*******************************************************************************
 * Copyright (c) 2015-2018 Skymind, Inc.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ******************************************************************************/

package org.nd4j.jita.allocator.context;

import org.nd4j.linalg.jcublas.context.CudaContext;

/**
 * This interface describes pool of CudaContext objects, used to execute kernels
 * @author raver119@gmail.com
 */
public interface ContextPool {
    /**
     * This method returns CudaContext for given device
     * @param deviceId
     * @return
     */
    CudaContext acquireContextForDevice(Integer deviceId);

    @Deprecated
    ContextPack acquireContextPackForDevice(Integer deviceId);

    /**
     * This method returns CudaContext to the pool for reuse
     * @param context
     */
    void releaseContext(CudaContext context);
}
