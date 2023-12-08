/*
 * Copyright 2023 Ant Group CO., Ltd.
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

package com.antgroup.openspg.server.api.facade.dto.reasoner.request;

import com.antgroup.openspg.server.common.model.base.BaseRequest;
import com.antgroup.openspg.server.core.reasoner.model.service.BaseReasonerContent;
import java.util.Map;

public class ReasonerDslRunRequest extends BaseRequest {

  private Long projectId;

  private BaseReasonerContent content;

  private Map<String, Object> params;

  public BaseReasonerContent getContent() {
    return content;
  }

  public void setContent(BaseReasonerContent content) {
    this.content = content;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }
}