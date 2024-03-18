package com.julianescobar.solidprinciples.singleresponsabiity.followtheprinciple;


public class UserRepository {

  public void save(User user) {
    // Save user to database
  }

  public void update(User user) {
    // Update user to database
  }

  public void delete(User user) {
    // Delete user from database
  }

  public User findById(int id) {
    // Find user by id
    //return new User(1, "Julian", "julian@mail.com ", "123");
    return new User();
  }
}
