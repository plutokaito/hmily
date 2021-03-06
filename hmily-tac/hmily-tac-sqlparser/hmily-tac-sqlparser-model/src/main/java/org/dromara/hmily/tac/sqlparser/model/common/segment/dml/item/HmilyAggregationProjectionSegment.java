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

package org.dromara.hmily.tac.sqlparser.model.common.segment.dml.item;

import lombok.Getter;
import lombok.Setter;
import org.dromara.hmily.tac.sqlparser.model.common.constant.HmilyAggregationType;
import org.dromara.hmily.tac.sqlparser.model.common.segment.generic.HmilyAliasAvailable;
import org.dromara.hmily.tac.sqlparser.model.common.segment.generic.HmilyAliasSegment;

import java.util.Optional;

/**
 * Aggregation projection segment.
 */
@Getter
public class HmilyAggregationProjectionSegment implements HmilyProjectionSegment, HmilyAliasAvailable {
    
    private final int startIndex;
    
    private final int stopIndex;
    
    private final HmilyAggregationType type;
    
    private final String innerExpression;
    
    @Setter
    private HmilyAliasSegment alias;
    
    public HmilyAggregationProjectionSegment(final int startIndex, final int stopIndex, final HmilyAggregationType type, final String innerExpression) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.type = type;
        this.innerExpression = innerExpression;
    }
    
    @Override
    public final Optional<String> getAlias() {
        return null == alias ? Optional.empty() : Optional.ofNullable(alias.getIdentifier().getValue());
    }
}
