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

package com.kevalpatel2106.smartlens.wikipage;

import android.content.Context;

import com.kevalpatel2106.smartlens.base.BaseRetrofitBuilder;

import io.reactivex.annotations.NonNull;

/**
 * Created by Keval Patel on 23/07/17.
 *
 * @author 'https://github.com/kevalpatel2106'
 */

public class WikiRetrofitBuilder extends BaseRetrofitBuilder {
    public WikiRetrofitBuilder(@NonNull Context context) {
        super(context);
    }

    @Override
    protected String getBaseUrl() {
        return "https://en.wikipedia.org/w/";
    }

    public WikiService getApiService() {
        return getRetrofitBuilder(false, 0)
                .create(WikiService.class);
    }

    public WikiService getApiService(boolean isCacheEnable,
                                     int cacheTimeSeconds) {
        return getRetrofitBuilder(isCacheEnable, cacheTimeSeconds)
                .create(WikiService.class);
    }
}
