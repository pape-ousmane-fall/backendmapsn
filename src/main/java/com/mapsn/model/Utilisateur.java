package com.mapsn.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
@Id
@GeneratedValue
	private Long id;
	private String username;
	private String password;
	@ManyToMany
    private List<Role> roles = new ArrayList<>();
}
