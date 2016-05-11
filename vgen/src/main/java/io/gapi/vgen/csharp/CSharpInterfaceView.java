/* Copyright 2016 Google Inc
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
package io.gapi.vgen.csharp;

import com.google.api.tools.framework.model.Interface;
import com.google.api.tools.framework.model.ProtoFile;

import io.gapi.vgen.InterfaceView;

public class CSharpInterfaceView extends InterfaceView
    implements CSharpProtoElementView<Interface> {

  @Override
  public ProtoFile getNamespaceFile(Interface service) {
    return service.getFile();
  }
}