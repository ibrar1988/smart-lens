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

package com.kevalpatel2106.smartlens.tensorflow;

import android.content.Context;
import android.support.annotation.Nullable;

import com.kevalpatel2106.smartlens.utils.FileUtils;

import java.io.File;

/**
 * Created by Keval on 31-Jul-17.
 */
public final class TFUtils {
    private static final String TF_CACHE_DIRECTORY = "tensorflow";

    public static File getImageGraph(@Nullable Context context) {
        File dir = new File(FileUtils.getCacheDir(context).getAbsolutePath() + "/"
                + TF_CACHE_DIRECTORY);
        if (!dir.exists()) dir.mkdir();

        return new File(dir.getAbsolutePath() + "/"
                + "tensorflow_inception_graph.pb");
    }

    public static File getImageLabels(@Nullable Context context) {
        File dir = new File(FileUtils.getCacheDir(context).getAbsolutePath() + "/"
                + TF_CACHE_DIRECTORY);
        if (!dir.exists()) dir.mkdir();

        return new File(dir.getAbsolutePath() + "/"
                + "imagenet_comp_graph_label_strings.txt");
    }

    public static boolean isModelsDownloaded(Context context) {
        File dir = new File(FileUtils.getCacheDir(context).getAbsolutePath() + "/"
                + TF_CACHE_DIRECTORY);
        if (!dir.exists()) dir.mkdir();

        return new File(dir.getAbsolutePath() + "/"
                + "tensorflow_inception_graph.pb").exists()
                && new File(dir.getAbsolutePath() + "/"
                + "imagenet_comp_graph_label_strings.txt").exists();
    }
}