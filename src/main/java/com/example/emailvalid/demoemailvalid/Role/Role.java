package com.example.emailvalid.demoemailvalid.Role;



import java.util.List;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.emailvalid.demoemailvalid.User.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "_user")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Role {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String name;
    
    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private List<User> users;

    public String getName()
    {
        return name;
    }
    
}
