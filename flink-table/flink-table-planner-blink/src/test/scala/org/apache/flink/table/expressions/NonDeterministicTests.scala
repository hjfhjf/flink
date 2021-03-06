/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.expressions

import org.apache.flink.api.java.typeutils.RowTypeInfo
import org.apache.flink.table.expressions.utils.ExpressionTestBase
import org.apache.flink.types.Row
import org.junit.{Ignore, Test}

/**
  * Tests that can only be checked manually as they are non-deterministic.
  */
@Ignore
class NonDeterministicTests extends ExpressionTestBase {

  @Test
  def testCurrentDate(): Unit = {
    testSqlApi(
      "CURRENT_DATE",
      "PLEASE CHECK MANUALLY")
  }

  @Test
  def testCurrentTime(): Unit = {
    testSqlApi(
      "CURRENT_TIME",
      "PLEASE CHECK MANUALLY")
  }

  @Test
  def testCurrentTimestamp(): Unit = {
    testSqlApi(
      "CURRENT_TIMESTAMP",
      "PLEASE CHECK MANUALLY")
  }

  @Test
  def testLocalTimestamp(): Unit = {
    testSqlApi(
      "LOCALTIMESTAMP",
      "PLEASE CHECK MANUALLY")
  }

  @Test
  def testLocalTime(): Unit = {
    testSqlApi(
      "LOCALTIME",
      "PLEASE CHECK MANUALLY")
  }

  @Test
  def testUUID(): Unit = {
    testSqlApi(
      "UUID()",
      "PLEASE CHECK MANUALLY")
  }

  // ----------------------------------------------------------------------------------------------

  override def testData: Row = new Row(0)

  override def typeInfo: RowTypeInfo = new RowTypeInfo()
}
