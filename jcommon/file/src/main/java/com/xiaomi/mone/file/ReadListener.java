/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiaomi.mone.file;

/**
 * @Author goodjava@qq.com
 * @Date 2021/6/22 12:28
 */
public interface ReadListener {

    void onEvent(ReadEvent event);

    boolean isContinue(String line);

    default boolean isBreak(String line) {
        return false;
    }

    default void setPointer(Object obj) {

    }

    default void saveProgress() {
    }

}
