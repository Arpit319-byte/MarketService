package com.example.MarketService.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="outcomes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Outcomes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    
}
