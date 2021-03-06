/*
 * Copyright 2017-2021 Dromara.org
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

package org.dromara.hmily.tac.sqlparser.model.dialect.postgresql.dml;

import lombok.ToString;
import org.dromara.hmily.tac.sqlparser.model.common.statement.dml.HmilyUpdateStatement;
import org.dromara.hmily.tac.sqlparser.model.dialect.postgresql.HmilyPostgreSQLStatement;

/**
 * PostgreSQL update statement.
 */
@ToString
public final class HmilyPostgreSQLUpdateStatement extends HmilyUpdateStatement implements HmilyPostgreSQLStatement {
}
