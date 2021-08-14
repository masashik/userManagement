package com.masashik.app.models;

import java.util.Objects;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="user")
public class User {

  private @Id @GeneratedValue Long id;
  //private String id;
  private String firstName;
  private String lastName;
  private String birthDate;
  private String email;
  private String password;

  @OneToMany(mappedBy = "user")
  private List<Permission> permission;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Permission> getPermission() {
    return permission;
  }

  public void setPermission(List<Permission> permission) {
    this.permission = permission;
  }
}
