// This file is part of OpenTSDB.
// Copyright (C) 2017  The OpenTSDB Authors.
//
// This program is free software: you can redistribute it and/or modify it
// under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 2.1 of the License, or (at your
// option) any later version.  This program is distributed in the hope that it
// will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
// of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
// General Public License for more details.  You should have received a copy
// of the GNU Lesser General Public License along with this program.  If not,
// see <http://www.gnu.org/licenses/>.
package net.opentsdb.data;

import java.util.List;

import com.google.common.reflect.TypeToken;

import io.opentracing.Span;
import net.opentsdb.query.context.QueryContext;

/**
 * TODO - doc
 *
 * @param <T> The type of data this merger operates on.
 */
public interface DataMerger<T> {

  public TypeToken<?> type();
  
  public T merge(final List<T> data, 
                 final QueryContext context, 
                 final Span tracer_span);
}