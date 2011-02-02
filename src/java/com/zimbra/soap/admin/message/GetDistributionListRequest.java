/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011 Zimbra, Inc.
 * 
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 * 
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.soap.admin.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zimbra.common.soap.AdminConstants;
import com.zimbra.soap.admin.type.AdminAttrsImpl;
import com.zimbra.soap.admin.type.DistributionListSelector;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name=AdminConstants.E_GET_DISTRIBUTION_LIST_REQUEST)
public class GetDistributionListRequest extends AdminAttrsImpl {

    @XmlAttribute(name=AdminConstants.A_LIMIT, required=false)
    private Integer limit;
    @XmlAttribute(name=AdminConstants.A_OFFSET, required=false)
    private Integer offset;
    @XmlAttribute(name=AdminConstants.A_SORT_ASCENDING, required=false)
    private Boolean sortAscending;
    @XmlElement(name=AdminConstants.E_DL, required=false)
    private DistributionListSelector dl;

    public GetDistributionListRequest() {
        this((DistributionListSelector) null,
            (Integer) null, (Integer) null, (Boolean) null);
    }

    public GetDistributionListRequest(DistributionListSelector dl) {
        this(dl, (Integer) null, (Integer) null, (Boolean) null);
    }

    public GetDistributionListRequest(DistributionListSelector dl,
            Integer limit, Integer offset, Boolean sortAscending) {
        setDl(dl);
        setLimit(limit);
        setOffset(offset);
        setSortAscending(sortAscending);
    }

    public void setDl(DistributionListSelector dl) { this.dl = dl; }
    public void setLimit(Integer limit) { this.limit = limit; }
    public void setOffset(Integer offset) { this.offset = offset; }
    public void setSortAscending(Boolean sortAscending) {
        this.sortAscending = sortAscending;
    }

    public DistributionListSelector getDl() { return dl; }
    public Integer getLimit() { return limit; }
    public Integer getOffset() { return offset; }
    public Boolean isSortAscending() { return sortAscending; }
}
