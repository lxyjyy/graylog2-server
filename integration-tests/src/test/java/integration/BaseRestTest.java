/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package integration;

import org.junit.ClassRule;
import org.junit.Rule;

public class BaseRestTest extends BaseRestTestHelper {
    @ClassRule public static RunIfProperty runIfProperty = new RunIfProperty("gl2.integration.tests");
    @ClassRule public static RestAssuredSetupRule restAssuredSetupRule = new RestAssuredSetupRule();
    @Rule public RequiredVersionRule requiredVersionRule = new RequiredVersionRule(restAssuredSetupRule);
    @Rule public MongoDbSeedRule mongoDbSeedRule = new MongoDbSeedRule();
}
