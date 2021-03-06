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

package org.dromara.hmily.repository.spi.entity;

import com.google.common.base.Joiner;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * The type Hmily participant undo.
 *
 * @author xiaoyu
 */
@Data
@EqualsAndHashCode
@ToString
public final class HmilyParticipantUndo implements Serializable {
    
    private static final long serialVersionUID = 6869663782220867407L;
    
    /**
     * undo id.
     */
    private Long undoId;
    
    /**
     * participant id.
     */
    private Long participantId;
    
    /**
     * transaction id.
     */
    private Long transId;
    
    /**
     * resource id.
     */
    private String resourceId;
    
    /**
     * status.
     */
    private Integer status;
    
    /**
     * data snapshot.
     */
    private HmilyDataSnapshot dataSnapshot;
    
    /**
     * createTime.
     */
    private Date createTime;
    
    /**
     * updateTime.
     */
    private Date updateTime;
    
    public HmilyParticipantUndo() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }
    
    /**
     * Get hmily locks.
     *
     * @return hmily locks
     */
    public Collection<HmilyLock> getHmilyLocks() {
        return dataSnapshot.getTuples().stream()
            .map(tuple -> new HmilyLock(transId, participantId, resourceId, tuple.getTableName(), Joiner.on("_").join(tuple.getPrimaryKeyValues()))).collect(Collectors.toList());
    }
}
