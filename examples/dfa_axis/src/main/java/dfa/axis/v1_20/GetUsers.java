// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.User;
import com.google.api.ads.dfa.axis.v1_20.UserRecordSet;
import com.google.api.ads.dfa.axis.v1_20.UserRemote;
import com.google.api.ads.dfa.axis.v1_20.UserSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays user name, ID, network ID, subnetwork ID, and user
 * group ID for the given search criteria. Results are limited to the first 10
 * records.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: user.getUsersByCriteria
 *
 * @author Joseph DiLallo
 */
public class GetUsers {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the user service.
    UserRemote userService = dfaServices.get(session, UserRemote.class);

    // Get users that match the search criteria.
    UserSearchCriteria userSearchCriteria = new UserSearchCriteria();
    userSearchCriteria.setSearchString(searchString);
    userSearchCriteria.setPageSize(10);
    UserRecordSet userRecordSet = userService.getUsersByCriteria(userSearchCriteria);

    // Display user names, IDs, network IDs, subnetwork IDs, and group IDs.
    if (userRecordSet.getRecords().length > 0) {
      for (User user: userRecordSet.getRecords()) {
        System.out.printf("User with name \"%s\", ID \"%s\", network ID \"%s\", subnetwork ID" +
           " \"%s\", and user role id \"%s\" was found.%n", user.getName(), user.getId(),
           user.getNetworkId(), user.getSubnetworkId(), user.getUserGroupId());
      }
    } else {
      System.out.println("No users found for your criteria.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session, SEARCH_STRING);
  }
}
