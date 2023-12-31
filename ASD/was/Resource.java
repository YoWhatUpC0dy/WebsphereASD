/*
 * Application Server Discovery v0.03
 * Resource.java
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

public abstract class Resource {

	private String id;
	private String name;
	private ArrayList<JDBCProvider> jdbcProviders;

	/*
	 * Node class constructor:
	 * 
	 * @id: Resource id.
	 * 
	 * @name: Resource name.
	 */
	public Resource(String id, String name) {
		setResourceId(id);
		setResourceName(name);
	}

	public String getId() {
		return id;
	}

	public void setResourceId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setResourceName(String name) {
		this.name = name;
	}

	public ArrayList<JDBCProvider> getJdbcProviders() {
		return jdbcProviders;
	}

	public void setJdbcProviders(ArrayList<JDBCProvider> jdbcProviders) {
		this.jdbcProviders = jdbcProviders;
	}
	
	public abstract void printResourceData(String profileName, String scope, String outputFormat);
}
