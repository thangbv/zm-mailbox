/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2006, 2007, 2009, 2010, 2011, 2013, 2014, 2016, 2017, 2018 Synacor, Inc.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation,
 * version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.client.event;

import com.zimbra.client.ZItem;
import com.zimbra.client.ZSmartFolder;
import com.zimbra.common.service.ServiceException;

public class ZCreateSmartFolderEvent implements ZCreateItemEvent {

    protected ZSmartFolder smartFolder;

    public ZCreateSmartFolderEvent(ZSmartFolder smartFolder) throws ServiceException {
        this.smartFolder = smartFolder;
    }

    /**
     * @return tag id of created tag.
     * @throws com.zimbra.common.service.ServiceException
     */
    @Override
    public String getId() throws ServiceException {
        return smartFolder.getId();
    }

    @Override
    public ZItem getItem() throws ServiceException {
        return smartFolder;
    }

    public ZSmartFolder getSmartFolder() {
        return smartFolder;
    }

    @Override
    public String toString() {
        return smartFolder.toString();
    }
}