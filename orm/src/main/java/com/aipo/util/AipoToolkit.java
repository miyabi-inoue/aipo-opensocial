/*
 * Aipo is a groupware program developed by TOWN, Inc.
 * Copyright (C) 2004-2016 TOWN, Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aipo.util;

/**
 *
 */
public class AipoToolkit {

  public static SystemUser getSystemUser(String name) {
    SystemUser[] values = SystemUser.values();
    for (SystemUser systemUser : values) {
      if (systemUser.toString().equals(name)) {
        return systemUser;
      }
    }
    return null;
  }

  public static enum SystemUser {
    ADMIN("admin") {
      @Override
      public int getUserId() {
        return 1;
      }
    },
    TEMPLATE("template") {
      @Override
      public int getUserId() {
        return 2;
      }
    },
    ANON("anon") {
      @Override
      public int getUserId() {
        return 3;
      }
    };

    private final String value;

    private SystemUser(String value) {
      this.value = value;
    }

    public abstract int getUserId();

    @Override
    public String toString() {
      return this.value;
    }
  }

  private AipoToolkit() {

  }
}