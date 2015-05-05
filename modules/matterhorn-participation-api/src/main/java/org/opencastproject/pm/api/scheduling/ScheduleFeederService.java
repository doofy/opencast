/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.opencastproject.pm.api.scheduling;

/**
 * Represents the Matterhorn schedule feeder service
 */
public interface ScheduleFeederService {

  /**
   * Initiates a synchronization process from the Matterhorn participation to the Matterhorn scheduler
   */
  void synchronize();

  /**
   * Clear all the events scheduled from the participation management in Matterhorn
   * 
   * @throws ParticipationManagementSchedulingException
   */
  void clearScheduledEvents() throws ParticipationManagementSchedulingException;

  /**
   * Clear all the series created from the participation management in Matterhorn
   * 
   * @throws ParticipationManagementSchedulingException
   */
  void clearSeries() throws ParticipationManagementSchedulingException;

}