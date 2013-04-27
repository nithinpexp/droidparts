/**
 * Copyright 2013 Alex Yanchenko
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.droidparts.net.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.util.Pair;

public abstract class DefaultFetchOptions implements ImageFetchOptions {

	// slow, supports transparency
	public static final Pair<CompressFormat, Integer> PNG = Pair.create(
			CompressFormat.PNG, 100);
	// fast
	public static final Pair<CompressFormat, Integer> JPEG = Pair.create(
			CompressFormat.JPEG, 80);

	@Override
	public String getCacheId() {
		return null;
	}

	@Override
	public Pair<CompressFormat, Integer> getCacheFormat(String mimeType) {
		if ("image/png".equals(mimeType)) {
			return PNG;
		} else {
			return JPEG;
		}
	}

	@Override
	public Config getConfigHint() {
		return null;
	}

	@Override
	public int getWidthHint() {
		return 0;
	}

	@Override
	public int getHeightHint() {
		return 0;
	}

	@Override
	public Bitmap reshape(Bitmap bm) {
		return bm;
	}

}