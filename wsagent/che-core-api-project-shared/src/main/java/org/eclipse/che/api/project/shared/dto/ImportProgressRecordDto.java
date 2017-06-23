/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.project.shared.dto;

import org.eclipse.che.api.project.shared.ImportProgressRecord;
import org.eclipse.che.dto.shared.DTO;

/**
 * DTO of {@link ImportProgressRecord}.
 *
 * @author Vlad Zhukovskyi
 * @since 5.9.0
 */
@DTO
public interface ImportProgressRecordDto extends ImportProgressRecord {
    void setNum(int num);

    ImportProgressRecordDto withNum(int num);

    void setLine(String line);

    ImportProgressRecordDto withLine(String line);

    void setProjectName(String projectName);

    ImportProgressRecordDto withProjectName(String projectName);
}
