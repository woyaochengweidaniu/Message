package result;

import domain.UserInfo;

/**
 * Created by jiacheo on 15/5/23.
 */
public class GetUserInfoResult extends ApiResultBase {

  private UserInfo user;

  public UserInfo getUser() {
    return user;
  }

  public void setUser(UserInfo user) {
    this.user = user;
  }
}
