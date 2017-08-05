/*
 * Copyright 2017 Keval Patel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kevalpatel2106.smartlens.imageProcessors.barcode;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Keval Patel on 05/08/17.
 *
 * @author 'https://github.com/kevalpatel2106'
 */
public class GeoPointTest {

    @Test
    public void checkIfInitialize() {
        BarcodeInfo.GeoPoint geoPoint = new BarcodeInfo.GeoPoint(23.0225, 72.5714);
        Assert.assertEquals(geoPoint.getLat(), 23.0225);
        Assert.assertEquals(geoPoint.getLng(), 72.5714);
    }

}