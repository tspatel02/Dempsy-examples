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

package com.nokia.dempsy.example.simplewordcount.mp;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;

import com.nokia.dempsy.annotations.MessageHandler;
import com.nokia.dempsy.annotations.MessageProcessor;
import com.nokia.dempsy.example.simplewordcount.message.Word;
import com.nokia.dempsy.example.simplewordcount.message.WordCount;


package com.nokia.dempsy.example.simplewordcount.message;

import java.io.Serializable;

import com.nokia.dempsy.annotations.MessageKey;

public class Letter implements Serializable
{
   private static final long serialVersionUID = 1L;
   
   private Character character;
   
   public Letter(Character character)
   {
      this.character = character;
   }
   
   @MessageKey
   public Character getLetterKey()
   {
      return this.character;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((character == null) ? 0 : character.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if(this == obj)
         return true;
      if(obj == null)
         return false;
      if(getClass() != obj.getClass())
         return false;
      Letter other = (Letter)obj;
      if(character == null)
      {
         if(other.character != null)
            return false;
      }
      else if(!character.equals(other.character))
         return false;
      return true;
   }
   
   @Override
   public String toString()
   {
      return this.character!=null?this.character.toString():null;
   }
}