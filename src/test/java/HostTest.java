import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Copyright (c) 2021 Red Hat, Inc.
 *
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Red Hat trademarks are not licensed under GPLv3. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation.
 */
class HostTest {

  @Test
  void testEquality() {

    Host host0 = new Host();
    host0.setCoreCount(0);
    host0.setDisplayName("example.displayname.com");
    host0.setSocketCount(0);

    Host host1 = new Host();
    host1.setCoreCount(0);
    host1.setDisplayName("example.displayname.com");
    host1.setSocketCount(0);

    assertEquals(host0, host1);
  }

  @Test
  void testToStringFunction() {
    Host host0 = new Host();
    host0.setCoreCount(2);
    host0.setDisplayName("example.displayname.com");
    host0.setSocketCount(4);

    System.out.println(host0);

    String expected = "Host(displayName=example.displayname.com, socketCount=4, coreCount=2, hypervisor=false, isReportedViaConduit=false)";
    String actual = host0.toString();

    assertEquals(expected, actual);
  }

  @Test
  void testBooleanGeneratedMethods() {
    Host host0 = new Host();
    host0.setHypervisor(true);

    assertTrue(host0.isHypervisor());
  }

  @Test
  void testBooleanNonGenerated() {
    Host host0 = new Host();
    host0.setIsReportedViaConduit(true);

    assertTrue(host0.getIsReportedViaConduit());
  }
}
