package com.abhinath.dev.core.akasa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@ToString(exclude = "roles")
public class User {

    private Long id;
    private String username;
    private String name;
    @JsonIgnore
    private String password;
    private String email;
    private String contact;
    private Set<UserRole> roles = new HashSet<>();
    private String token;
    private boolean accountNonExpired;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id != null && id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
