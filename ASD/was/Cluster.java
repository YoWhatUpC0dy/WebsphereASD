/*
 * Application Server Discovery v0.03
 * Cluster.java
 * Copyleft - 2016  Javier Dominguez Gomez
 * Written by C0dy
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package was;

import java.util.ArrayList;

public class Cluster {

	private String name;
	private String path;
	private String resourcesXml;
	private ArrayList<Jvm> jvms;
	private String scope;
	private ArrayList<Resource> resources;

	/*
	 * Cluster class constructor:
	 * 
	 * @name: Cluster name.
	 * 
	 * @cellPath: Cluster Cell path
	 * 
	 * @jvms: ArrayList with all Cluster jvms.
	 */
	public Cluster(String name, String cellPath, ArrayList<Jvm> jvms) {
		setName(name);
		setPath(cellPath);
		setResourcesXml();
		setJvms(jvms);
		setScope();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String cellPath) {
		path = cellPath + "/clusters/" + name;
	}

	public String getResourcesXml() {
		return resourcesXml;
	}

	public void setResourcesXml() {
		resourcesXml = path + "/resources.xml";
	}

	public ArrayList<Jvm> getJvms() {
		return jvms;
	}

	public void setJvms(ArrayList<Jvm> jvms) {
		this.jvms = jvms;
	}
	
	public String getScope() {
		return scope;
	}

	public void setScope() {
		scope = "Cluster: "+ getName();
	}

	public ArrayList<Resource> getResources() {
		return resources;
	}

	public void setResources(ArrayList<Resource> resources) {
		this.resources = resources;
	}

	/*
	 * Method that prints a Resources list:
	 * 
	 * @outputFormat: Can be csv or table.
	 */
	public void printResourcesData(String profileName, String outputFormat) {
		// Resources array iteration
		int index = 0;
		while (index < resources.size()) {
			Resource resource = resources.get(index);

			// For each Resource print data
			resource.printResourceData(profileName, scope, outputFormat);
			++index;
		}
	}
}
