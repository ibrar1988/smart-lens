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

package com.kevalpatel2106.smartlens.base;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by Keval on 20-Jul-17.
 */
@RunWith(AndroidJUnit4.class)
public class BaseViewPagerTest {
    private BaseViewPager mBaseViewPager;

    @Before
    public void init() throws Exception {
        mBaseViewPager = new BaseViewPager(InstrumentationRegistry.getTargetContext());
    }

    @Test
    public void setSwipeGestureEnable() throws Exception {
        mBaseViewPager.setSwipeGestureEnable(false);
        assertTrue(!mBaseViewPager.onInterceptTouchEvent(null));
        assertTrue(!mBaseViewPager.onTouchEvent(null));
    }

}