package com.masashik.app.models;

public class Permission {

  public enum LEVEL {ADMIN, ENHANCED, NORMAL};

  private LEVEL permittedLevel;
  private String grantedDate;

  public LEVEL getPermittedLevel() {
    return permittedLevel;
  }

  public void setPermittedLevel(LEVEL permittedLevel) {
    this.permittedLevel = permittedLevel;
  }

  public String getGrantedDate() {
    return grantedDate;
  }

  public void setGrantedDate(String grantedDate) {
    this.grantedDate = grantedDate;
  }

}
