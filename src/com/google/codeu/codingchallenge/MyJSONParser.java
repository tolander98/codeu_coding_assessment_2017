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

import java.io.IOException;

final class MyJSONParser implements JSONParser {
  private MyJSON json = new MyJSON();
  @Override
  public JSON parse(String in) throws IOException {
    // TODO: implement this
    while(in.indexOf(":") != -1){
      String pair = "";
      int comma = in.indexOf(",");
      if(comma >= 0){
         pair = in.substring(0, in.indexOf(","));
      }else{
         pair = in;
      }
      String x = "test";
      int keyQuote1 = pair.indexOf("\"");
      int keyQuote2 = pair.indexOf("\"", keyQuote1 + 1);
      String key = pair.substring(keyQuote1+1, keyQuote2);
      pair = pair.replace("\""+key+"\"", "");
      int valueQuote1 = pair.indexOf("\"");
      int valueQuote2 = pair.indexOf("\"", valueQuote1 + 1);
      String value = pair.substring(valueQuote1+1, valueQuote2);
      json.setString(key, value); 
      in = in.replace(in.substring(0,in.indexOf(",")), "");    
    }
    return json;
  }
}
