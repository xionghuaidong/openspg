/*
 * Copyright 2023 OpenSPG Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 */

package com.antgroup.openspg.cloudext.impl.searchengine.neo4j;

import com.antgroup.openspg.cloudext.interfaces.searchengine.SearchEngineClient;
import com.antgroup.openspg.cloudext.interfaces.searchengine.SearchEngineClientDriver;
import com.antgroup.openspg.cloudext.interfaces.searchengine.SearchEngineClientDriverManager;

public class Neo4jSearchClientDriver implements SearchEngineClientDriver {

  static {
    SearchEngineClientDriverManager.registerDriver(new Neo4jSearchClientDriver());
  }

  @Override
  public String driverScheme() {
    return "neo4j";
  }

  @Override
  public SearchEngineClient connect(String url) {
    return new Neo4jSearchClient(url);
  }
}
