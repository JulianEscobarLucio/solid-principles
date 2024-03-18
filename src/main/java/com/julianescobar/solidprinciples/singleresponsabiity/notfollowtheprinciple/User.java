package com.julianescobar.solidprinciples.singleresponsabiity.notfollowtheprinciple;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private int id;
    private String name;
    private String email;
    private String password;


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

    public void sendEmail(String email) {
        // Send email to user
    }

}
