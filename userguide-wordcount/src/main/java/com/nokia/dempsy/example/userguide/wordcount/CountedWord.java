/*
 * Copyright 2012 the original author or authors.
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

package com.nokia.dempsy.example.userguide.wordcount;

import java.io.Serializable;

import com.nokia.dempsy.annotations.MessageKey;

public class CountedWord implements Serializable
{
   private static final long serialVersionUID = 1L;
   
   private long count;
   private String wordText;
   
   public CountedWord(String message, long count)
   {
      wordText = message;
      this.count = count;
   }
   
   public long getCount() { return count; }
   
   public String getWordText() { return wordText; }
   
   @MessageKey
   public Integer getKey() { return 1; }
   
   public String toString() { return wordText + ":" + count; }
}
