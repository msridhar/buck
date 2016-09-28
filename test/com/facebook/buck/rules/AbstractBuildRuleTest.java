/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.rules;

import static org.junit.Assert.assertThat;

import com.facebook.buck.testutil.TargetGraphFactory;

import org.hamcrest.Matchers;
import org.junit.Test;

public class AbstractBuildRuleTest {

  @Test
  public void getTypeForAnonymousClass() {
    BuildRuleResolver resolver =
        new BuildRuleResolver(
            TargetGraphFactory.newInstance(),
            new DefaultTargetNodeToBuildRuleTransformer());
    SourcePathResolver pathResolver = new SourcePathResolver(resolver);
    NoopBuildRule noopBuildRule =
        new NoopBuildRule(new FakeBuildRuleParamsBuilder("//:rule").build(), pathResolver) {
        };
    assertThat(noopBuildRule.getType(), Matchers.equalTo("noop_build_rule"));
  }
}