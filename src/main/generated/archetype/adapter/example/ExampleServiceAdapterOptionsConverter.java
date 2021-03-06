/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package archetype.adapter.example;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link archetype.adapter.example.ExampleServiceAdapterOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link archetype.adapter.example.ExampleServiceAdapterOptions} original class using Vert.x codegen.
 */
 class ExampleServiceAdapterOptionsConverter {

   static void fromJson(JsonObject json, ExampleServiceAdapterOptions obj) {
    if (json.getValue("address") instanceof String) {
      obj.setAddress((String)json.getValue("address"));
    }
  }

   static void toJson(ExampleServiceAdapterOptions obj, JsonObject json) {
    if (obj.getAddress() != null) {
      json.put("address", obj.getAddress());
    }
  }
}