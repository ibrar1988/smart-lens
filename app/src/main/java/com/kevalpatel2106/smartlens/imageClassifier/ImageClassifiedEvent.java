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

package com.kevalpatel2106.smartlens.imageClassifier;

import android.support.annotation.NonNull;

import com.kevalpatel2106.tensorflow.Classifier;

import java.util.List;

/**
 * Created by Keval Patel on 24/07/17.
 *
 * @author 'https://github.com/kevalpatel2106'
 */

public class ImageClassifiedEvent {

    private List<Classifier.Recognition> mRecognitions;

    private long timeStamp;

    public ImageClassifiedEvent(@NonNull List<Classifier.Recognition> recognitions) {
        mRecognitions = recognitions;
        this.timeStamp = System.currentTimeMillis();
    }

    public List<Classifier.Recognition> getRecognitions() {
        return mRecognitions;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
