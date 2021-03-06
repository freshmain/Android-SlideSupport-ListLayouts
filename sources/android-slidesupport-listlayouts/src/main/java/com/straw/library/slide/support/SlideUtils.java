/*
 * Copyright (C) 2015 Arno Zhang
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

package com.straw.library.slide.support;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.straw.library.slide.R;

public class SlideUtils {

    public static SlideSupportLayout createSlideLayout(
            SlideImplSupporter supporter, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SlideSupportLayout layout = (SlideSupportLayout) inflater.inflate(
                R.layout.layout_slide_support_layout, parent, false);
        layout.setSlideSupporter(supporter);

        return layout;
    }
}
