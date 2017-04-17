// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;
import java.util.Dictionary;

final class MyJSON implements JSON {
   private Dictionary<String, String> strings;
   private Dictionary<String, JSON>oObjects;
  @Override
  public JSON getObject(String name) {
    // TODO: implement this
    return null;
  }

  @Override
  public JSON setObject(String name, JSON value) {
    // TODO: implement this
   
    return this;
  }

  @Override
  public String getString(String name) {
    // TODO: implement this
    return strings.get(name);
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
    strings.put(name, value);
    return this;
  }

  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
    
  }
}
