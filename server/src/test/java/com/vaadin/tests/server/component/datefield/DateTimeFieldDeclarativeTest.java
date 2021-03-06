/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.server.component.datefield;

import org.junit.Test;

import com.vaadin.tests.server.component.abstractdatefield.AbstractLocalDateTimeFieldDeclarativeTest;
import com.vaadin.ui.DateTimeField;

/**
 * Tests the declarative support for implementations of {@link DateTimeField}.
 *
 * @since 8.0
 * @author Vaadin Ltd
 */
public class DateTimeFieldDeclarativeTest
        extends AbstractLocalDateTimeFieldDeclarativeTest<DateTimeField> {

    @Test
    public void remainingAttributes()
            throws InstantiationException, IllegalAccessException {
        String placeholder = "foo";
        String assistiveText = "at";
        boolean textFieldEnabled = false;
        String design = String.format(
                "<%s placeholder='%s' "
                        + "assistive-text='%s' text-field-enabled='%s'/>",
                getComponentTag(), placeholder, assistiveText,
                textFieldEnabled);

        DateTimeField component = getComponentClass().newInstance();
        component.setPlaceholder(placeholder);
        component.setTextFieldEnabled(textFieldEnabled);
        component.setAssistiveText(assistiveText);

        testRead(design, component);
        testWrite(design, component);
    }

    @Override
    protected String getComponentTag() {
        return "vaadin-date-time-field";
    }

    @Override
    protected Class<? extends DateTimeField> getComponentClass() {
        return DateTimeField.class;
    }

}
