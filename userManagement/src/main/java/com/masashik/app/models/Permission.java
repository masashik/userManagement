package com.masashik.app.models;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="permission")
public class Permission {

  @ManyToOne
  private User user;

  private @Id @GeneratedValue Long id;

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
