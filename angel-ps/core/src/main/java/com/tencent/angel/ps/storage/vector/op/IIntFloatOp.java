/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.ps.storage.vector.op;

import com.tencent.angel.ml.math2.vector.IntFloatVector;
import com.tencent.angel.ps.server.data.request.InitFunc;

/**
 * The operator for the storage that store <int, float> values
 */
public interface IIntFloatOp extends IIntKeyOp, IFloatValueOp {

  /**
   * Get element value use index
   *
   * @param index element index
   * @return element value
   */
  float get(int index);

  /**
   * Set element value
   *
   * @param index element index
   * @param value new element value
   */
  void set(int index, float value);

  /**
   * Get element values use indices
   *
   * @param indices element indices
   * @return element value
   */
  float[] get(int[] indices);

  /**
   * Set element values
   *
   * @param indices element indices
   * @param values new element values
   */
  void set(int[] indices, float[] values);

  /**
   * Add to the element
   *
   * @param index element index
   * @param value element update
   */
  void addTo(int index, float value);

  /**
   * Add to the elements
   *
   * @param indices element indices
   * @param values element updates
   */
  void addTo(int[] indices, float[] values);

  /**
   * Merge the elements to the given vector
   *
   * @param vector the merge destination vector
   */
  void mergeTo(IntFloatVector vector);

  /**
   * Get the element value, if the element does not exist, just init it use the function first
   *
   * @param index element index
   * @param func element initial function
   * @return element value
   */
  float initAndGet(int index, InitFunc func);
}
