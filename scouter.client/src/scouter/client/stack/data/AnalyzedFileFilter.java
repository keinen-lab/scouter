/*
 *  Copyright 2015 LG CNS.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package scouter.client.stack.data;

import java.io.File;
import java.io.FilenameFilter;

import scouter.client.stack.utils.StringUtils;


public class AnalyzedFileFilter implements FilenameFilter{
	private String m_ext = null;
	private String m_filename = null;

	public AnalyzedFileFilter(String filename, String ext){
		m_filename = StringUtils.getFilename(filename) + "_";
		m_ext = "." + ext;
	}
	
	public boolean accept(File directory, String filename) {
		if(filename.startsWith(m_filename) && filename.endsWith(m_ext))
			return true;
		return false;
	}
}
